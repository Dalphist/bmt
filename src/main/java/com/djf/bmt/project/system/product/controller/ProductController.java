package com.djf.bmt.project.system.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djf.bmt.project.system.product.entity.Product;
import com.djf.bmt.project.system.product.service.ProductServiceImpl;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping()
    @ResponseBody
    public PageInfo<Product> getProduct(){
        PageInfo<Product> productPage = productService.selectProductList();
        return productPage;
    }
}
