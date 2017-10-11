package com.rf.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rf.bean.Page;
import com.rf.bean.Student;
import com.rf.dao.DBUtil;
import com.rf.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> query() {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from student";
		Statement st = null;
		try {
			 st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> list = new ArrayList<Student>();
		try {
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setStuname(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
				stu.setSex(rs.getString("sex").charAt(0));
				stu.setBirthday(new Date(rs.getDate("birth").getTime()));
				list.add(stu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	
	@Override
	public Page query1(Page page) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from student limit ";
		StringBuffer sb = new StringBuffer();
		sb.append(sql);
		sb.append((page.getPage()-1)*4);
		sb.append(",4");
		Statement st = null;
		try {
			 st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sb.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Student> list = new ArrayList<Student>();
		try {
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setStuname(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
				stu.setSex(rs.getString("sex").charAt(0));
				stu.setBirthday(new Date(rs.getDate("birth").getTime()));
				list.add(stu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.setList(list);
		page.setTotarows(msgcount());
		return page;
	}


	@Override
	public int msgcount() {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnection();
		String sql = "select * from student"; 
		Statement st = null;
		
		try {
			 st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int  num = 0;
		List<Student> list = new ArrayList<Student>();
		try {
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setStuname(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
				stu.setSex(rs.getString("sex").charAt(0));
				stu.setBirthday(new Date(rs.getDate("birth").getTime()));
				list.add(stu);
				num++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return num;
	}

	
}
