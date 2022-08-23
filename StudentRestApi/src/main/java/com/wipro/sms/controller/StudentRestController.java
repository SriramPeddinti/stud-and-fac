package com.wipro.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.sms.dto.Faculty;
import com.wipro.sms.dto.FacultyDTO;
import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entity.Student;
import com.wipro.sms.service.IStudentService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/v1/student")
public class StudentRestController {
	 
	@Autowired
	private IStudentService service;
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public Student addStudent(@RequestBody StudentDTO dto)
	{
		
		
		return service.addStudent(dto);
	}
	
	
	@GetMapping("/get")
	public List<Student> getAllStudents(){
		
		return service.getAllStudent();
		
	}
	

	
	@PostMapping("/faculty/get")
	public Faculty addFaculty(@RequestBody FacultyDTO dto)
	{
	ResponseEntity<Faculty> response=	restTemplate.postForEntity("http://localhost:8282/api/v1/faculty/add",dto, Faculty.class);
	
	return response.getBody();
	}
	
	
	
	@GetMapping("/faculty/getall")
	public List<Faculty> getAllFaculties()
	{
	ResponseEntity<List> response=	restTemplate.getForEntity("http://localhost:8282/api/v1/faculty/get", List.class);
	List<Faculty> list=response.getBody();
	return list;
	}
	
	
}
