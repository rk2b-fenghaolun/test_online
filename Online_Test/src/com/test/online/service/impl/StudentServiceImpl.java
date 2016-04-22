package com.test.online.service.impl;

import com.test.online.bean.Student;
import com.test.online.common.exception.ServiceException;
import com.test.online.dao.StudentDao;
import com.test.online.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentDao studentDao;

	public StudentServiceImpl() {
		studentDao = new StudentDao();
	}

	public Student login(String student_number, String name) throws ServiceException {
		Student student = null;
		Student dbstudent = studentDao.findBystudent_number(student_number);
		if(dbstudent != null){
			if (dbstudent.getName().equalsIgnoreCase(name)){
				student = dbstudent;
			}
			else{
				throw new ServiceException("考生姓名错误");
			}
		}
		else{
				throw new ServiceException("准考证号错误");
			}
		return student;
		
	}

	@Override
	public void insterstudent(Student student) throws ServiceException {
		// TODO Auto-generated method stub

	}

}
