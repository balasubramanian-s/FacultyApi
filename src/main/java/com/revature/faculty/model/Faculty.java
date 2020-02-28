package com.revature.faculty.model;

import java.sql.Date;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`faculty`")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "`employee_id`")
	private Integer employee_id;
	@Column(name = "`institution_id`")
	private Integer institution_id;
	@Column(name = "`first_name`")
	private String first_name;
	@Column(name = "`last_name`")
	private String last_name;
	@Column(name = "`dob`")
	private Date dob;
	@Column(name = "`email_id`")
	private String email;
	@Column(name = "`mobile_number`")
	private Integer mobile_no;
	@Column(name = "`role_id`")
	private Integer role_id;
	@Column(name = "`created_on`")
	private Instant createdon;
	@Column(name = "`modified_on`")
	private Instant modifiedon;
	@Column(name = "`created_by`")
	private String createdby;
	@Column(name = "`modified_by`")
	private String modifiedby;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(Integer institution_id) {
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

	public Integer getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(Integer mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Instant getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Instant createdon) {
		this.createdon = createdon;
	}

	public Instant getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Instant modifiedon) {
		this.modifiedon = modifiedon;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	@Override
	public String toString() {
		return "faculty [id=" + id + ", employee_id=" + employee_id + ", institution_id=" + institution_id
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob + ", email=" + email
				+ ", mobile_no=" + mobile_no + ", role_id=" + role_id + ", createdon=" + createdon + ", modifiedon="
				+ modifiedon + ", createdby=" + createdby + ", modifiedby=" + modifiedby + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((institution_id == null) ? 0 : institution_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (institution_id == null) {
			if (other.institution_id != null)
				return false;
		} else if (!institution_id.equals(other.institution_id))
			return false;
		return true;
	}
	
	

}
