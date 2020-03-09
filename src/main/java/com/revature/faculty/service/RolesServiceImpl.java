package com.revature.faculty.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.faculty.dao.RolesDao;
import com.revature.faculty.model.Roles;
import org.springframework.transaction.annotation.Transactional;
@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesDao rolesDao;
	
	@Transactional
	@Override
	public List<Roles> get() {
		
		return rolesDao.get();
	}
	@Transactional
	@Override
	public Roles get(Long id) {
		
		return rolesDao.get(id);
	}
	@Transactional
	@Override
	public void save(Roles role) {
		rolesDao.save(role);

	}
	@Transactional
	@Override
	public void delete(Long id) {
		rolesDao.delete(id);

	}
	

}
