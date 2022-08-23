package com.wipro.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.fms.dto.FacultyDTO;
import com.wipro.fms.entity.Faculty;
import com.wipro.fms.repository.FacultyRepository;
@Service
public class FacultyService implements IFacultyService {

	@Autowired
	private FacultyRepository repo;
	
	@Override
	public Faculty addFaculty(FacultyDTO dto) {
		// TODO Auto-generated method stub
		Faculty faculty=new Faculty();
		faculty.setId(dto.getId());
		faculty.setName(dto.getName());
		faculty.setEmail(dto.getEmail());
		faculty.setCourse(dto.getCourse());
		faculty.setSalary(dto.getSalary());
		
		return repo.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
