package bmt.mapper;

import java.util.List;

import bmt.entity.Product;

public interface ProductMapper
{
    public List<Product> selectProductList();

	public Integer addProduct(Product product);

}
