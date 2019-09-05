package com.woniu.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.woniu.a.Aapptest;



public class MybatisUtils {
	private static SqlSessionFactory sf;
	
	static {
		InputStream in = Aapptest.class.getResourceAsStream("mybatis-config.xml");
		sf = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSession openSession() {
		
		return sf.openSession(true);
	}
}
