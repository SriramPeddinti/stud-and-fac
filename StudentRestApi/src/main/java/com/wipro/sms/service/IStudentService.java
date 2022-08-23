package com.wipro.sms.service;

import java.util.List;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entity.Student;


public interface IStudentService {
	
	
	public Student addStudent(StudentDTO dto);
	
	public List<Student> getAllStudent();


	
	
	
	
	

}
