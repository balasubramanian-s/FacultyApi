package com.revature.faculty.dao;

import java.util.List;

import com.revature.faculty.model.Roles;

public interface RolesDao {
	List<Roles>  get();
	
	Roles get(int id);
	
	void save(Roles role);
	
	void delete(int id);
	
	

}
