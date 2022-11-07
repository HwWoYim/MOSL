package com.yim.biz.product;

import java.util.List;

public interface ProductService {
	// 상품 추가
	public void insertProduct(ProductDTO dto);
	// 상품 정보 변경
	public void updateProduct(ProductDTO dto);
	// 상품 삭제
	public void deleteProduct(ProductDTO dto);
	// 상품 상세보기
	public ProductDTO selectOneProduct(ProductDTO dto);
	// 상품 목록보기
	public List<ProductDTO> selectAllProduct(ProductDTO dto);
}
