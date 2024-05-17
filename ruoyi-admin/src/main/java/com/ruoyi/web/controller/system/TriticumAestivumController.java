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
import com.ruoyi.system.domain.TriticumAestivum;
import com.ruoyi.system.service.ITriticumAestivumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 第二个Controller
 * 
 * @author ljq
 * @date 2024-05-17
 */
@RestController
@RequestMapping("/system/aestivum")
public class TriticumAestivumController extends BaseController
{
    @Autowired
    private ITriticumAestivumService triticumAestivumService;

    /**
     * 查询第二个列表
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:list')")
    @GetMapping("/list")
    public TableDataInfo list(TriticumAestivum triticumAestivum)
    {
        startPage();
        List<TriticumAestivum> list = triticumAestivumService.selectTriticumAestivumList(triticumAestivum);
        return getDataTable(list);
    }

    /**
     * 导出第二个列表
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:export')")
    @Log(title = "第二个", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TriticumAestivum triticumAestivum)
    {
        List<TriticumAestivum> list = triticumAestivumService.selectTriticumAestivumList(triticumAestivum);
        ExcelUtil<TriticumAestivum> util = new ExcelUtil<TriticumAestivum>(TriticumAestivum.class);
        util.exportExcel(response, list, "第二个数据");
    }

    /**
     * 获取第二个详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:query')")
    @GetMapping(value = "/{pathway}")
    public AjaxResult getInfo(@PathVariable("pathway") String pathway)
    {
        return success(triticumAestivumService.selectTriticumAestivumByPathway(pathway));
    }

    /**
     * 新增第二个
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:add')")
    @Log(title = "第二个", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TriticumAestivum triticumAestivum)
    {
        return toAjax(triticumAestivumService.insertTriticumAestivum(triticumAestivum));
    }

    /**
     * 修改第二个
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:edit')")
    @Log(title = "第二个", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TriticumAestivum triticumAestivum)
    {
        return toAjax(triticumAestivumService.updateTriticumAestivum(triticumAestivum));
    }

    /**
     * 删除第二个
     */
    @PreAuthorize("@ss.hasPermi('system:aestivum:remove')")
    @Log(title = "第二个", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pathways}")
    public AjaxResult remove(@PathVariable String[] pathways)
    {
        return toAjax(triticumAestivumService.deleteTriticumAestivumByPathways(pathways));
    }
}
