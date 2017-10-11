package com.rf.service.impl;

import java.util.List;

import com.rf.bean.Page;
import com.rf.bean.Student;
import com.rf.dao.StudentDao;
import com.rf.dao.impl.StudentDaoImpl;
import com.rf.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> query() {
		// TODO Auto-generated method stub
		StudentDao sd = new StudentDaoImpl();
		
		return sd.query();
	}

	@Override
	public Page query1(Page page) {
		// TODO Auto-generated method stub
		StudentDao sd = new StudentDaoImpl();
		return sd.query1(page);
	}
	

	
}
