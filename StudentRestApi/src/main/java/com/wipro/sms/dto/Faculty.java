package com.wipro.sms.dto;

public class Faculty {

	private long id;
	private String name;
	private String course;
	private String email;
	private long salary;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(long id, String name, String course, String email, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
