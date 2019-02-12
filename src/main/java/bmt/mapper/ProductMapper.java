package bmt.mapper;

import java.util.List;

import bmt.entity.Product;

/**
 * Title: ProductMapper Description:商品Mapper
 * 
 * @author Dalphist
 * @date 2019年2月11日
 */
public interface ProductMapper {
	/**
	   *返回商品集合
	 * @return
	 */
	public List<Product> selectProductList();

	public Integer addProduct(Product product);

}
