package com.springframework.learn.aop.dao;


import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	public void query(){
		System.out.println("Hello Spring!");
	}

}
