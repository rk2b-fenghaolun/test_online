package com.test.online.common.test;

import com.test.online.bean.Student;
import com.test.online.dao.StudentDao;



public class Daotest {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		dao.save(new Student("13223203", 100, "11"));
		System.out.println("success!");
	}
}
