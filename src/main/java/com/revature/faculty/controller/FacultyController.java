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

import com.revature.faculty.model.Faculty;
import com.revature.faculty.service.FacultyService;

@RestController
@RequestMapping("/emp")
@CrossOrigin(origins="*")
public class FacultyController {
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/faculty")
	public List<Faculty> get(){
		return facultyService.get();
		
	}
	@GetMapping("/faculty/{id}")
	public Faculty get(@PathVariable int id) {
		
		Faculty facObj=facultyService.get(id);
		
		return facObj ;
	}
	@PostMapping("/faculty")
	public Faculty save(@RequestBody Faculty fac) {
		facultyService.save(fac);
		return fac;
	}
	@PutMapping("/faculty")
	public Faculty update(@RequestBody Faculty fac) {
		facultyService.save(fac);
		return fac;
	}
	@DeleteMapping("/faculty/{id}")
	public String delete(@PathVariable int id) {
		facultyService.delete(id);
		return "Faculty Deleted With id:"+ id;
		
	}
	
	
}
