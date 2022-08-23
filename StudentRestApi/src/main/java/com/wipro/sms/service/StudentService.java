package com.wipro.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entity.Student;
import com.wipro.sms.repository.StudentRepository;


@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Student addStudent(StudentDTO dto) {
		
		Student student= new Student();
		
			student.setUname(dto.getUname());
			student.setPassword(dto.getPassword());
			student.setEmail(dto.getEmail());
			student.setGender(dto.getGender());
			student.setCourse(dto.getCourse());
			student.setDob(dto.getDob());
			student.setCourse(dto.getCourse());
			student.setPhone(dto.getPhone());
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	public static boolean validateStudent(StudentDTO dto) {
		
	boolean flag=false;	
	
		if(dto.getUname() != null && dto.getPassword() !=null) {
			
			flag=true;
			
		}
		
		return flag;
			
	}

}
