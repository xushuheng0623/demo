/**
 * 库存商品表数据列表页面JS
 */
$(function(){

    // 展开左侧导航菜单
    activeNavBar("stock_goods", "biz");
    // 加载数据列表
    loadGrid();

    // 绑定查询
    $("#btnQuery").click(function(){
        query();
    });

    // 绑定清空
    $("#btnReset").click(function(){
        $('#searchForm')[0].reset();
    });

    // 调整窗口时，设置数据列表宽度
    $(window).on('resize.jqGrid', function() {
        var parent_width = $("#gridTable").closest('.jqgrid-container').width();
        $("#gridTable").jqGrid('setGridWidth', parent_width, true);
    });

    // 收缩侧边栏时，设置数据列表宽度
    $(document).on('settings.ace.jqGrid', function(ev, event_name, collapsed) {
        if (event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed') {
            var parent_width = $("#gridTable").closest('.jqgrid-container').width();
            $("#gridTable").jqGrid('setGridWidth', parent_width, true);
        }
    });

});

/**
 * 加载数据列表
 */
function loadGrid(){
    // 表格对象
    var gridTable = $("#gridTable");
    // 初始化
    gridTable.jqGrid({
        mtype:"GET",
        url: springUrl + "/web/stock/stockgoods/pageQuery",
        datatype: "json",
        autowidth: true,
        height: "auto",
        colModel:[
            {name:'id', label:'ID', index:'id', width:50, fixed:false, sortable: false, resizable:false, hidden: true},
            {name:'companyCode',label:'总公司编码', index:'companyCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'companyName',label:'总公司名称', index:'companyName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'distribCenterCode',label:'配送中心编码', index:'distribCenterCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'distribCenterName',label:'配送中心名称', index:'distribCenterName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'warehouseCode',label:'库房编码', index:'warehouseCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'warehouseName',label:'库房名称', index:'warehouseName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'spareCode',label:'备件条码', index:'spareCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categoryFirstCode',label:'商品一级分类编码', index:'categoryFirstCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categoryFirstName',label:'商品一级分类名称', index:'categoryFirstName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categorySecondCode',label:'商品二级分类编码', index:'categorySecondCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categorySecondName',label:'商品二级分类名称', index:'categorySecondName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categoryThirdCode',label:'商品三级分类编码', index:'categoryThirdCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'categoryThirdName',label:'商品三级分类名称', index:'categoryThirdName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'brandCode',label:'品牌编码', index:'brandCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'brandName',label:'品牌名称', index:'brandName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'vendorCode',label:'供货商编码', index:'vendorCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'vendorName',label:'供货商名称', index:'vendorName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsOwnerCode',label:'货主编码', index:'goodsOwnerCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsOwnerName',label:'货主名称', index:'goodsOwnerName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsSku',label:'商品SKU编码', index:'goodsSku',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsName',label:'商品名称', index:'goodsName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsSn',label:'商品序列号', index:'goodsSn',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isSuit',label:'是否套装(1:是;0:否)', index:'isSuit',width:100, fixed:false, sortable: false, align:'left'},
            {name:'suitId',label:'套装编号（取自基础数据套装商品表）', index:'suitId',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isBinded',label:'是否已绑定(0:否,1:是)', index:'isBinded',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isMainGoods',label:'是否主商品（1:是;0:否）', index:'isMainGoods',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isManualUnbundling',label:'是否手动解绑（1:是;0:否）', index:'isManualUnbundling',width:100, fixed:false, sortable: false, align:'left'},
            {name:'referSpareCode',label:'附商品的主备件条码', index:'referSpareCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsPackageCode',label:'产品包装编码( 0:无包装; 1:有非新; 2:新)', index:'goodsPackageCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsPackageName',label:'产品包装编码( 0:无包装; 1:有非新; 2:新)', index:'goodsPackageName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsExteriorCode',label:'商品外观编码（ 0:严重损; 1:轻微损; 2:新）', index:'goodsExteriorCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsExteriorName',label:'商品外观编码（ 0:严重损; 1:轻微损; 2:新）', index:'goodsExteriorName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsFunctionCode',label:'商品功能编码 （0:坏; 1:好; 2:待检测）', index:'goodsFunctionCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsFunctionName',label:'商品功能编码 （0:坏; 1:好; 2:待检测）', index:'goodsFunctionName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsPhaseCode',label:'商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）', index:'goodsPhaseCode',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsPhaseName',label:'商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）', index:'goodsPhaseName',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsWarehousePrice',label:'仓报价', index:'goodsWarehousePrice',width:100, fixed:false, sortable: false, align:'left'},
            {name:'goodsOwnership',label:'备件权属(0:京东权属;1:非京东权属)', index:'goodsOwnership',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isBrokenScreen',label:'是否碎屏 (0:完好; 1:已碎屏)', index:'isBrokenScreen',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isAttachmentComplete',label:'附件情况（0:不完整; 1:完整）', index:'isAttachmentComplete',width:100, fixed:false, sortable: false, align:'left'},
            {name:'attachmentDesc',label:'附件详情', index:'attachmentDesc',width:100, fixed:false, sortable: false, align:'left'},
            {name:'questionDesc',label:'问题描述', index:'questionDesc',width:100, fixed:false, sortable: false, align:'left'},
            {name:'firstIdentifyOrder',label:'1次鉴定单', index:'firstIdentifyOrder',width:100, fixed:false, sortable: false, align:'left'},
            {name:'firstIdentifyResult',label:'1次鉴定结果', index:'firstIdentifyResult',width:100, fixed:false, sortable: false, align:'left'},
            {name:'firstIdentifyUrl',label:'1次鉴定URL', index:'firstIdentifyUrl',width:100, fixed:false, sortable: false, align:'left'},
            {name:'secondaryIdentifyOrder',label:'2次鉴定单', index:'secondaryIdentifyOrder',width:100, fixed:false, sortable: false, align:'left'},
            {name:'secondaryIdentifyResult',label:'2次鉴定结果', index:'secondaryIdentifyResult',width:100, fixed:false, sortable: false, align:'left'},
            {name:'secondaryIdentifyUrl',label:'2次鉴定URL', index:'secondaryIdentifyUrl',width:100, fixed:false, sortable: false, align:'left'},
            {name:'stockInDocId',label:'入库单编号', index:'stockInDocId',width:100, fixed:false, sortable: false, align:'left'},
            {name:'stockOutDocId',label:'出库单编号', index:'stockOutDocId',width:100, fixed:false, sortable: false, align:'left'},
            {name:'unpackingTime',label:'拆包登记时间', index:'unpackingTime',width:100, fixed:false, sortable: false, align:'left'},
            {name:'printCount',label:'打印次数', index:'printCount',width:100, fixed:false, sortable: false, align:'left'},
            {name:'dutyRateCustomerService',label:'客服责任占比', index:'dutyRateCustomerService',width:100, fixed:false, sortable: false, align:'left'},
            {name:'dutyRateSales',label:'采销责任占比', index:'dutyRateSales',width:100, fixed:false, sortable: false, align:'left'},
            {name:'dutyRateCarrier',label:'承运商责任占比', index:'dutyRateCarrier',width:100, fixed:false, sortable: false, align:'left'},
            {name:'dutyRateVendor',label:'供应商责任占比', index:'dutyRateVendor',width:100, fixed:false, sortable: false, align:'left'},
            {name:'bindingTime',label:'绑定时间', index:'bindingTime',width:100, fixed:false, sortable: false, align:'left'},
            {name:'remark',label:'备注', index:'remark',width:100, fixed:false, sortable: false, align:'left'},
            {name:'version',label:'数据版本', index:'version',width:100, fixed:false, sortable: false, align:'left'},
            {name:'createUser',label:'创建人', index:'createUser',width:100, fixed:false, sortable: false, align:'left'},
            {name:'createTime',label:'创建时间', index:'createTime',width:100, fixed:false, sortable: false, align:'left'},
            {name:'updateUser',label:'修改人', index:'updateUser',width:100, fixed:false, sortable: false, align:'left'},
            {name:'updateTime',label:'修改时间', index:'updateTime',width:100, fixed:false, sortable: false, align:'left'},
            {name:'isDelete',label:'是否删除（1：是；0：否）', index:'isDelete',width:100, fixed:false, sortable: false, align:'left'},
            {name:'ts',label:'时间戳', index:'ts',width:100, fixed:false, sortable: false, align:'left'},
            {name:'', label:'操作', index:'', width:100, fixed:true, sortable:false, resize:false, align:'center',
                formatter:function(cellValue,options,rowObject){
                    var context = "";
                    context += '<button class="button button-primary button-square button-default" onclick="openEditPage(' + rowObject.id + ')"><i class="fa fa-pencil"></i></button> ';
                    context += '<button class="button button-primary button-square button-default" onclick="deleteById(' + rowObject.id + ')"><i class="fa fa-trash"></i></button> ';
                    return context;
                }
            }
        ],
        rownumbers:true,//添加左侧行号
        viewrecords : true,
        rowNum:10,
        rowList:[20,50,100],
        sortname:"update_time",
        sortorder:"desc",
        altRows: true,
        pager : "#gridPager",
        jsonReader: { 
            root: "content",
            page: "pageNum",
            total: "totalPages",
            records: "totalElements"
        },
        loadComplete : function() {
            updatePagerIcons(this);
        }
    });

    // 左下角小按钮
    gridTable.jqGrid('navGrid',"#gridPager",
        {
            edit : false,
            add : false,
            del : false,
            search : false,
            refresh : true,
            refreshicon : 'ace-icon fa fa-refresh green',
            view : false
        }
    );

}

/**
 * 查询
 */
function query(){
    if($('#searchForm').trigger("validate").isValid()){
        var gridParam = {
            url: springUrl + "/web/stock/stockgoods/pageQuery",
            postData:{
                id : $('#id').val(),
                companyCode : $('#companyCode').val(),
                companyName : $('#companyName').val(),
                distribCenterCode : $('#distribCenterCode').val(),
                distribCenterName : $('#distribCenterName').val(),
                warehouseCode : $('#warehouseCode').val(),
                warehouseName : $('#warehouseName').val(),
                spareCode : $('#spareCode').val(),
                categoryFirstCode : $('#categoryFirstCode').val(),
                categoryFirstName : $('#categoryFirstName').val(),
                categorySecondCode : $('#categorySecondCode').val(),
                categorySecondName : $('#categorySecondName').val(),
                categoryThirdCode : $('#categoryThirdCode').val(),
                categoryThirdName : $('#categoryThirdName').val(),
                brandCode : $('#brandCode').val(),
                brandName : $('#brandName').val(),
                vendorCode : $('#vendorCode').val(),
                vendorName : $('#vendorName').val(),
                goodsOwnerCode : $('#goodsOwnerCode').val(),
                goodsOwnerName : $('#goodsOwnerName').val(),
                goodsSku : $('#goodsSku').val(),
                goodsName : $('#goodsName').val(),
                goodsSn : $('#goodsSn').val(),
                isSuit : $('#isSuit').val(),
                suitId : $('#suitId').val(),
                isBinded : $('#isBinded').val(),
                isMainGoods : $('#isMainGoods').val(),
                isManualUnbundling : $('#isManualUnbundling').val(),
                referSpareCode : $('#referSpareCode').val(),
                goodsPackageCode : $('#goodsPackageCode').val(),
                goodsPackageName : $('#goodsPackageName').val(),
                goodsExteriorCode : $('#goodsExteriorCode').val(),
                goodsExteriorName : $('#goodsExteriorName').val(),
                goodsFunctionCode : $('#goodsFunctionCode').val(),
                goodsFunctionName : $('#goodsFunctionName').val(),
                goodsPhaseCode : $('#goodsPhaseCode').val(),
                goodsPhaseName : $('#goodsPhaseName').val(),
                goodsWarehousePrice : $('#goodsWarehousePrice').val(),
                goodsOwnership : $('#goodsOwnership').val(),
                isBrokenScreen : $('#isBrokenScreen').val(),
                isAttachmentComplete : $('#isAttachmentComplete').val(),
                attachmentDesc : $('#attachmentDesc').val(),
                questionDesc : $('#questionDesc').val(),
                firstIdentifyOrder : $('#firstIdentifyOrder').val(),
                firstIdentifyResult : $('#firstIdentifyResult').val(),
                firstIdentifyUrl : $('#firstIdentifyUrl').val(),
                secondaryIdentifyOrder : $('#secondaryIdentifyOrder').val(),
                secondaryIdentifyResult : $('#secondaryIdentifyResult').val(),
                secondaryIdentifyUrl : $('#secondaryIdentifyUrl').val(),
                stockInDocId : $('#stockInDocId').val(),
                stockOutDocId : $('#stockOutDocId').val(),
                unpackingTime : $('#unpackingTime').val(),
                printCount : $('#printCount').val(),
                dutyRateCustomerService : $('#dutyRateCustomerService').val(),
                dutyRateSales : $('#dutyRateSales').val(),
                dutyRateCarrier : $('#dutyRateCarrier').val(),
                dutyRateVendor : $('#dutyRateVendor').val(),
                bindingTime : $('#bindingTime').val(),
                remark : $('#remark').val(),
                version : $('#version').val(),
                createUser : $('#createUser').val(),
                createTime : $('#createTime').val(),
                updateUser : $('#updateUser').val(),
                updateTime : $('#updateTime').val(),
                isDelete : $('#isDelete').val(),
                ts : $('#ts').val()
            }
        };
        $("#gridTable").jqGrid("setGridParam", gridParam).trigger("reloadGrid");
    }
}

/**
 * 打开修改页面
 * @param id 主键ID
 */
function openEditPage(id){
    window.location.href = springUrl + "/web/stock/stockgoods/editPage?id="+id;
}

/**
 * 根据主键删除数据
 * @param id 主键ID
 */
function deleteById(id){
    Commons.showConfirm("是否删除该记录?", function(){
        jQuery.ajax({
            type:"POST",
            dataType:'json',
            url:springUrl + "/web/stock/stockgoods/delete",
            data:{
                id:  id
            },
            success:function (data) {
                Commons.showSuccess("数据删除成功!", function(){
                    $("#gridTable").trigger("reloadGrid");
                });
            },
            error : function(data){
                Commons.showError(data.responseText);
            }
        });
    })
}
