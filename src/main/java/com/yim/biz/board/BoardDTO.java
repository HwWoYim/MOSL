package com.yim.biz.board;



public class BoardDTO {
	private int bnum;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private String bdate;
	private int cnt;
	private int gcnt;
	private int bcnt;
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getGcnt() {
		return gcnt;
	}
	public void setGcnt(int gcnt) {
		this.gcnt = gcnt;
	}
	public int getBcnt() {
		return bcnt;
	}
	public void setBcnt(int bcnt) {
		this.bcnt = bcnt;
	}
	@Override
	public String toString() {
		return "BoardDTO [bnum=" + bnum + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bdate=" + bdate + ", cnt=" + cnt + ", gcnt=" + gcnt + ", bcnt=" + bcnt + "]";
	}
	
	
}
