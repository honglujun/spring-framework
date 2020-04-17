package com.springframework.learn.aop.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TestDao {

	@Transactional
	public void query() {
		System.out.println("Hello Spring!");
	}

}
