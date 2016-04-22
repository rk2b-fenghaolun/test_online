package com.test.online.service;

import com.test.online.bean.Student;
import com.test.online.common.exception.ServiceException;

public interface IStudentService {
	public Student login(String student_number, String name) throws ServiceException;
	public void insterstudent(Student student) throws ServiceException;
}
