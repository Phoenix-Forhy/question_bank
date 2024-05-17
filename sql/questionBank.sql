

CREATE TABLE `sys_knowledge_point` (
    `knowledge_points_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '知识点id',
    `knowledge_points_code` VARCHAR(255) NOT NULL COMMENT '知识点编码',
    `knowledge_points_name` VARCHAR(255) NOT NULL COMMENT '知识点名称',
    `knowledge_points_content` BLOB COMMENT '知识点内容（富文本）',
    `create_by` VARCHAR(255) NOT NULL COMMENT '创建人',
    `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL COMMENT '创建时间',
    `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
    `del_flag` CHAR(1) NOT NULL DEFAULT '0' COMMENT '删除标记，0未删除，1已删除',
    PRIMARY KEY (`knowledge_points_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='知识点表';

CREATE TABLE `sys_question` (
    `question_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '试题id',
    `question_code` VARCHAR(255) NOT NULL COMMENT '试题编码',
    `question_name` VARCHAR(255) NOT NULL COMMENT '试题名称',
    `question_content` BLOB COMMENT '试题内容（富文本）',
    `create_by` VARCHAR(255) NOT NULL COMMENT '创建人',
    `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL COMMENT '创建时间',
    `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
    `del_flag` CHAR(1) NOT NULL DEFAULT '0' COMMENT '删除标记，0未删除，1已删除',
    PRIMARY KEY (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='试题表';

CREATE TABLE `sys_question_knowledge_point` (
    `question_id` BIGINT NOT NULL,
    `knowledge_points_id` BIGINT NOT NULL,
    PRIMARY KEY (`question_id`, `knowledge_points_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='知识点试题关联表';

CREATE TABLE `sys_knowledge_point_related` (
    `knowledge_points_id_1` BIGINT NOT NULL,
    `knowledge_points_id_2` BIGINT NOT NULL,
    PRIMARY KEY (`knowledge_points_id_1`, `knowledge_points_id_2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='知识点关联表';


CREATE TABLE `sys_task` (
    `task_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '题单id',
    `task_code` BIGINT NOT NULL COMMENT '题单编号',
    `task_name` VARCHAR(255) NOT NULL COMMENT '题单名',
    `create_by` VARCHAR(255) NOT NULL COMMENT '创建人',
    `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL COMMENT '创建时间',
    `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
    `del_flag` CHAR(1) NOT NULL DEFAULT '0' COMMENT '删除标记，0未删除，1已删除',
    PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题单表';

CREATE TABLE `sys_task_question` (
     `task_id` BIGINT NOT NULL COMMENT '题单id',
     `question_id` BIGINT NOT NULL COMMENT '试题id',
     PRIMARY KEY (`task_id`, `question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题单试题关联表';

CREATE TABLE `sys_release` (
    `release_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '发放记录id',
    `release_code` BIGINT NOT NULL COMMENT '发放记录编号',
    `task_id` BIGINT NOT NULL COMMENT '题单id',
    `create_by` VARCHAR(255) NOT NULL COMMENT '创建人',
    `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL COMMENT '创建时间',
    `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
    `del_flag` CHAR(1) NOT NULL DEFAULT '0' COMMENT '删除标记，0未删除，1已删除',
    PRIMARY KEY (`release_id`),
    UNIQUE KEY `unique_release_code` (`release_code`), -- 假设发放记录编号是唯一的
    INDEX `idx_task_id` (`task_id`) -- 为题单id创建索引，优化关联查询
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题单发放记录表';

CREATE TABLE `sys_release_user` (
    `release_id` BIGINT NOT NULL COMMENT '发放记录id',
    `user_id` BIGINT NOT NULL COMMENT '用户id',
    PRIMARY KEY (`release_id`, `user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='发放记录用户关联表';


CREATE TABLE `sys_question_records` (
    `question_records_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '做题记录id',
    `release_id` BIGINT NOT NULL COMMENT '发放记录表id',
    `question_id` BIGINT NOT NULL COMMENT '试题id',
    `user_id` BIGINT NOT NULL COMMENT '用户id',
    `question_records_content` BLOB COMMENT '富文本内容',
    `check_flag` INT NOT NULL COMMENT '0未完成，1已提交，2正确，3错误',
    `create_by` VARCHAR(255) NOT NULL COMMENT '创建人',
    `update_by` VARCHAR(255) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL COMMENT '创建时间',
    `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
    `del_flag` CHAR(1) NOT NULL DEFAULT '0' COMMENT '删除标记，0未删除，1已删除',
    PRIMARY KEY (`question_records_id`),
    INDEX `idx_release_id` (`release_id`),
    INDEX `idx_question_id` (`question_id`),
    INDEX `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='做题记录表';

CREATE TABLE `sys_wrong_records` (
     `question_records_id` BIGINT NOT NULL COMMENT '做题记录id',
     `knowledge_points_id` BIGINT NOT NULL COMMENT '知识点id',
     PRIMARY KEY (`question_records_id`, `knowledge_points_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='做题记录错误知识点关联表';