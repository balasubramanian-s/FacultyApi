package com.revature.faculty.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.faculty.dao.FacultyDao;
import com.revature.faculty.dto.GetFacultyDto;
import com.revature.faculty.dto.InsertFacultyDto;
import com.revature.faculty.model.Faculty;
import com.revature.faculty.model.Organization;
import com.revature.faculty.model.Roles;

@Service
public class FacultyServiceImpl implements FacultyService {

	private Faculty faculty = new Faculty();
	GetFacultyDto Gdto = new GetFacultyDto();
	private Roles role = new Roles();
	private Organization org = new Organization();

	@Autowired
	private FacultyDao facultyDao;

	@Transactional
	@Override
	public List<GetFacultyDto> getFaculty() {
		List<GetFacultyDto> dto=new ArrayList<GetFacultyDto>();
		List<Faculty> list=new ArrayList<Faculty>();
		for(Faculty a:list) {
			Gdto.setFirst_name(a.getFirst_name());
			Gdto.setLast_name(a.getLast_name());
			Gdto.setDob(a.getDob());
			Gdto.setEmail(a.getEmail());
			Gdto.setMobile_no(a.getMobile_no());
			role=a.getRoles();
			Gdto.setRole(role.getName());
			org=a.getOrg();
			Gdto.setInstitution(org.getName());
			dto.add(Gdto);
		}
		return dto;
	}

	@Transactional
	@Override
	public GetFacultyDto get(int id) {
		faculty = facultyDao.get(id);
		GetFacultyDto dto = new GetFacultyDto();
		org = faculty.getOrg();
		dto.setInstitution(org.getName());
		dto.setFirst_name(faculty.getFirst_name());
		dto.setLast_name(faculty.getLast_name());
		dto.setDob(faculty.getDob());
		dto.setEmail(faculty.getEmail());
		dto.setMobile_no(faculty.getMobile_no());
		role = faculty.getRoles();
		dto.setRole(role.getName());
		return dto;
	}

	@Transactional
	@Override
	public void save(InsertFacultyDto dto) {

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
