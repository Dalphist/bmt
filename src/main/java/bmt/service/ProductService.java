package bmt.service;

import com.github.pagehelper.PageInfo;

import bmt.entity.Product;

/**
* Title: ProductService  
* Description:
* @author Dalphist  
* @date 2019年2月11日
 */
public interface ProductService {
    public PageInfo<Product> selectProductList();
    
    public String addProduct(Product product);
}
