<template>
  <div id="father" style="width: 100%">
    <!-- 头部样式 -->
    <div id="app">
      <div id="app-header" style="display: flex; align-items: center;background-color: #c4c06c;height: 165px;">
        <div id="app-head" style="width: 200px; height: 160px; margin-left: 16px">
          <img src="@/assets/images/head-log1.png" width="200px" height="160px" style="object-fit: contain" />
        </div>
        <div class="app-title" style="
            display: flex;
            flex-direction: column;
            align-items: flex-start;
            /* margin-bottom: 40px; */
            margin-left:0px;
            font-size: 38px;
          ">
          <div style="display: flex; margin-bottom: 5px">
            <i style="margin-left: 10px; font-style: italic">Agricultural Crop Information Resource Repository</i>
          </div>


          <div class="app-subtitle" style="margin-bottom: 10px">
            ————Provide various tools for crop genome research
          </div>
        </div>

      </div>

    </div>

    <div id="main">
      <div id="content1" style="height:80px ;">
        <div id="first-subject-div">
          <div id="left-column">
            <div class="highlight">
              <h4 class="first-subject-h4">kegg <strong>enrichment</strong></h4>
            </div>
          </div>
        </div>
      </div>
    </div>



    <div class="form-container">
      <!-- 下拉框 -->
      <div class="form-group">
        <label class="form-label">选择物种:</label>
        <select class="form-select" id="genome" data-live-search="true" data-selected-text-format="count" data-size="15"
                data-actions-box="true">
          <optgroup label="Mustard family">
            <option value="Arabidopsis_thaliana">Arabidopsis thaliana (thale cress)</option>
            <option>Camelina sativa (false flax)</option>
            <option>Eutrema salsugineum (saltwater cress)</option>
            <option>Brassica rapa (field mustard)</option>
            <option value="Brassica_napus">Brassica napus (rape)</option>
            <option>Brassica oleracea (wild cabbage)</option>
            <option>Raphanus sativus (radish)</option>
          </optgroup>
          <optgroup label="Rue family">
            <option>Citrus sinensis (Valencia orange)</option>
            <option>Citrus x clementina (clementine)</option>
          </optgroup>
          <optgroup label="Mallow family">
            <option>Theobroma cacao (cacao)</option>
            <option>Gossypium raimondii</option>
            <option>Gossypium hirsutum (upland cotton)</option>
            <option>Gossypium arboreum (tree cotton)</option>
            <option>Hibiscus syriacus (Rose-of-Sharon)</option>
            <option>Durio zibethinus (durian)</option>
          </optgroup>
          <optgroup label="Pea family">
            <option>Glycine max (soybean)</option>
            <option>Glycine soja (wild soybean)</option>
            <option>Phaseolus vulgaris (common bean)</option>
            <option>Vigna radiata (mung bean)</option>
            <option>Vigna angularis (adzuki bean)</option>
            <option>Vigna unguiculata (cowpea)</option>
            <option>Vigna umbellata (ricebean)</option>
            <option>Cajanus cajan (pigeon pea)</option>
            <option>Medicago truncatula (barrel medic)</option>
            <option>Trifolium pratense (red clover)</option>
            <option>Cicer arietinum (chickpea)</option>
            <option>Pisum sativum (pea)</option>
            <option>Arachis hypogaea (peanut)</option>
          </optgroup>
          <optgroup label="Rose family">
            <option>Fragaria vesca (woodland strawberry)</option>
            <option>Prunus persica (peach)</option>
            <option>Prunus mume (Japanese apricot)</option>
            <option>Prunus avium (sweet cherry)</option>
            <option>Prunus dulcis (almond)</option>
            <option>Malus domestica (apple)</option>
            <option>Malus sylvestris (European crab apple)</option>
            <option>Pyrus x bretschneideri (Chinese white pear)</option>
          </optgroup>
          <optgroup label="Cucumber family">
            <option>Cucumis sativus (cucumber)</option>
            <option>Cucumis melo (muskmelon)</option>
            <option>Benincasa hispida (wax gourd)</option>
            <option>Momordica charantia (bitter melon)</option>
            <option>Cucurbita maxima (winter squash)</option>
            <option>Cucurbita moschata (crookneck pumpkin)</option>
            <option>Cucurbita pepo subsp. pepo (vegetable marrow)</option>
          </optgroup>
          <optgroup label="Grape family">
            <option>Vitis vinifera (wine grape)</option>
            <option>Vitis riparia (riverbank grape)</option>
          </optgroup>
          <optgroup label="Cucumber family">
            <option>Solanum lycopersicum (tomato)</option>
            <option>Solanum tuberosum (potato)</option>
            <option>Solanum stenotomum</option>
            <option>Capsicum annuum (peppers)</option>
            <option>Lycium barbarum (goji berry)</option>
          </optgroup>
          <optgroup label="Sesame family">
            <option>Sesamum indicum (sesame)</option>
          </optgroup>
          <optgroup label="Olive family">
            <option>Olea europaea var. sylvestris (wild olive)</option>
          </optgroup>
          <optgroup label="Mint family">
            <option>Salvia splendens (scarlet sage)</option>
            <option>Salvia miltiorrhiza (redroot sage)</option>
            <option>Salvia hispanica (chia)</option>
          </optgroup>
          <optgroup label="Parsley family">
            <option>Daucus carota (carrot)</option>
          </optgroup>
          <optgroup label="Goosefoot family">
            <option>Beta vulgaris (sugar beet)</option>
            <option>Spinacia oleracea (spinach)</option>
            <option>Chenopodium quinoa (quinoa)</option>
          </optgroup>
          <optgroup label="Grass family">
            <option value="var_capitata.JZS.v1.1">Oryza sativa japonica (Japanese rice) (RefSeq)</option>
            <option>Oryza sativa japonica (Japanese rice) (RAPDB)</option>
            <option>Oryza brachyantha (malo sina)</option>
            <option>Oryza glaberrima (African rice)</option>
            <option>Brachypodium distachyon (stiff brome)</option>
            <option>Aegilops tauschii (wheat D)</option>
            <option>Triticum dicoccoides (wild emmer wheat)</option>
            <option value="Triticum_aestivum">Triticum aestivum (bread wheat)</option>
            <option>Triticum urartu (red wild einkorn wheat)</option>
            <option>Lolium perenne (perennial ryegrass)</option>
            <option>Lolium rigidum (rigid ryegrass)</option>
            <option>Sorghum bicolor (sorghum)</option>
            <option>Zea mays (maize)</option>
            <option>Setaria italica (foxtail millet)</option>
            <option>Setaria viridis (green foxtail)</option>
            <option>Panicum virgatum (switchgrass)</option>
            <option>Panicum hallii (Hall's panicgrass)</option>
          </optgroup>
          <optgroup label="Ginger family">
            <option>Zingiber officinale (ginger)</option>
          </optgroup>
        </select>
      </div>
      <!-- 上传geneid -->
      <div class="form-group">
        <label class="form-label">Gene List:</label>
        <textarea id="genes" class="form-select" rows="5"></textarea>
      </div>
      <!-- 文件上传 -->
      <div class="form-group file-upload" style="margin-left: 690px;">
        <input type="file" onchange="readFiles(this.files)">
      </div>
      <!-- 组数 -->
      <div class="form-group">
        <label class="form-label">Minimum count</label>
        <input type="number" id="min_count" class="form-select" value="5">
        <!-- 提交按钮 -->
        <div class="bnir-form-item" >
          <button id="submit_button" type="button" @click="total_plot">
            submit
          </button>
        </div>

      </div>


    </div>

    <!-- 图表 -->
    <div>
      <!-- 表格 -->
      <div class="table-container">
        <div class="content-body-content" style="width: 1450px">
          <!-- 按钮控制隐藏 -->
          <!-- <button class="button-control" @click="showTable = !showTable">{{ showTable ? 'Hide' : 'Show' }} Table</button> -->
          <el-table  :data="thalianaList" height="250" border class="el-table-style" style="width: 100%; text-align: center;">

            <el-table-column fixed prop="pathway" label="pathway" width="260">
            </el-table-column>
            <el-table-column prop="count" label="count" width="70">
            </el-table-column>
            <el-table-column prop="bgRatio" label="bgRatio" width="130">
            </el-table-column>
            <el-table-column prop="geneRatio" label="geneRatio" width="130">
            </el-table-column>
            <el-table-column prop="pvalue" label="pvalue" width="130">
            </el-table-column>
            <el-table-column prop="bonferroni" label="bonferroni" width="130">
            </el-table-column>
            <el-table-column prop="fdr" label="fdr" width="130">
            </el-table-column>
            <el-table-column prop="benjamini" label="benjamini" width="130">
            </el-table-column>
            <el-table-column prop="genes" label="genes'id" width="360">
              <template slot-scope="scope">
                <span @click="toggleGeneDetail(scope.$index)" class="gene-text" :title="scope.row.genes"
                      :class="{ 'expanded': isExpanded[scope.$index] }">
                  {{ scope.row.genes | ellipsis }}
                </span>
                <div v-if="isExpanded[scope.$index]" class="full-gene-list" v-html="scope.row.genes.replace(/,/g, ', ')">
                </div>
              </template>
            </el-table-column>
          </el-table>
        </div>
      </div>
      <!-- 柱状图 -->
      <div class="chart-container">
        <div id="Barchart" style="height: 500px"></div>
      </div>
      <!-- 散点图 -->
      <div class="chart-container">
        <div class="scatter-container">
          <div id="scatterchart" style="height: 500px"></div>
        </div>
      </div>
    </div>



  </div>
</template>

<script>
import { listAestivum} from "@/api/system/aestivum";
import {listThaliana} from "@/api/system/thaliana";
import * as echarts from 'echarts';

export default {

  name: "Aestivum",
  data() {
    return {
      showTable: false, // 控制表格是否显示的标志
      isExpanded: [], // 记录每一行是否展开的状态
      tableData: [
        {pathway:'123',
          count: 123,
          bgRatio: 0.1234567881,
          geneRatio: 1.111111111,
          pvalue: 1.111111111,
          bonferroni:1.111111111,
          fdr:1.111111111,
          benjamini:1.111111111,
          genes:'123'},
        {pathway:'123',
          count: 70,
          bgRatio: 0.1234567881,
          geneRatio: 1.9,
          pvalue: 1.111111111,
          bonferroni:1.111111111,
          fdr:1.111111111,
          benjamini:1.111111111,
          genes:'123'}
      ],
      aestivumList: [],
      thalianaList: [],
      queryParams: {
        pageNum: 1,
        pageSize: 10000
      },
    };
  },
  created() {
    // this.getAestivumList();
    // this.getThalianaList();
  },
  methods: {
    total_plot(){
      console.log("total_plot方法等待编写");
    //   待完成
    },
    async getAestivumList() {
      await listAestivum(this.queryParams).then(response => {
         this.aestivumList = response.rows;
        // this.tableData[2] = this.tableData[0];
        // this.tableData[2].pathway = this.tableData[0].pathway;
        // this.tableData[2].count = this.tableData[0].count;
        // this.tableData[2].bgRatio = this.tableData[0].bgRatio;
        // this.tableData[2].geneRatio = this.tableData[0].geneRatio;
        // this.tableData[2].pvalue = this.tableData[0].pvalue;
        // this.tableData[2].bonferroni = this.tableData[0].bonferroni;
        // this.tableData[2].fdr = this.tableData[0].fdr;
        // this.tableData[2].benjamini = this.tableData[0].benjamini;
        // this.tableData[2].genes = this.tableData[0].genes;

        console.log("这是当前使用的数据");
        console.log(this.tableData);
      });
    },
    async getThalianaList() {
      await listThaliana(this.queryParams).then(response => {
        this.thalianaList = response.rows;
        console.log(this.thalianaList);
      });
    },
    toggleGeneDetail(index) {
      // 切换当前行的展开状态
      this.isExpanded[index] = !this.isExpanded[index];
    },
    //  柱状图
    async initBarChart() {
      await this.getAestivumList();
      await this.getThalianaList();
      console.log("这是渲染之前的数据");
      console.log(this.aestivumList);
      const enrichedData = this.aestivumList.map(item => ({
        name: item.pathway,
        value: parseFloat(item.count),
        pValue: parseFloat(item.pvalue),
      })).sort((a, b) => b.pValue - a.pValue);

      const chartDom = document.getElementById('Barchart');
      const chartInstance = echarts.init(chartDom);

      const option = {
        tooltip: {
          trigger: 'axis',
          axisPointer: {
            type: 'shadow',
          },
        },
        xAxis: {
          type: 'value',
        },
        yAxis: {
          type: 'category',
          data: enrichedData.map(item => item.name),
        },

        series: [
          {
            data: enrichedData.map(item => item.value),
            type: 'bar',
            // 修改柱状图颜色
            itemStyle: {
              color: '#3399FF', // 设置柱子颜色
            },
            // 添加柱子之间的间隔
            barCategoryGap: '30%', // 分类间的柱间距
            barWidth: '30%', // 柱子宽度
            // 改变柱子圆角
            borderRadius: [5, 5, 0, 0], // [上左, 上右, 下右, 下左]
            // 显示柱子边框
            borderColor: '#000', // 边框颜色
            borderWidth: 2, // 边框宽度


          },
        ],
      };

      chartInstance.setOption(option);
    },

    // 散点图
    async initScatterChart() {
      await this.getAestivumList();
      await this.getThalianaList();
      const scatterData = this.aestivumList.map(item => ({
        GeneRatio: parseFloat(item.geneRatio), // GeneRatio作为X轴
        Pathway: item.pathway, // Pathway作为Y轴
      }));

      const scatterDom = document.getElementById('scatterchart');
      const scatterInstance = echarts.init(scatterDom);

      const scatterOption = {
        tooltip: {
          trigger: 'item',
          formatter: (params) => `GeneRatio: ${params.data.GeneRatio}<br>Pathway: ${params.data.Pathway}`,
        },
        xAxis: {
          name: 'GeneRatio',
          type: 'value',
        },
        yAxis: {
          name: 'Pathway',
          type: 'category',
          data: scatterData.map(item => item.Pathway), // 注意这里的映射需要修正为item.pathway
        },
        series: [
          {
            data: scatterData.map(item => [item.GeneRatio, item.Pathway]),
            type: 'scatter',
            // 动态调整symbolSize，这里使用GeneRatio作为示例，可以根据需要调整公式
            symbolSize: (data) => {
              // 根据GeneRatio计算点的大小，例如乘以一个因子以调整视觉效果，可以自定义这个比例因子
              const baseSize = 10; // 基础大小
              const ratioFactor = 2; // GeneRatio的影响因子
              return baseSize + data[0] * ratioFactor; // data[0] 是GeneRatio
            },
          },
        ],
      };
      scatterInstance.setOption(scatterOption);
    }




  },
  filters: {
    ellipsis(value) {
      const maxLength = 50; // 设定最大显示长度
      return value.length > maxLength ? value.slice(0, maxLength) + '...' : value;
    },
  },
  mounted() {
    this.initBarChart(); // 初始化柱状图
    this.initScatterChart(); // 初始化散点图
  }

};
</script>


<style scoped>
.app-title {
  color: gold;
  letter-spacing: 0;
  font-size: 200%;
  text-shadow: 0px 1px 0px #999, 0px 2px 0px #888, 0px 3px 0px #777, 0px 4px 0px #666, 0px 5px 0px #555, 0px 6px 0px #444, 0px 7px 0px #333, 0px 8px 7px #001135
}

.highlight.highlight {
  background-color: #ffffcc;
  /* 淡黄色 */
  border: 1px solid #cccccc;
  /* 边框样式 */
  padding: 10px;
  /* 设置内边距 */
  border-radius: 13px;
  margin-top: 20px;
  height: 40px;
  padding-left: 10px;
  padding-top: 15px;


}

.el-dropdown {
  vertical-align: top;
}

.el-dropdown+.el-dropdown {
  margin-left: 15px;
}

.el-icon-arrow-down {
  font-size: 12px;
}


.bnir-button,
.bnir-form button,
.bnir-form-item button {
  width: 60px;
  height: 30px;
  border: 2px solid #fae7ba;
  border-radius: 5px;
  background-color: #fae7ba;
  color: #a2bd28;
  font-size: 13px;
}

.form-container {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  border: 4px dashed rgb(249, 249, 125);
  /* 添加黄色虚线边框 */
  border-radius: 10px;
  /* 设置圆角大小 */
  padding: 1rem;
  /* 可选，为了更好的视觉效果，可以添加内边距 */
}

.form-group {
  display: flex;
  flex-direction: column;
  text-align: center;
  gap: 0.5rem;
}



.form-group .form-select {
  width: calc(25% - 2px);
  /* 减去边框宽度，以确保总宽度正好是1/4 */
  margin: 0 auto;
  background-color: #fffacd;
  border: 1px solid #ffeb3b;
  border-radius: 5px;
}

.form-label {
  font-weight: bold;
}

.form-select,
.form-textarea,
.form-input {
  width: 100%;
  padding: 0.5rem;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.file-upload input[type="file"] {
  width: 100%;
}

.advanced-options {
  display: none;
}

.toggle-button {
  background-color: #f0f0f0;
  border: none;
  cursor: pointer;
  padding: 0.5rem;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button-group {
  display: flex;
  justify-content: flex-end;
  gap: 1rem;
}

.submit,
.reset {
  padding: 0.5rem 1rem;
  background: #007bff;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

.reset {
  background-color: #dc3545;
}

/* 禁用时的样式 */
input[disabled],
select[disabled],
textarea[disabled],
input[readonly],
select[readonly],
textarea[readonly] {
  border-color: #7BA7AB;
}

.bnir-input {
  box-sizing: border-box;
  -webkit-box-sizing: border-box;
  height: 30px;
  padding-left: 10px;
  border: 2px solid #a65629;
  border-radius: 5px;
  background: #fae7ba;
  color: #9E9C9C;
  margin-bottom: 0;
}

.first-subject-h4 {
  margin: 0;
  color: #e3c274;
  line-height: 28px;
  font-size: 28px;
  margin-left: 5px;
}

.gene-text {
  display: block;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  cursor: pointer;
}

.expanded {
  white-space: normal;
  text-overflow: unset;
}

.content-body {
  width: 400px;
  margin: 20px auto;
  padding: 20px;
  background-color: #ffffcc;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.content-body-head {
  display: flex;
  justify-content: space-between;
}
/* 通用按钮样式 */
.button-control {
  padding: 8px 16px;
  font-size: 14px;
  color: #333;
  background-color: #f0f0f0;
  border: 1px solid #ccc;
  border-radius: 4px;
  cursor: pointer;
  transition: all 0.3s ease;
}

.button-control:hover {
  background-color: #e0e0e0;
  color: #000;
}

/* 表格样式 */
.table-container {
  margin-bottom: 20px;
}

/* 柱状图和散点图容器样式 */
.chart-container {
  margin-top: 20px;
  height: 500px; /* 或者根据实际需要调整 */
}

/* 扩展的基因详情样式 */
.full-gene-list {
  margin-top: 5px;
  font-size: 12px;
  color: #666;
  white-space: pre-wrap;
}
.content-body-content {
  display: flex;
  justify-content: center; /* 水平居中 */
  align-items: center; /* 垂直居中，根据需要可选 */
  width: 1450px;
  margin: 0 auto; /* 如果需要水平居中对齐到页面中心 */
}
.bnir-form-item {
  /* 可以添加一些容器样式，比如间距 */
}

#submit_button {
  /* padding: 10px 20px; */
  font-size: 20px;
  color: white; /* 文字颜色 */
  background-color: #d1d16a; /* 背景颜色 */
  border: none;
  cursor: pointer;
  border-radius: 5px;
  margin-top: 13px;
  width: 100px;
  height: 30px;
}

#submit_button:hover {
  background-color: #98b300; /* 鼠标悬停时的背景颜色 */
}
</style>

