package com.revature.faculty.dao;

import java.util.List;


import com.revature.faculty.model.Faculty;

public interface FacultyDao {
	
	List<Faculty> get();
	
	Faculty get(Long id);
	
	void save (Faculty fac);
	
	
	
	void delete(Long id);

	List<Faculty> getByInstitution(Long id);

	

}
