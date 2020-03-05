package com.revature.faculty.service;

import java.util.List;

import com.revature.faculty.dto.GetFacultyDto;
import com.revature.faculty.dto.InsertFacultyDto;
import com.revature.faculty.model.Faculty;


public interface FacultyService {
	List<GetFacultyDto> getFaculty();
	
	GetFacultyDto get(int id);
	
	void save (InsertFacultyDto fac);
	
	void delete(int id);
	
	List<Faculty> getByInstitution(int id);
}
