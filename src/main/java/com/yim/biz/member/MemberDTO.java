package com.yim.biz.member;

public class MemberDTO {
	private String mid; // 회원 ID
	private String mpw; // 회원 비밀번호
	private String mname; // 회원 이름
	private String mbirth; // 회원 생년월일
	private String memail; // 회원 이메일
	private String mphone; // 회원 전화번호
	private String madd; // 회원 주소
	private String mrole; // 회원 권한
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMbirth() {
		return mbirth;
	}
	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMadd() {
		return madd;
	}
	public void setMadd(String madd) {
		this.madd = madd;
	}
	public String getMrole() {
		return mrole;
	}
	public void setMrole(String mrole) {
		this.mrole = mrole;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", mbirth=" + mbirth + ", memail="
				+ memail + ", mphone=" + mphone + ", madd=" + madd + ", mrole=" + mrole + "]";
	}
}
