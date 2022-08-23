package com.wipro.fms.dto;

public class FacultyDTO {

	private long id;
	private String name;
	private String course;
	private String email;
	private long salary;
	public FacultyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultyDTO(long id, String name, String course, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	public FacultyDTO(String email) {
		super();
		this.email = email;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
