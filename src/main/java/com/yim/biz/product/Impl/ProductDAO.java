package com.yim.biz.product.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yim.biz.product.ProductDTO;

@Repository("productDAO")
public class ProductDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertProduct(ProductDTO dto) {
		mybatis.insert("ProductDAO.insertProduct", dto);
	}
	public void updateProduct(ProductDTO dto) {
		mybatis.update("ProductDAO.updateProduct", dto);
	}
	public void deleteProduct(ProductDTO dto) {
		mybatis.delete("ProductDAO.deleteProduct", dto);
	}
	public ProductDTO selectOneProduct(ProductDTO dto) {
		return mybatis.selectOne("ProductDAO.selectOneProduct", dto);
	}
	public List<ProductDTO> selectAllProduct(ProductDTO dto){
		return mybatis.selectList("ProductDAO.selectAllProduct", dto);
	}
}
