package org.sm.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.sm.entity.User;
import org.sm.mapper.UserMapper;

public class TestSql {
	
    @Test
	public void Test1() {
		
    	SqlSession session = GetSessionFactory.getSqlSession();
		
    	UserMapper userMapper = session.getMapper(UserMapper.class);
    	
    	User user = userMapper.selectUserWithId(1) ;
    	
    	System.out.println(user);
    	
    	session.commit();
    	user = userMapper.selectUserWithId(1) ;
    	
    	System.out.println(user);
	}
	
    @Test
   	public void Test2() {
   		
       	SqlSession session = GetSessionFactory.getSqlSession();
   		
       	UserMapper userMapper = session.getMapper(UserMapper.class);
       	
       	User user = userMapper.selectUserWithId(1) ;     
       	System.out.println(user);
       	
       	session.close();
       	
       	session = GetSessionFactory.getSqlSession();
       	userMapper = session.getMapper(UserMapper.class);
       	user = userMapper.selectUserWithId(1) ;  
       	
	    session.close();
       	
       	session = GetSessionFactory.getSqlSession();
       	userMapper = session.getMapper(UserMapper.class);
       	user = userMapper.selectUserWithId(1) ;  
       	
   	}
    
    @Test
   	public void Test3() {
   		
       	SqlSession session = GetSessionFactory.getSqlSession();
   		
       	UserMapper userMapper = session.getMapper(UserMapper.class);
       	
       	User user = userMapper.selectUserWithId(1) ;     
       	System.out.println(user);
       	
       	session.commit();
       	
       	 user = userMapper.selectUserWithId(1) ;     
       	System.out.println(user);
       	session.close();
   	}
    
    
    @Test // 通过注解的形式调用方法 执行sql
   	public void Test4() {
   		try {
   		  	SqlSession session = GetSessionFactory.getSqlSession();
   	   		
   	       	UserMapper userMapper = session.getMapper(UserMapper.class);
   	       	
   	       	User user = userMapper.selectUserWithId(1) ;     
   	       	System.out.println(user);
   	       	session.commit();
   	       	session.close();
		} catch (Exception e) {
			// TODO: handle exception
		
		  e.printStackTrace();
		}
     
       	
   	}
}
