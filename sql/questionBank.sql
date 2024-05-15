

-- 试题表
CREATE TABLE `sys_questions` (
                                 `question_id` INT AUTO_INCREMENT PRIMARY KEY,
                                 `question_content` TEXT NOT NULL,
    -- 其他试题相关信息
);

-- 知识点表
CREATE TABLE `knowledge_points` (
                                    `knowledge_id` INT AUTO_INCREMENT PRIMARY KEY,
                                    `knowledge_name` VARCHAR(255) NOT NULL,
    -- 其他知识点相关信息
);

-- 知识点关联表，用于存储知识点之间的关联
CREATE TABLE `knowledge_relations` (
                                       `relation_id` INT AUTO_INCREMENT PRIMARY KEY,
                                       `knowledge_id_1` INT NOT NULL,
                                       `knowledge_id_2` INT NOT NULL,
    -- 其他关联信息
                                       FOREIGN KEY (`knowledge_id_1`) REFERENCES `knowledge_points` (`knowledge_id`),
                                       FOREIGN KEY (`knowledge_id_2`) REFERENCES `knowledge_points` (`knowledge_id`)
);

-- 试题知识点关联表
CREATE TABLE `question_knowledge` (
                                      `question_id` INT NOT NULL,
                                      `knowledge_id` INT NOT NULL,
    -- 其他关联信息
                                      FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`),
                                      FOREIGN KEY (`knowledge_id`) REFERENCES `knowledge_points` (`knowledge_id`)
);

-- 作业表
CREATE TABLE `assignments` (
                               `assignment_id` INT AUTO_INCREMENT PRIMARY KEY,
                               `user_id` INT NOT NULL,
                               `due_date` DATETIME NOT NULL,
    -- 其他作业相关信息
                               FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
);

-- 作业试题关联表
CREATE TABLE `assignment_questions` (
                                        `assignment_id` INT NOT NULL,
                                        `question_id` INT NOT NULL,
    -- 其他关联信息
                                        FOREIGN KEY (`assignment_id`) REFERENCES `assignments` (`assignment_id`),
                                        FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`)
);

-- 错题记录表
CREATE TABLE `wrong_records` (
                                 `record_id` INT AUTO_INCREMENT PRIMARY KEY,
                                 `user_id` INT NOT NULL,
                                 `question_id` INT NOT NULL,
                                 `wrong_time` DATETIME NOT NULL,
    -- 其他错题记录相关信息
                                 FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
                                 FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`)
);

-- 用户角色关联表
CREATE TABLE `user_roles` (
                              `user_id` INT NOT NULL,
                              `role_id` INT NOT NULL,
    -- 其他关联信息
                              FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
                              FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`)
);

-- 用户班级关联表
CREATE TABLE `user_classes` (
                                `user_id` INT NOT NULL,
                                `class_id` INT NOT NULL,
    -- 其他关联信息
                                FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
                                FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`)
);

-- 作业发布记录表
CREATE TABLE `assignment_releases` (
                                       `release_id` INT AUTO_INCREMENT PRIMARY KEY,
                                       `assignment_id` INT NOT NULL,
                                       `publish_time` DATETIME NOT NULL,
                                       `publish_user_id` INT NOT NULL, -- 表示发布作业的用户，可能是教师或管理员
    -- 其他发布记录相关信息
                                       FOREIGN KEY (`assignment_id`) REFERENCES `assignments` (`assignment_id`),
                                       FOREIGN KEY (`publish_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 提交记录表
CREATE TABLE `submissions` (
                               `submission_id` INT AUTO_INCREMENT PRIMARY KEY,
                               `user_id` INT NOT NULL, -- 提交者的用户ID
                               `release_id` INT NOT NULL, -- 关联的作业发布记录ID
                               `question_id` INT NOT NULL, -- 关联的试题ID
                               `answer_content` TEXT NOT NULL, -- 富文本存储题目作答内容
                               `submission_time` DATETIME NOT NULL,
    -- 其他提交记录相关信息
                               FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
                               FOREIGN KEY (`release_id`) REFERENCES `assignment_releases` (`release_id`),
                               FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;