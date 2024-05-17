package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ArabidopsisThalianaMapper;
import com.ruoyi.system.domain.ArabidopsisThaliana;
import com.ruoyi.system.service.IArabidopsisThalianaService;

/**
 * 第一个Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-17
 */
@Service
public class ArabidopsisThalianaServiceImpl implements IArabidopsisThalianaService 
{
    @Autowired
    private ArabidopsisThalianaMapper arabidopsisThalianaMapper;

    /**
     * 查询第一个
     * 
     * @param pathway 第一个主键
     * @return 第一个
     */
    @Override
    public ArabidopsisThaliana selectArabidopsisThalianaByPathway(String pathway)
    {
        return arabidopsisThalianaMapper.selectArabidopsisThalianaByPathway(pathway);
    }

    /**
     * 查询第一个列表
     * 
     * @param arabidopsisThaliana 第一个
     * @return 第一个
     */
    @Override
    public List<ArabidopsisThaliana> selectArabidopsisThalianaList(ArabidopsisThaliana arabidopsisThaliana)
    {
        return arabidopsisThalianaMapper.selectArabidopsisThalianaList(arabidopsisThaliana);
    }

    /**
     * 新增第一个
     * 
     * @param arabidopsisThaliana 第一个
     * @return 结果
     */
    @Override
    public int insertArabidopsisThaliana(ArabidopsisThaliana arabidopsisThaliana)
    {
        return arabidopsisThalianaMapper.insertArabidopsisThaliana(arabidopsisThaliana);
    }

    /**
     * 修改第一个
     * 
     * @param arabidopsisThaliana 第一个
     * @return 结果
     */
    @Override
    public int updateArabidopsisThaliana(ArabidopsisThaliana arabidopsisThaliana)
    {
        return arabidopsisThalianaMapper.updateArabidopsisThaliana(arabidopsisThaliana);
    }

    /**
     * 批量删除第一个
     * 
     * @param pathways 需要删除的第一个主键
     * @return 结果
     */
    @Override
    public int deleteArabidopsisThalianaByPathways(String[] pathways)
    {
        return arabidopsisThalianaMapper.deleteArabidopsisThalianaByPathways(pathways);
    }

    /**
     * 删除第一个信息
     * 
     * @param pathway 第一个主键
     * @return 结果
     */
    @Override
    public int deleteArabidopsisThalianaByPathway(String pathway)
    {
        return arabidopsisThalianaMapper.deleteArabidopsisThalianaByPathway(pathway);
    }
}
