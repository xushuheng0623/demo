/**
 * Copyright (c) 2016, 2017, JD and/or its affiliates. All rights reserved.
 */
package com.jd.las.spare.domain.stock;

import java.math.BigDecimal;
import java.util.Date;

import com.jd.las.spare.domain.AbstractEntity;

/**
 * 库存商品表数据实体
 * 
 * @author
 */
public final class StockGoods extends AbstractEntity {

    // 序列化
    private static final long serialVersionUID = 1L;

    // 总公司编码
    private String companyCode;

    // 总公司名称
    private String companyName;

    // 配送中心编码
    private String distribCenterCode;

    // 配送中心名称
    private String distribCenterName;

    // 库房编码
    private String warehouseCode;

    // 库房名称
    private String warehouseName;

    // 备件条码
    private String spareCode;

    // 商品一级分类编码
    private String categoryFirstCode;

    // 商品一级分类名称
    private String categoryFirstName;

    // 商品二级分类编码
    private String categorySecondCode;

    // 商品二级分类名称
    private String categorySecondName;

    // 商品三级分类编码
    private String categoryThirdCode;

    // 商品三级分类名称
    private String categoryThirdName;

    // 品牌编码
    private String brandCode;

    // 品牌名称
    private String brandName;

    // 供货商编码
    private String vendorCode;

    // 供货商名称
    private String vendorName;

    // 货主编码
    private String goodsOwnerCode;

    // 货主名称
    private String goodsOwnerName;

    // 商品SKU编码
    private String goodsSku;

    // 商品名称
    private String goodsName;

    // 商品序列号
    private String goodsSn;

    // 是否套装(1:是;0:否)
    private Integer isSuit;

    // 套装编号（取自基础数据套装商品表）
    private String suitId;

    // 是否已绑定(0:否,1:是)
    private Integer isBinded;

    // 是否主商品（1:是;0:否）
    private Integer isMainGoods;

    // 是否手动解绑（1:是;0:否）
    private Integer isManualUnbundling;

    // 附商品的主备件条码
    private String referSpareCode;

    // 产品包装编码( 0:无包装; 1:有非新; 2:新)
    private String goodsPackageCode;

    // 产品包装编码( 0:无包装; 1:有非新; 2:新)
    private String goodsPackageName;

    // 商品外观编码（ 0:严重损; 1:轻微损; 2:新）
    private String goodsExteriorCode;

    // 商品外观编码（ 0:严重损; 1:轻微损; 2:新）
    private String goodsExteriorName;

    // 商品功能编码 （0:坏; 1:好; 2:待检测）
    private String goodsFunctionCode;

    // 商品功能编码 （0:坏; 1:好; 2:待检测）
    private String goodsFunctionName;

    // 商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
    private String goodsPhaseCode;

    // 商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
    private String goodsPhaseName;

    // 仓报价
    private BigDecimal goodsWarehousePrice;

    // 备件权属(0:京东权属;1:非京东权属)
    private String goodsOwnership;

    // 是否碎屏 (0:完好; 1:已碎屏)
    private Integer isBrokenScreen;

    // 附件情况（0:不完整; 1:完整）
    private Integer isAttachmentComplete;

    // 附件详情
    private String attachmentDesc;

    // 问题描述
    private String questionDesc;

    // 1次鉴定单
    private String firstIdentifyOrder;

    // 1次鉴定结果
    private String firstIdentifyResult;

    // 1次鉴定URL
    private String firstIdentifyUrl;

    // 2次鉴定单
    private String secondaryIdentifyOrder;

    // 2次鉴定结果
    private String secondaryIdentifyResult;

    // 2次鉴定URL
    private String secondaryIdentifyUrl;

    // 入库单编号
    private String stockInDocId;

    // 出库单编号
    private String stockOutDocId;

    // 拆包登记时间
    private Date unpackingTime;

    // 拆包登记时间开始查询条件
    private transient Date unpackingTimeBegin;

    // 拆包登记时间截止查询条件
    private transient Date unpackingTimeEnd;

    // 打印次数
    private Integer printCount;

    // 客服责任占比
    private Integer dutyRateCustomerService;

    // 采销责任占比
    private Integer dutyRateSales;

    // 承运商责任占比
    private Integer dutyRateCarrier;

    // 供应商责任占比
    private Integer dutyRateVendor;

    // 绑定时间
    private Date bindingTime;

    // 绑定时间开始查询条件
    private transient Date bindingTimeBegin;

    // 绑定时间截止查询条件
    private transient Date bindingTimeEnd;

    /**
     * 设置总公司编码
     * 
     * @param companyCode 总公司编码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 获取总公司编码
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * 设置总公司名称
     * 
     * @param companyName 总公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取总公司名称
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * 设置配送中心编码
     * 
     * @param distribCenterCode 配送中心编码
     */
    public void setDistribCenterCode(String distribCenterCode) {
        this.distribCenterCode = distribCenterCode;
    }

    /**
     * 获取配送中心编码
     */
    public String getDistribCenterCode() {
        return this.distribCenterCode;
    }

    /**
     * 设置配送中心名称
     * 
     * @param distribCenterName 配送中心名称
     */
    public void setDistribCenterName(String distribCenterName) {
        this.distribCenterName = distribCenterName;
    }

    /**
     * 获取配送中心名称
     */
    public String getDistribCenterName() {
        return this.distribCenterName;
    }

    /**
     * 设置库房编码
     * 
     * @param warehouseCode 库房编码
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    /**
     * 获取库房编码
     */
    public String getWarehouseCode() {
        return this.warehouseCode;
    }

    /**
     * 设置库房名称
     * 
     * @param warehouseName 库房名称
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    /**
     * 获取库房名称
     */
    public String getWarehouseName() {
        return this.warehouseName;
    }

    /**
     * 设置备件条码
     * 
     * @param spareCode 备件条码
     */
    public void setSpareCode(String spareCode) {
        this.spareCode = spareCode;
    }

    /**
     * 获取备件条码
     */
    public String getSpareCode() {
        return this.spareCode;
    }

    /**
     * 设置商品一级分类编码
     * 
     * @param categoryFirstCode 商品一级分类编码
     */
    public void setCategoryFirstCode(String categoryFirstCode) {
        this.categoryFirstCode = categoryFirstCode;
    }

    /**
     * 获取商品一级分类编码
     */
    public String getCategoryFirstCode() {
        return this.categoryFirstCode;
    }

    /**
     * 设置商品一级分类名称
     * 
     * @param categoryFirstName 商品一级分类名称
     */
    public void setCategoryFirstName(String categoryFirstName) {
        this.categoryFirstName = categoryFirstName;
    }

    /**
     * 获取商品一级分类名称
     */
    public String getCategoryFirstName() {
        return this.categoryFirstName;
    }

    /**
     * 设置商品二级分类编码
     * 
     * @param categorySecondCode 商品二级分类编码
     */
    public void setCategorySecondCode(String categorySecondCode) {
        this.categorySecondCode = categorySecondCode;
    }

    /**
     * 获取商品二级分类编码
     */
    public String getCategorySecondCode() {
        return this.categorySecondCode;
    }

    /**
     * 设置商品二级分类名称
     * 
     * @param categorySecondName 商品二级分类名称
     */
    public void setCategorySecondName(String categorySecondName) {
        this.categorySecondName = categorySecondName;
    }

    /**
     * 获取商品二级分类名称
     */
    public String getCategorySecondName() {
        return this.categorySecondName;
    }

    /**
     * 设置商品三级分类编码
     * 
     * @param categoryThirdCode 商品三级分类编码
     */
    public void setCategoryThirdCode(String categoryThirdCode) {
        this.categoryThirdCode = categoryThirdCode;
    }

    /**
     * 获取商品三级分类编码
     */
    public String getCategoryThirdCode() {
        return this.categoryThirdCode;
    }

    /**
     * 设置商品三级分类名称
     * 
     * @param categoryThirdName 商品三级分类名称
     */
    public void setCategoryThirdName(String categoryThirdName) {
        this.categoryThirdName = categoryThirdName;
    }

    /**
     * 获取商品三级分类名称
     */
    public String getCategoryThirdName() {
        return this.categoryThirdName;
    }

    /**
     * 设置品牌编码
     * 
     * @param brandCode 品牌编码
     */
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * 获取品牌编码
     */
    public String getBrandCode() {
        return this.brandCode;
    }

    /**
     * 设置品牌名称
     * 
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取品牌名称
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * 设置供货商编码
     * 
     * @param vendorCode 供货商编码
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * 获取供货商编码
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * 设置供货商名称
     * 
     * @param vendorName 供货商名称
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * 获取供货商名称
     */
    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * 设置货主编码
     * 
     * @param goodsOwnerCode 货主编码
     */
    public void setGoodsOwnerCode(String goodsOwnerCode) {
        this.goodsOwnerCode = goodsOwnerCode;
    }

    /**
     * 获取货主编码
     */
    public String getGoodsOwnerCode() {
        return this.goodsOwnerCode;
    }

    /**
     * 设置货主名称
     * 
     * @param goodsOwnerName 货主名称
     */
    public void setGoodsOwnerName(String goodsOwnerName) {
        this.goodsOwnerName = goodsOwnerName;
    }

    /**
     * 获取货主名称
     */
    public String getGoodsOwnerName() {
        return this.goodsOwnerName;
    }

    /**
     * 设置商品SKU编码
     * 
     * @param goodsSku 商品SKU编码
     */
    public void setGoodsSku(String goodsSku) {
        this.goodsSku = goodsSku;
    }

    /**
     * 获取商品SKU编码
     */
    public String getGoodsSku() {
        return this.goodsSku;
    }

    /**
     * 设置商品名称
     * 
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取商品名称
     */
    public String getGoodsName() {
        return this.goodsName;
    }

    /**
     * 设置商品序列号
     * 
     * @param goodsSn 商品序列号
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    /**
     * 获取商品序列号
     */
    public String getGoodsSn() {
        return this.goodsSn;
    }

    /**
     * 设置是否套装(1:是;0:否)
     * 
     * @param isSuit 是否套装(1:是;0:否)
     */
    public void setIsSuit(Integer isSuit) {
        this.isSuit = isSuit;
    }

    /**
     * 获取是否套装(1:是;0:否)
     */
    public Integer getIsSuit() {
        return this.isSuit;
    }

    /**
     * 设置套装编号（取自基础数据套装商品表）
     * 
     * @param suitId 套装编号（取自基础数据套装商品表）
     */
    public void setSuitId(String suitId) {
        this.suitId = suitId;
    }

    /**
     * 获取套装编号（取自基础数据套装商品表）
     */
    public String getSuitId() {
        return this.suitId;
    }

    /**
     * 设置是否已绑定(0:否,1:是)
     * 
     * @param isBinded 是否已绑定(0:否,1:是)
     */
    public void setIsBinded(Integer isBinded) {
        this.isBinded = isBinded;
    }

    /**
     * 获取是否已绑定(0:否,1:是)
     */
    public Integer getIsBinded() {
        return this.isBinded;
    }

    /**
     * 设置是否主商品（1:是;0:否）
     * 
     * @param isMainGoods 是否主商品（1:是;0:否）
     */
    public void setIsMainGoods(Integer isMainGoods) {
        this.isMainGoods = isMainGoods;
    }

    /**
     * 获取是否主商品（1:是;0:否）
     */
    public Integer getIsMainGoods() {
        return this.isMainGoods;
    }

    /**
     * 设置是否手动解绑（1:是;0:否）
     * 
     * @param isManualUnbundling 是否手动解绑（1:是;0:否）
     */
    public void setIsManualUnbundling(Integer isManualUnbundling) {
        this.isManualUnbundling = isManualUnbundling;
    }

    /**
     * 获取是否手动解绑（1:是;0:否）
     */
    public Integer getIsManualUnbundling() {
        return this.isManualUnbundling;
    }

    /**
     * 设置附商品的主备件条码
     * 
     * @param referSpareCode 附商品的主备件条码
     */
    public void setReferSpareCode(String referSpareCode) {
        this.referSpareCode = referSpareCode;
    }

    /**
     * 获取附商品的主备件条码
     */
    public String getReferSpareCode() {
        return this.referSpareCode;
    }

    /**
     * 设置产品包装编码( 0:无包装; 1:有非新; 2:新)
     * 
     * @param goodsPackageCode 产品包装编码( 0:无包装; 1:有非新; 2:新)
     */
    public void setGoodsPackageCode(String goodsPackageCode) {
        this.goodsPackageCode = goodsPackageCode;
    }

    /**
     * 获取产品包装编码( 0:无包装; 1:有非新; 2:新)
     */
    public String getGoodsPackageCode() {
        return this.goodsPackageCode;
    }

    /**
     * 设置产品包装编码( 0:无包装; 1:有非新; 2:新)
     * 
     * @param goodsPackageName 产品包装编码( 0:无包装; 1:有非新; 2:新)
     */
    public void setGoodsPackageName(String goodsPackageName) {
        this.goodsPackageName = goodsPackageName;
    }

    /**
     * 获取产品包装编码( 0:无包装; 1:有非新; 2:新)
     */
    public String getGoodsPackageName() {
        return this.goodsPackageName;
    }

    /**
     * 设置商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     * 
     * @param goodsExteriorCode 商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     */
    public void setGoodsExteriorCode(String goodsExteriorCode) {
        this.goodsExteriorCode = goodsExteriorCode;
    }

    /**
     * 获取商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     */
    public String getGoodsExteriorCode() {
        return this.goodsExteriorCode;
    }

    /**
     * 设置商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     * 
     * @param goodsExteriorName 商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     */
    public void setGoodsExteriorName(String goodsExteriorName) {
        this.goodsExteriorName = goodsExteriorName;
    }

    /**
     * 获取商品外观编码（ 0:严重损; 1:轻微损; 2:新）
     */
    public String getGoodsExteriorName() {
        return this.goodsExteriorName;
    }

    /**
     * 设置商品功能编码 （0:坏; 1:好; 2:待检测）
     * 
     * @param goodsFunctionCode 商品功能编码 （0:坏; 1:好; 2:待检测）
     */
    public void setGoodsFunctionCode(String goodsFunctionCode) {
        this.goodsFunctionCode = goodsFunctionCode;
    }

    /**
     * 获取商品功能编码 （0:坏; 1:好; 2:待检测）
     */
    public String getGoodsFunctionCode() {
        return this.goodsFunctionCode;
    }

    /**
     * 设置商品功能编码 （0:坏; 1:好; 2:待检测）
     * 
     * @param goodsFunctionName 商品功能编码 （0:坏; 1:好; 2:待检测）
     */
    public void setGoodsFunctionName(String goodsFunctionName) {
        this.goodsFunctionName = goodsFunctionName;
    }

    /**
     * 获取商品功能编码 （0:坏; 1:好; 2:待检测）
     */
    public String getGoodsFunctionName() {
        return this.goodsFunctionName;
    }

    /**
     * 设置商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     * 
     * @param goodsPhaseCode 商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     */
    public void setGoodsPhaseCode(String goodsPhaseCode) {
        this.goodsPhaseCode = goodsPhaseCode;
    }

    /**
     * 获取商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     */
    public String getGoodsPhaseCode() {
        return this.goodsPhaseCode;
    }

    /**
     * 设置商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     * 
     * @param goodsPhaseName 商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     */
    public void setGoodsPhaseName(String goodsPhaseName) {
        this.goodsPhaseName = goodsPhaseName;
    }

    /**
     * 获取商品品相编码 （0:废品; 1:坏品; 2:良品; 3:新品）
     */
    public String getGoodsPhaseName() {
        return this.goodsPhaseName;
    }

    /**
     * 设置仓报价
     * 
     * @param goodsWarehousePrice 仓报价
     */
    public void setGoodsWarehousePrice(BigDecimal goodsWarehousePrice) {
        this.goodsWarehousePrice = goodsWarehousePrice;
    }

    /**
     * 获取仓报价
     */
    public BigDecimal getGoodsWarehousePrice() {
        return this.goodsWarehousePrice;
    }

    /**
     * 设置备件权属(0:京东权属;1:非京东权属)
     * 
     * @param goodsOwnership 备件权属(0:京东权属;1:非京东权属)
     */
    public void setGoodsOwnership(String goodsOwnership) {
        this.goodsOwnership = goodsOwnership;
    }

    /**
     * 获取备件权属(0:京东权属;1:非京东权属)
     */
    public String getGoodsOwnership() {
        return this.goodsOwnership;
    }

    /**
     * 设置是否碎屏 (0:完好; 1:已碎屏)
     * 
     * @param isBrokenScreen 是否碎屏 (0:完好; 1:已碎屏)
     */
    public void setIsBrokenScreen(Integer isBrokenScreen) {
        this.isBrokenScreen = isBrokenScreen;
    }

    /**
     * 获取是否碎屏 (0:完好; 1:已碎屏)
     */
    public Integer getIsBrokenScreen() {
        return this.isBrokenScreen;
    }

    /**
     * 设置附件情况（0:不完整; 1:完整）
     * 
     * @param isAttachmentComplete 附件情况（0:不完整; 1:完整）
     */
    public void setIsAttachmentComplete(Integer isAttachmentComplete) {
        this.isAttachmentComplete = isAttachmentComplete;
    }

    /**
     * 获取附件情况（0:不完整; 1:完整）
     */
    public Integer getIsAttachmentComplete() {
        return this.isAttachmentComplete;
    }

    /**
     * 设置附件详情
     * 
     * @param attachmentDesc 附件详情
     */
    public void setAttachmentDesc(String attachmentDesc) {
        this.attachmentDesc = attachmentDesc;
    }

    /**
     * 获取附件详情
     */
    public String getAttachmentDesc() {
        return this.attachmentDesc;
    }

    /**
     * 设置问题描述
     * 
     * @param questionDesc 问题描述
     */
    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    /**
     * 获取问题描述
     */
    public String getQuestionDesc() {
        return this.questionDesc;
    }

    /**
     * 设置1次鉴定单
     * 
     * @param firstIdentifyOrder 1次鉴定单
     */
    public void setFirstIdentifyOrder(String firstIdentifyOrder) {
        this.firstIdentifyOrder = firstIdentifyOrder;
    }

    /**
     * 获取1次鉴定单
     */
    public String getFirstIdentifyOrder() {
        return this.firstIdentifyOrder;
    }

    /**
     * 设置1次鉴定结果
     * 
     * @param firstIdentifyResult 1次鉴定结果
     */
    public void setFirstIdentifyResult(String firstIdentifyResult) {
        this.firstIdentifyResult = firstIdentifyResult;
    }

    /**
     * 获取1次鉴定结果
     */
    public String getFirstIdentifyResult() {
        return this.firstIdentifyResult;
    }

    /**
     * 设置1次鉴定URL
     * 
     * @param firstIdentifyUrl 1次鉴定URL
     */
    public void setFirstIdentifyUrl(String firstIdentifyUrl) {
        this.firstIdentifyUrl = firstIdentifyUrl;
    }

    /**
     * 获取1次鉴定URL
     */
    public String getFirstIdentifyUrl() {
        return this.firstIdentifyUrl;
    }

    /**
     * 设置2次鉴定单
     * 
     * @param secondaryIdentifyOrder 2次鉴定单
     */
    public void setSecondaryIdentifyOrder(String secondaryIdentifyOrder) {
        this.secondaryIdentifyOrder = secondaryIdentifyOrder;
    }

    /**
     * 获取2次鉴定单
     */
    public String getSecondaryIdentifyOrder() {
        return this.secondaryIdentifyOrder;
    }

    /**
     * 设置2次鉴定结果
     * 
     * @param secondaryIdentifyResult 2次鉴定结果
     */
    public void setSecondaryIdentifyResult(String secondaryIdentifyResult) {
        this.secondaryIdentifyResult = secondaryIdentifyResult;
    }

    /**
     * 获取2次鉴定结果
     */
    public String getSecondaryIdentifyResult() {
        return this.secondaryIdentifyResult;
    }

    /**
     * 设置2次鉴定URL
     * 
     * @param secondaryIdentifyUrl 2次鉴定URL
     */
    public void setSecondaryIdentifyUrl(String secondaryIdentifyUrl) {
        this.secondaryIdentifyUrl = secondaryIdentifyUrl;
    }

    /**
     * 获取2次鉴定URL
     */
    public String getSecondaryIdentifyUrl() {
        return this.secondaryIdentifyUrl;
    }

    /**
     * 设置入库单编号
     * 
     * @param stockInDocId 入库单编号
     */
    public void setStockInDocId(String stockInDocId) {
        this.stockInDocId = stockInDocId;
    }

    /**
     * 获取入库单编号
     */
    public String getStockInDocId() {
        return this.stockInDocId;
    }

    /**
     * 设置出库单编号
     * 
     * @param stockOutDocId 出库单编号
     */
    public void setStockOutDocId(String stockOutDocId) {
        this.stockOutDocId = stockOutDocId;
    }

    /**
     * 获取出库单编号
     */
    public String getStockOutDocId() {
        return this.stockOutDocId;
    }

    /**
     * 设置拆包登记时间
     * 
     * @param unpackingTime 拆包登记时间
     */
    public void setUnpackingTime(Date unpackingTime) {
        this.unpackingTime = unpackingTime;
    }

    /**
     * 获取拆包登记时间
     */
    public Date getUnpackingTime() {
        return this.unpackingTime;
    }

    /**
     * 设置拆包登记时间开始查询条件
     * 
     * @param unpackingTimeBegin 拆包登记时间开始查询条件
     */
    public void setUnpackingTimeBegin(Date unpackingTimeBegin) {
        this.unpackingTimeBegin = unpackingTimeBegin;
    }

    /**
     * 获取拆包登记时间开始查询条件
     */
    public Date getUnpackingTimeBegin() {
        return this.unpackingTimeBegin;
    }

    /**
     * 设置拆包登记时间截止查询条件
     * 
     * @param unpackingTimeEnd 拆包登记时间截止查询条件
     */
    public void setUnpackingTimeEnd(Date unpackingTimeEnd) {
        this.unpackingTimeEnd = unpackingTimeEnd;
    }

    /**
     * 获取拆包登记时间截止查询条件
     */
    public Date getUnpackingTimeEnd() {
        return this.unpackingTimeEnd;
    }

    /**
     * 设置打印次数
     * 
     * @param printCount 打印次数
     */
    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    /**
     * 获取打印次数
     */
    public Integer getPrintCount() {
        return this.printCount;
    }

    /**
     * 设置客服责任占比
     * 
     * @param dutyRateCustomerService 客服责任占比
     */
    public void setDutyRateCustomerService(Integer dutyRateCustomerService) {
        this.dutyRateCustomerService = dutyRateCustomerService;
    }

    /**
     * 获取客服责任占比
     */
    public Integer getDutyRateCustomerService() {
        return this.dutyRateCustomerService;
    }

    /**
     * 设置采销责任占比
     * 
     * @param dutyRateSales 采销责任占比
     */
    public void setDutyRateSales(Integer dutyRateSales) {
        this.dutyRateSales = dutyRateSales;
    }

    /**
     * 获取采销责任占比
     */
    public Integer getDutyRateSales() {
        return this.dutyRateSales;
    }

    /**
     * 设置承运商责任占比
     * 
     * @param dutyRateCarrier 承运商责任占比
     */
    public void setDutyRateCarrier(Integer dutyRateCarrier) {
        this.dutyRateCarrier = dutyRateCarrier;
    }

    /**
     * 获取承运商责任占比
     */
    public Integer getDutyRateCarrier() {
        return this.dutyRateCarrier;
    }

    /**
     * 设置供应商责任占比
     * 
     * @param dutyRateVendor 供应商责任占比
     */
    public void setDutyRateVendor(Integer dutyRateVendor) {
        this.dutyRateVendor = dutyRateVendor;
    }

    /**
     * 获取供应商责任占比
     */
    public Integer getDutyRateVendor() {
        return this.dutyRateVendor;
    }

    /**
     * 设置绑定时间
     * 
     * @param bindingTime 绑定时间
     */
    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }

    /**
     * 获取绑定时间
     */
    public Date getBindingTime() {
        return this.bindingTime;
    }

    /**
     * 设置绑定时间开始查询条件
     * 
     * @param bindingTimeBegin 绑定时间开始查询条件
     */
    public void setBindingTimeBegin(Date bindingTimeBegin) {
        this.bindingTimeBegin = bindingTimeBegin;
    }

    /**
     * 获取绑定时间开始查询条件
     */
    public Date getBindingTimeBegin() {
        return this.bindingTimeBegin;
    }

    /**
     * 设置绑定时间截止查询条件
     * 
     * @param bindingTimeEnd 绑定时间截止查询条件
     */
    public void setBindingTimeEnd(Date bindingTimeEnd) {
        this.bindingTimeEnd = bindingTimeEnd;
    }

    /**
     * 获取绑定时间截止查询条件
     */
    public Date getBindingTimeEnd() {
        return this.bindingTimeEnd;
    }

}