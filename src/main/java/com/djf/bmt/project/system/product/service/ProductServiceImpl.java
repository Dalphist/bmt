package com.djf.bmt.project.system.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djf.bmt.project.system.product.entity.Product;
import com.djf.bmt.project.system.product.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> selectProductList() {
        PageHelper.startPage(1, 5);
        List<Product> list = productMapper.selectProductList();
        return new PageInfo<>(list);
    }

	@Override
	public String addProduct(Product product) {
		productMapper.addProduct(product);
		return product.getId();
	}
    
    
}
