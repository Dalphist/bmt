package bmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bmt.entity.Product;
import bmt.mapper.ProductMapper;

/**
* Title: ProductServiceImpl  
* Description:
* @author Dalphist  
* @date 2019年2月11日
 */
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
