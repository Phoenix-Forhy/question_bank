package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ArabidopsisThaliana;
import com.ruoyi.system.service.IArabidopsisThalianaService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 第一个Controller
 * 
 * @author ruoyi
 * @date 2024-05-17
 */
@RestController
@RequestMapping("/system/thaliana")
public class ArabidopsisThalianaController extends BaseController
{
    @Autowired
    private IArabidopsisThalianaService arabidopsisThalianaService;

    /**
     * 查询第一个列表
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:list')")
    @GetMapping("/list")
    public TableDataInfo list(ArabidopsisThaliana arabidopsisThaliana)
    {
        startPage();
        List<ArabidopsisThaliana> list = arabidopsisThalianaService.selectArabidopsisThalianaList(arabidopsisThaliana);
        return getDataTable(list);
    }

    /**
     * 导出第一个列表
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:export')")
    @Log(title = "第一个", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ArabidopsisThaliana arabidopsisThaliana)
    {
        List<ArabidopsisThaliana> list = arabidopsisThalianaService.selectArabidopsisThalianaList(arabidopsisThaliana);
        ExcelUtil<ArabidopsisThaliana> util = new ExcelUtil<ArabidopsisThaliana>(ArabidopsisThaliana.class);
        util.exportExcel(response, list, "第一个数据");
    }

    /**
     * 获取第一个详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:query')")
    @GetMapping(value = "/{pathway}")
    public AjaxResult getInfo(@PathVariable("pathway") String pathway)
    {
        return success(arabidopsisThalianaService.selectArabidopsisThalianaByPathway(pathway));
    }

    /**
     * 新增第一个
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:add')")
    @Log(title = "第一个", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ArabidopsisThaliana arabidopsisThaliana)
    {
        return toAjax(arabidopsisThalianaService.insertArabidopsisThaliana(arabidopsisThaliana));
    }

    /**
     * 修改第一个
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:edit')")
    @Log(title = "第一个", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ArabidopsisThaliana arabidopsisThaliana)
    {
        return toAjax(arabidopsisThalianaService.updateArabidopsisThaliana(arabidopsisThaliana));
    }

    /**
     * 删除第一个
     */
    @PreAuthorize("@ss.hasPermi('system:thaliana:remove')")
    @Log(title = "第一个", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pathways}")
    public AjaxResult remove(@PathVariable String[] pathways)
    {
        return toAjax(arabidopsisThalianaService.deleteArabidopsisThalianaByPathways(pathways));
    }
}
