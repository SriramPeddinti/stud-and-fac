package com.wipro.fms.service;

import java.util.List;

import com.wipro.fms.dto.FacultyDTO;
import com.wipro.fms.entity.Faculty;

public interface IFacultyService {

	public Faculty addFaculty(FacultyDTO dto);
	
	
	public List<Faculty> getAllFaculty();
	
}
