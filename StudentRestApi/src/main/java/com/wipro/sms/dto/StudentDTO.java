package com.wipro.sms.dto;

import java.time.LocalDate;

public class StudentDTO {
	
		
		private long id;
		private String uname;
		private String password;
		private String email;
		private String gender;
		private LocalDate dob;
		private long phone;
		private String course;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public StudentDTO(long id, String uname, String password, String email, String gender, LocalDate dob,
				long phone, String course) {
			super();
			this.id = id;
			this.uname = uname;
			this.password = password;
			this.email = email;
			this.gender = gender;
			this.dob = dob;
			this.phone = phone;
			this.course = course;
		}
		public StudentDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

	}

