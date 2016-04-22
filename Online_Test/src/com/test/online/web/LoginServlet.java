package com.test.online.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.online.common.exception.ServiceException;
import com.test.online.service.IStudentService;
import com.test.online.service.impl.StudentServiceImpl;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private IStudentService studentservice;
	
    public LoginServlet() {
        super();
        studentservice = new StudentServiceImpl();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String student_number = request.getParameter("student_number");
		String name = request.getParameter("name");
		
		studentservice.login(student_number, name);
		
		request.getRequestDispatcher("/success.jsp").forward(request, response);
		
	}

}
