package com.revature.faculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.faculty.dao.FacultyDao;

import com.revature.faculty.dto.InsertFacultyDto;

import com.revature.faculty.model.Faculty;
import com.revature.faculty.model.Organization;
import com.revature.faculty.model.Roles;

@Service
public class FacultyServiceImpl implements FacultyService {

	private Faculty faculty = new Faculty();

	private Roles role = new Roles();
	private Organization org = new Organization();

	@Autowired
	private FacultyDao facultyDao;

	@Transactional
	@Override
	public List<Faculty> getFaculty() {
		return facultyDao.get();
	}

	@Transactional
	@Override
	public Faculty get(Long id) {
		return facultyDao.get(id);
	}

	@Transactional
	@Override
	public void save(InsertFacultyDto dto) {
		Faculty faculty = new Faculty();
		if (dto.getId() == null) {
			faculty.setCreatedon(dto.getCreatedon());
			System.out.println("Object Not Exists");
		} else {
			faculty = facultyDao.get(dto.getId());
			faculty.setModifiedon(dto.getModifiedon());
			System.out.println("Object Exists");
			faculty.setId(dto.getId());
		}

		
		faculty.setEmployee_id(dto.getEmployee_id());
		org.setId(dto.getInstitution_id());
		faculty.setOrg(org);
		faculty.setFirst_name(dto.getFirst_name());
		faculty.setLast_name(dto.getLast_name());
		faculty.setDob(dto.getDob());
		faculty.setEmail(dto.getEmail());
		faculty.setMobile_no(dto.getMobile_no());
		role.setId(dto.getRole_id());
		faculty.setRoles(role);

		facultyDao.save(faculty);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		facultyDao.delete(id);

	}

	@Override
	public List<Faculty> getByInstitution(Long id) {
		return facultyDao.getByInstitution(id);

	}

}
