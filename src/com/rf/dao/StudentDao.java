package com.rf.dao;

import java.util.List;

import com.rf.bean.Page;
import com.rf.bean.Student;

public interface StudentDao {

	public List<Student> query();
	public Page query1(Page page);
	public int msgcount();
	
}
