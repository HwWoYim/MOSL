package com.yim.biz.crawling;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public static void data() {
		
		int count = 0;
		for(int i=1; i<3; i++) {
			String url="http://www.e-himart.co.kr/app/search/totalSearch?query=%ED%82%A4%EB%B3%B4%EB%93%9C&optChk=&FROM=WEBTOP&cateFilterYn=Y#pageCount="+i;
			Document doc = null;
			try {
				// 사이트 연결 및 데이터 저장 : 지역변수 url로부터 HTML문서 가져오기
				doc=Jsoup.connect(url).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String img = "div.prdItem > div.prdImg > img"; // 상품 사진
			
			Elements elem = doc.select("div.prdItemList.atypicalPrdList"); // 해당 div요소 안에 있는 정보들을 가져옴
			Elements img2 = elem.select(img); // 상품 사진
			
			Iterator<Element> img3 = img2.iterator(); // 상품 사진
			
			while(img3.hasNext()) {
				
			// 상품 사진
			String img4 = img3.next().attr("src");
			System.out.println("이미지 URL : " + img4);
			}
		}
	}
}
