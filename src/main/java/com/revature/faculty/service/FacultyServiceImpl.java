package com.revature.faculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.faculty.dao.FacultyDao;
import com.revature.faculty.dto.InsertFacultyDto;
import com.revature.faculty.model.Faculty;
import com.revature.faculty.model.Roles;

@Service
public class FacultyServiceImpl implements FacultyService {

	private Faculty faculty = new Faculty();
	private Roles role = new Roles();

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
	public void save(InsertFacultyDto dto) {

		/*
		 * if(fac.getId()==null) { fac.setCreatedon(ts); } else { fac.setModifiedon(ts);
		 * }
		 */
		faculty.setEmployee_id(dto.getEmployee_id());
		
		
		faculty.setFirst_name(dto.getFirst_name());
		faculty.setLast_name(dto.getLast_name());
		faculty.setDob(dto.getDob());
		faculty.setEmail(dto.getEmail());
		faculty.setMobile_no(dto.getMobile_no());
		role.setId(dto.getRole_id());
		faculty.setRoles(role);
		faculty.setCreatedon(dto.getCreatedon());

		facultyDao.save(faculty);
	}

	@Transactional
	@Override
	public void delete(int id) {
		facultyDao.delete(id);

	}

	@Override
	public List<Faculty> getByInstitution(int id) {
		return facultyDao.getByInstitution(id);

	}

}
