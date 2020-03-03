package com.revature.faculty.service;

import java.util.List;

import com.revature.faculty.model.Roles;

public interface RolesService {
	List<Roles>  get();
	
	Roles get(int id);
	
	void save(Roles role);
	
	void delete(int id);
	
	
}
