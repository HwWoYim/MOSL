package com.yim.biz.product.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yim.biz.product.ProductDTO;
import com.yim.biz.product.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public void insertProduct(ProductDTO dto) {
		productDAO.insertProduct(dto);
		
	}

	@Override
	public void updateProduct(ProductDTO dto) {
		productDAO.updateProduct(dto);
		
	}

	@Override
	public void deleteProduct(ProductDTO dto) {
		productDAO.deleteProduct(dto);
		
	}

	@Override
	public ProductDTO selectOneProduct(ProductDTO dto) {
		return productDAO.selectOneProduct(dto);
	}

	@Override
	public List<ProductDTO> selectAllProduct(ProductDTO dto) {
		return productDAO.selectAllProduct(dto);
	}

}
