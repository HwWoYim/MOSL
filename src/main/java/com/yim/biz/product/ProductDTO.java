package com.yim.biz.product;

public class ProductDTO {
	private int pnum; // 상품 번호 PK
	private String title; // 상품명
	private String pimg; // 상품 이미지
	private String country; // 상품 제조국
	private String subtitle; // 상품 부가 설명
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	@Override
	public String toString() {
		return "ProductDTO [pnum=" + pnum + ", title=" + title + ", pimg=" + pimg + ", country=" + country
				+ ", subtitle=" + subtitle + "]";
	}
}
