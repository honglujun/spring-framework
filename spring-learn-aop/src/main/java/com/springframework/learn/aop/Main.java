package com.springframework.learn.aop;

import com.springframework.learn.aop.app.Appconfig;
import com.springframework.learn.aop.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		TestDao testDao = annotationConfigApplicationContext.getBean(TestDao.class);
		testDao.query();
	}
}
