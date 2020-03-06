package com.revature.faculty.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpdatefacultyDto {
	
	private int id;
	
	private int employee_id;

	private int institution_id;

	private String first_name;

	private String last_name;

	private Date dob;

	private String email;

	private int mobile_no;

	private int role_id;
	@JsonIgnore
	private LocalDateTime modifiedon=LocalDateTime.now();

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(int institution_id) {
		this.institution_id = institution_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public LocalDateTime getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(LocalDateTime modifiedon) {
		this.modifiedon = modifiedon;
	}

	@Override
	public String toString() {
		return "UpdatefacultyDto [employee_id=" + employee_id + ", institution_id=" + institution_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", dob=" + dob + ", email=" + email + ", mobile_no="
				+ mobile_no + ", role_id=" + role_id + ", modifiedon=" + modifiedon + "]";
	}
	
	
}
