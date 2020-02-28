package com.revature.faculty.service;

import java.util.List;

import com.revature.faculty.model.Faculty;

public interface FacultyService {
	List<Faculty> get();
	
	Faculty get(int id);
	
	void save (Faculty fac);
	
	void delete(int id);
	
	List<Faculty> getByInstitution(int id);
}
