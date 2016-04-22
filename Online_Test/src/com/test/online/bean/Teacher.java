package com.test.online.bean;

public class Teacher {
	private int id;
	private String teacher_number;
	private String password;

	public Teacher(String teacher_number, String password) {
		super();
		this.teacher_number = teacher_number;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher_number() {
		return teacher_number;
	}

	public void setTeacher_number(String teacher_number) {
		this.teacher_number = teacher_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
