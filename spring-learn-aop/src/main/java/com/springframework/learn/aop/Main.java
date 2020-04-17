package com.springframework.learn.aop;

import com.springframework.learn.aop.app.AppConfig;
import com.springframework.learn.aop.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author win10
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestDao testDao = annotationConfigApplicationContext.getBean(TestDao.class);
		AppConfig bean = annotationConfigApplicationContext.getBean(AppConfig.class);
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();

		testDao.query();
		bean.outPrint();
	}
}
