/**
 * Copyright (c) 2016, 2017, JD and/or its affiliates. All rights reserved.
 */
package com.jd.las.spare.portal.controller.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.las.spare.domain.stock.StockGoods;
import com.jd.las.spare.manager.context.Account;
import com.jd.las.spare.manager.util.AccountUtils;
import com.jd.las.spare.model.domain.Page;
import com.jd.las.spare.model.domain.Sort;
import com.jd.las.spare.portal.controller.BaseController;
import com.jd.las.spare.stock.core.service.StockGoodsService;

/**
 * 库存商品表Controller
 * 
 * @author
 */
@Controller
@RequestMapping("/web/stock/stockgoods")
public class StockGoodsController extends BaseController {

    @Autowired
    StockGoodsService stockGoodsService;

    /**
     * 显示列表页面
     */
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    public String listPage() {
        return "stock/StockGoods/stock_goods_list";
    }

    /**
     * 显示新增页面
     */
    @RequestMapping(value = "/addPage", method = RequestMethod.GET)
    public String addPage() {
        return "stock/StockGoods/stock_goods_add";
    }

    /**
     * 显示修改页面
     */
    @RequestMapping(value = "/editPage", method = RequestMethod.GET)
    public String editPage(Long id, Model model) {
        //TODO 数据验证
        return "stock/StockGoods/stock_goods_edit";
    }

    /**
     * 保存数据
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public boolean insert(StockGoods stockGoods) {
        //TODO 数据验证
        Account account = AccountUtils.getCurrentAccount();
        this.stockGoodsService.insert(stockGoods, account.getErp());
        return true;
    }

    /**
     * 修改数据
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public boolean update(StockGoods stockGoodsUpdate) {
        //TODO 数据验证
        Account account = AccountUtils.getCurrentAccount();
        int rows = this.stockGoodsService.update(stockGoodsUpdate, account.getErp());
        if (rows == 1) {
            	return true;
        }
        return false;
    }

    /**
     * 逻辑删除数据
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public boolean delete(Long id) {
        //TODO 数据验证
        Account account = AccountUtils.getCurrentAccount();
        int rows = this.stockGoodsService.delete(id, account.getErp());
        if (rows == 1) {
            	return true;
        }
        return false;
    }

    /**
     * 分页查询
     */
    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    @ResponseBody
    public Page<StockGoods> pageQuery(StockGoods stockGoodsQuery, @RequestParam(value = "page", required = false, defaultValue = "1") int pageNum, @RequestParam(value = "rows", required = false, defaultValue = "20") int pageSize, @RequestParam(value = "sidx", required = false, defaultValue = "ts") String sortName, @RequestParam(value = "sord", required = false, defaultValue = "desc") String sortOrder) {
        //TODO 数据验证
        
        // 设置合理的参数
        if (pageNum < 1) {
            	pageNum = 1;
        }
        if (pageSize < 1) {
            	pageSize = 20;
        } else if (pageSize > 100) {
            	pageSize = 100;
        }
        // 开始页码
        int pageIndex = pageNum - 1;
        // 排序
        Sort sort = null;
        if ("desc".equalsIgnoreCase(sortOrder)) {
            	sort = Sort.desc(sortName);
        } else {
            	sort = Sort.asc(sortName);
        }
        // 创建分页对象
        Page<StockGoods> page = new Page<StockGoods>(pageIndex, pageSize, sort);
        // 执行查询
        page = this.stockGoodsService.selectPage(stockGoodsQuery, page);
        // 返回查询结果
        return page;
    }

}