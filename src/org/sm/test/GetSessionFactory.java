package org.sm.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSessionFactory {

	
	private static SqlSessionFactory sqlSessionFactory = null;
	
	static {
		
		try {
			InputStream inputStream = Resources.getResourceAsStream("conf.xml");
		     sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static SqlSession getSqlSession() {
		
		return  sqlSessionFactory.openSession();
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		
		return sqlSessionFactory;
	}
	
}
