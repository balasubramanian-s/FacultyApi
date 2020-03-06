package com.revature.faculty.service;

import java.util.List;


import com.revature.faculty.dto.InsertFacultyDto;

import com.revature.faculty.model.Faculty;


public interface FacultyService {
	List<Faculty> getFaculty();
	
	Faculty get(int id);
	
	void save (InsertFacultyDto dto);
	
	
	
	void delete(int id);
	
	List<Faculty> getByInstitution(int id);
}
