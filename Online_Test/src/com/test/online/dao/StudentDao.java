package com.test.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.online.bean.Student;
import com.test.online.common.util.ConnectionFactory;

public class StudentDao {

	public StudentDao() {

	}

	/*
	 * 保存学生信息
	 */
	public void save(Student student) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into student(student_number,name) values(?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, student.getStudent_number());
				pstmt.setString(2, student.getName());
				pstmt.executeUpdate();
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 修改学生信息
	 */
	public void update() {
	}

	/*
	 * 删除学生信息
	 */
	public void delect(String student_number) {

	}

	/*
	 * 查找学生信息
	 */
	public Student findBystudent_number(String student_number) {
		Student student = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			try {
				conn = ConnectionFactory.getConn();
				
				String sql="select * from student where student_number = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "student_number");
				rs = pstmt.executeQuery();
				while(rs.next()){
					String name = rs.getString("name");
					int score = rs.getInt("score");
					student = new Student(student_number, score, name); 
				}
			} finally {
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}
}
