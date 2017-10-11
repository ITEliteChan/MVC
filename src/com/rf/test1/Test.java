package com.rf.test1;

import java.util.List;

import com.rf.bean.Page;
import com.rf.bean.Student;
import com.rf.service.StudentService;
import com.rf.service.impl.StudentServiceImpl;

public class Test {
public static void main(String[] args) {
	StudentService ss = new StudentServiceImpl();
//	List<Student> list = ss.query();
	
	Page page1 = new Page();
	page1.setPage(1);
	
	Page page = ss.query1(page1);
	List<?> list =page.getList();
	for(Object s:list){
		Student stu = (Student)s;
		System.out.println(stu.getId()+"\t"+stu.getStuname()+"\t");
	}
	System.out.println("一共有："+page.getTotarows()+"条信息");
	System.out.println("一共有："+page.getTotopage()+"页");

}
}
