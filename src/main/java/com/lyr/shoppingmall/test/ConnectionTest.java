package com.lyr.shoppingmall.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.lyr.shoppingmall.entity.User;
import com.lyr.shoppingmall.utils.HibernateUtils;

public class ConnectionTest {

	@Test
	public void fun(){
		
		//获取session
		Session session  = HibernateUtils.openSession();
		//打开事务
		Transaction beginTransaction = session.beginTransaction();
		
		//User u = new User();
		User user = session.get(User.class,"373eb242933b4f5ca3bd43503c34668b");
		System.out.println(user);
		
		//提交事务
		beginTransaction.commit();
		session.close();
	}
	@Test
	public void fun1(){
		
		//获取session
		Session session  = HibernateUtils.openSession();
		//打开事务
		Transaction beginTransaction = session.beginTransaction();
		
		//User u = new User();
		User user = session.load(User.class,"373eb242933b4f5ca3bd43503c34668b");
		System.out.println(user);
		
		//提交事务
		beginTransaction.commit();
		session.close();
	}
	
}
