package com.rf.service;

import java.util.List;

import com.rf.bean.Page;
import com.rf.bean.Student;
public interface StudentService {
	public List<Student> query();
	public Page query1(Page page);
}
