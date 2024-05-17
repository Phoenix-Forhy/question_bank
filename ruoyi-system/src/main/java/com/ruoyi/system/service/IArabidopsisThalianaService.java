package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ArabidopsisThaliana;

/**
 * 第一个Service接口
 * 
 * @author ruoyi
 * @date 2024-05-17
 */
public interface IArabidopsisThalianaService 
{
    /**
     * 查询第一个
     * 
     * @param pathway 第一个主键
     * @return 第一个
     */
    public ArabidopsisThaliana selectArabidopsisThalianaByPathway(String pathway);

    /**
     * 查询第一个列表
     * 
     * @param arabidopsisThaliana 第一个
     * @return 第一个集合
     */
    public List<ArabidopsisThaliana> selectArabidopsisThalianaList(ArabidopsisThaliana arabidopsisThaliana);

    /**
     * 新增第一个
     * 
     * @param arabidopsisThaliana 第一个
     * @return 结果
     */
    public int insertArabidopsisThaliana(ArabidopsisThaliana arabidopsisThaliana);

    /**
     * 修改第一个
     * 
     * @param arabidopsisThaliana 第一个
     * @return 结果
     */
    public int updateArabidopsisThaliana(ArabidopsisThaliana arabidopsisThaliana);

    /**
     * 批量删除第一个
     * 
     * @param pathways 需要删除的第一个主键集合
     * @return 结果
     */
    public int deleteArabidopsisThalianaByPathways(String[] pathways);

    /**
     * 删除第一个信息
     * 
     * @param pathway 第一个主键
     * @return 结果
     */
    public int deleteArabidopsisThalianaByPathway(String pathway);
}
