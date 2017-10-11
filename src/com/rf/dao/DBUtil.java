package com.rf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	private static final String URL="jdbc:mysql://localhost:3306/chenhao";
	private static final String USER="root";
	private static final String PASSWORD="199411";
	static Connection coon = null;
	static{
//		1、加载mysql驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			coon =   DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		2、建立连接（连接mysql数据库）
		
	}
	
	public static Connection getConnection(){
		return coon;
	}
	
	
	
	public static void main(String[] args) throws Exception {
//		1、加载mysql驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2、建立连接（连接mysql数据库）
		Connection coon =   DriverManager.getConnection(URL, USER, PASSWORD);
//		3、通过数据库的连接操作数据库，实现增删改查
		Statement st =  coon.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"  "+rs.getString("stuname")+"  "+rs.getInt("age")+"  "+rs.getString("sex"));
		}
		
	}
}
