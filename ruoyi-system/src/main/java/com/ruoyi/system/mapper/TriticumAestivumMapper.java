package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TriticumAestivum;

/**
 * 第二个Mapper接口
 * 
 * @author ljq
 * @date 2024-05-17
 */
public interface TriticumAestivumMapper 
{
    /**
     * 查询第二个
     * 
     * @param pathway 第二个主键
     * @return 第二个
     */
    public TriticumAestivum selectTriticumAestivumByPathway(String pathway);

    /**
     * 查询第二个列表
     * 
     * @param triticumAestivum 第二个
     * @return 第二个集合
     */
    public List<TriticumAestivum> selectTriticumAestivumList(TriticumAestivum triticumAestivum);

    /**
     * 新增第二个
     * 
     * @param triticumAestivum 第二个
     * @return 结果
     */
    public int insertTriticumAestivum(TriticumAestivum triticumAestivum);

    /**
     * 修改第二个
     * 
     * @param triticumAestivum 第二个
     * @return 结果
     */
    public int updateTriticumAestivum(TriticumAestivum triticumAestivum);

    /**
     * 删除第二个
     * 
     * @param pathway 第二个主键
     * @return 结果
     */
    public int deleteTriticumAestivumByPathway(String pathway);

    /**
     * 批量删除第二个
     * 
     * @param pathways 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTriticumAestivumByPathways(String[] pathways);
}
