<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="pathway">
        <el-input
          v-model="queryParams.pathway"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="count">
        <el-input
          v-model="queryParams.count"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="bgRatio">
        <el-input
          v-model="queryParams.bgRatio"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="geneRatio">
        <el-input
          v-model="queryParams.geneRatio"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="pvalue">
        <el-input
          v-model="queryParams.pvalue"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="bonferroni">
        <el-input
          v-model="queryParams.bonferroni"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="fdr">
        <el-input
          v-model="queryParams.fdr"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="benjamini">
        <el-input
          v-model="queryParams.benjamini"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:thaliana:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:thaliana:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:thaliana:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:thaliana:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="thalianaList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="pathway" />
      <el-table-column label="${comment}" align="center" prop="count" />
      <el-table-column label="${comment}" align="center" prop="bgRatio" />
      <el-table-column label="${comment}" align="center" prop="geneRatio" />
      <el-table-column label="${comment}" align="center" prop="pvalue" />
      <el-table-column label="${comment}" align="center" prop="bonferroni" />
      <el-table-column label="${comment}" align="center" prop="genes" />
      <el-table-column label="${comment}" align="center" prop="fdr" />
      <el-table-column label="${comment}" align="center" prop="benjamini" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:thaliana:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:thaliana:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改第一个对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="pathway">
          <el-input v-model="form.pathway" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="count">
          <el-input v-model="form.count" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="bgRatio">
          <el-input v-model="form.bgRatio" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="geneRatio">
          <el-input v-model="form.geneRatio" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="pvalue">
          <el-input v-model="form.pvalue" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="bonferroni">
          <el-input v-model="form.bonferroni" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="genes">
          <el-input v-model="form.genes" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="fdr">
          <el-input v-model="form.fdr" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="benjamini">
          <el-input v-model="form.benjamini" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listThaliana, getThaliana, delThaliana, addThaliana, updateThaliana } from "@/api/system/thaliana";

export default {
  name: "Thaliana",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 第一个表格数据
      thalianaList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        pathway: null,
        count: null,
        bgRatio: null,
        geneRatio: null,
        pvalue: null,
        bonferroni: null,
        genes: null,
        fdr: null,
        benjamini: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询第一个列表 */
    getList() {
      this.loading = true;
      listThaliana(this.queryParams).then(response => {
        this.thalianaList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        pathway: null,
        count: null,
        bgRatio: null,
        geneRatio: null,
        pvalue: null,
        bonferroni: null,
        genes: null,
        fdr: null,
        benjamini: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.pathway)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加第一个";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const pathway = row.pathway || this.ids
      getThaliana(pathway).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改第一个";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.pathway != null) {
            updateThaliana(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addThaliana(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const pathways = row.pathway || this.ids;
      this.$modal.confirm('是否确认删除第一个编号为"' + pathways + '"的数据项？').then(function() {
        return delThaliana(pathways);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/thaliana/export', {
        ...this.queryParams
      }, `thaliana_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
