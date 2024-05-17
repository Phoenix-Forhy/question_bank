package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TriticumAestivumMapper;
import com.ruoyi.system.domain.TriticumAestivum;
import com.ruoyi.system.service.ITriticumAestivumService;

/**
 * 第二个Service业务层处理
 * 
 * @author ljq
 * @date 2024-05-17
 */
@Service
public class TriticumAestivumServiceImpl implements ITriticumAestivumService 
{
    @Autowired
    private TriticumAestivumMapper triticumAestivumMapper;

    /**
     * 查询第二个
     * 
     * @param pathway 第二个主键
     * @return 第二个
     */
    @Override
    public TriticumAestivum selectTriticumAestivumByPathway(String pathway)
    {
        return triticumAestivumMapper.selectTriticumAestivumByPathway(pathway);
    }

    /**
     * 查询第二个列表
     * 
     * @param triticumAestivum 第二个
     * @return 第二个
     */
    @Override
    public List<TriticumAestivum> selectTriticumAestivumList(TriticumAestivum triticumAestivum)
    {
        return triticumAestivumMapper.selectTriticumAestivumList(triticumAestivum);
    }

    /**
     * 新增第二个
     * 
     * @param triticumAestivum 第二个
     * @return 结果
     */
    @Override
    public int insertTriticumAestivum(TriticumAestivum triticumAestivum)
    {
        return triticumAestivumMapper.insertTriticumAestivum(triticumAestivum);
    }

    /**
     * 修改第二个
     * 
     * @param triticumAestivum 第二个
     * @return 结果
     */
    @Override
    public int updateTriticumAestivum(TriticumAestivum triticumAestivum)
    {
        return triticumAestivumMapper.updateTriticumAestivum(triticumAestivum);
    }

    /**
     * 批量删除第二个
     * 
     * @param pathways 需要删除的第二个主键
     * @return 结果
     */
    @Override
    public int deleteTriticumAestivumByPathways(String[] pathways)
    {
        return triticumAestivumMapper.deleteTriticumAestivumByPathways(pathways);
    }

    /**
     * 删除第二个信息
     * 
     * @param pathway 第二个主键
     * @return 结果
     */
    @Override
    public int deleteTriticumAestivumByPathway(String pathway)
    {
        return triticumAestivumMapper.deleteTriticumAestivumByPathway(pathway);
    }
}
