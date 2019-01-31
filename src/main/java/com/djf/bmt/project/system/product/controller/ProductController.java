package com.djf.bmt.project.system.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.djf.bmt.framework.web.domain.ResultBean;
import com.djf.bmt.project.system.product.entity.Product;
import com.djf.bmt.project.system.product.service.ProductServiceImpl;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/list")
    @ResponseBody
    public PageInfo<Product> getProduct(){
        PageInfo<Product> productPage = productService.selectProductList();
        return productPage;
    }
    
    @PostMapping("/add")
    @ResponseBody
    public ResultBean<String> addProduct(@RequestBody String productJson){
    	Product product = JSON.parseObject(productJson, Product.class);
    	String id = productService.addProduct(product);
        return new ResultBean<String>(id);
    }
}
