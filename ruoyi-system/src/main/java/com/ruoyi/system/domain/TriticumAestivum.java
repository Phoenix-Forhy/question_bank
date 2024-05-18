package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 第二个对象 triticum_aestivum
 * 
 * @author ljq
 * @date 2024-05-17
 */
public class TriticumAestivum
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pathway;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal bgRatio;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal geneRatio;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal pvalue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal bonferroni;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String genes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal fdr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal benjamini;

    public void setPathway(String pathway) 
    {
        this.pathway = pathway;
    }

    public String getPathway() 
    {
        return pathway;
    }
    public void setCount(Long count) 
    {
        this.count = count;
    }

    public Long getCount() 
    {
        return count;
    }
    public void setBgRatio(BigDecimal bgRatio) 
    {
        this.bgRatio = bgRatio;
    }

    public BigDecimal getBgRatio() 
    {
        return bgRatio;
    }
    public void setGeneRatio(BigDecimal geneRatio) 
    {
        this.geneRatio = geneRatio;
    }

    public BigDecimal getGeneRatio() 
    {
        return geneRatio;
    }
    public void setPvalue(BigDecimal pvalue) 
    {
        this.pvalue = pvalue;
    }

    public BigDecimal getPvalue() 
    {
        return pvalue;
    }
    public void setBonferroni(BigDecimal bonferroni) 
    {
        this.bonferroni = bonferroni;
    }

    public BigDecimal getBonferroni() 
    {
        return bonferroni;
    }
    public void setGenes(String genes) 
    {
        this.genes = genes;
    }

    public String getGenes() 
    {
        return genes;
    }
    public void setFdr(BigDecimal fdr) 
    {
        this.fdr = fdr;
    }

    public BigDecimal getFdr() 
    {
        return fdr;
    }
    public void setBenjamini(BigDecimal benjamini) 
    {
        this.benjamini = benjamini;
    }

    public BigDecimal getBenjamini() 
    {
        return benjamini;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pathway", getPathway())
            .append("count", getCount())
            .append("bgRatio", getBgRatio())
            .append("geneRatio", getGeneRatio())
            .append("pvalue", getPvalue())
            .append("bonferroni", getBonferroni())
            .append("genes", getGenes())
            .append("fdr", getFdr())
            .append("benjamini", getBenjamini())
            .toString();
    }
}
