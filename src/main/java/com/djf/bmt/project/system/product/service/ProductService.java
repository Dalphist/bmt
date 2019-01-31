package com.djf.bmt.project.system.product.service;

import com.djf.bmt.project.system.product.entity.Product;
import com.github.pagehelper.PageInfo;

public interface ProductService {
    public PageInfo<Product> selectProductList();
    
    public String addProduct(Product product);
}
