/**
 * 库存商品表修改页面JS
 */

$(function(){

    // 激活左侧导航菜单
    activeNavBar("stock_goods", "biz");
    // 绑定保存
    $("#btnSave").click(function(){
        save();
    });

});

/**
 * 保存
 */
function save(){
    if($('#editForm').trigger("validate").isValid()){
        jQuery.ajax({
            type:"POST",
            dataType:'json',
            url:springUrl + "/web/stock/stockgoods/update",
            data:{
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
            },
            success:function (data) {
                Commons.showSuccess("数据保存成功!", function(){
                    window.location.href = springUrl + "/web/stock/stockgoods/listPage";
                });
            },
            error : function(data){
                Commons.showError("数据保存失败!");
            }
        });
    }
}
