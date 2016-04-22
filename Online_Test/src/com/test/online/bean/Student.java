package com.test.online.bean;

public class Student {
	private int id;
	private String student_number;
	private int score;
	private String name;
	
	public Student(String student_number, int score, String name) {
		super();
		this.student_number = student_number;
		this.score = score;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_number() {
		return student_number;
	}
	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
