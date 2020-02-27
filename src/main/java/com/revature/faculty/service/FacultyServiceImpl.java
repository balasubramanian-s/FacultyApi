package com.revature.faculty.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.faculty.dao.FacultyDao;
import com.revature.faculty.model.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyDao facultyDao;
	
	@Transactional
	@Override
	public List<Faculty> get() {		
		return facultyDao.get();
	}
	@Transactional
	@Override
	public Faculty get(int id) {
		
		return facultyDao.get(id);
	}
	@Transactional
	@Override
	public void save(Faculty fac) {
		Instant ts = Instant.now();	
		if(fac.getId()==null) {
			fac.setCreatedon(ts);			
		}
		else {
			fac.setModifiedon(ts);
		}		
		facultyDao.save(fac);
	}
	@Transactional
	@Override
	public void delete(int id) {
		 facultyDao.delete(id);
		
	}

}
