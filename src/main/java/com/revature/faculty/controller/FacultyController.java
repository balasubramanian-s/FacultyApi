package com.revature.faculty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.faculty.dto.InsertFacultyDto;
import com.revature.faculty.dto.UpdatefacultyDto;
import com.revature.faculty.model.Faculty;
import com.revature.faculty.model.Roles;
import com.revature.faculty.service.FacultyService;
import com.revature.faculty.service.RolesService;


@RestController
@RequestMapping("/emp")
@CrossOrigin(origins = "*")
public class FacultyController {
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private RolesService rolesService;
	

	@GetMapping("/faculty")
	public List<Faculty> get() {
		return facultyService.getFaculty();

	}

	@GetMapping("/faculty/institution/{inst_id}")
	public List<Faculty> getbyInst(@PathVariable Long inst_id) {

		return facultyService.getByInstitution(inst_id);
	}

	@GetMapping("/faculty/{id}")
	public Faculty get(@PathVariable Long id) {

		Faculty facObj = facultyService.get(id);

		return facObj;
	}

	@PostMapping("/faculty")
	public InsertFacultyDto save(@RequestBody InsertFacultyDto fac) {
		facultyService.save(fac);
		return fac;
	}

	@PutMapping("/faculty")
	public InsertFacultyDto update(@RequestBody InsertFacultyDto fac) {
		facultyService.save(fac);
		return fac;
	}

	@DeleteMapping("/faculty/{id}")
	public void delete(@PathVariable Long id) {
		facultyService.delete(id);
		System.out.println("Faculty Deleted With id:" + id);

	}
	
	//CONTROLLER FOR  ROLES
	@GetMapping("/role")
	public List<Roles> getRoles(){
		return rolesService.get();
	}
	@GetMapping("/role/{id}")
	public Roles getRolesById(@PathVariable Long id) {
		return rolesService.get(id);
		
	}
	@PostMapping("/role")
	public Roles save(@RequestBody Roles role) {
		rolesService.save(role);
		return role;
	}
	@PutMapping("/role")
	public Roles update(@RequestBody Roles role)
	{
		rolesService.save(role);
		return role;
		
	}
	@DeleteMapping("/role/{id}")
	public String deleteRole(@PathVariable Long id)
	{
		rolesService.delete(id);
		return "Role Deleted with id:"+id  ;
	}
	

}
