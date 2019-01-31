package bmt.service;

import com.github.pagehelper.PageInfo;

import bmt.entity.Product;

public interface ProductService {
    public PageInfo<Product> selectProductList();
    
    public String addProduct(Product product);
}
