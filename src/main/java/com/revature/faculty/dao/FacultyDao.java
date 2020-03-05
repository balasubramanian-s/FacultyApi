package com.revature.faculty.dao;

import java.util.List;

import com.revature.faculty.dto.GetFacultyDto;
import com.revature.faculty.model.Faculty;

public interface FacultyDao {
	
	List<Faculty> get();
	
	Faculty get(int id);
	
	void save (Faculty fac);
	
	void delete(int id);

	List<Faculty> getByInstitution(int id);

}
