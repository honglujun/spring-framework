package com.springframework.learn.aop.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 这个类相当于xml的bean文件
 *
 * @author win10
 */
@Configuration
@ComponentScan("com.springframework")
public class AppConfig {

	public void outPrint() {
		System.out.println("打印AppConfig的outPrint()方法");
	}
}
