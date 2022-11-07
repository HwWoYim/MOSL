//package com.yim.biz.crawling;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//
//import com.yim.biz.product.Impl.ProductDAO;
//
///**
// * Application Lifecycle Listener implementation class CrawlingListener
// *
// */
//@WebListener
//public class CrawlingListener implements ServletContextListener {
//
//    /**
//     * Default constructor. 
//     */
//    public CrawlingListener() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
//     */
//    public void contextDestroyed(ServletContextEvent sce)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContextListener#contextInitialized(ServletContextEvent)
//     */
//    public void contextInitialized(ServletContextEvent sce)  { 
//         ServletContext sc = sce.getServletContext();
//         ProductDAO pDAO = new ProductDAO();
//         System.out.println("TestListener : contextListener파일에서 진행 중(톰캣 구동 감지)");
//         if(pDAO.selectAllProduct(null).size()<1) {
//        	 Crawling.data();
//         }
//         System.out.println("샘플 데이터 수집 완료");
//    }
//	
//}
