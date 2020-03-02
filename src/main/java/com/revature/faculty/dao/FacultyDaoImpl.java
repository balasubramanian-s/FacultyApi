package com.revature.faculty.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.faculty.model.Faculty;
@Repository
public class FacultyDaoImpl implements FacultyDao {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Faculty> get() {
		
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Faculty> query=  currentSession.createQuery("from Faculty",Faculty.class);
		List<Faculty> list=query.getResultList();		
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Faculty> getByInstitution(int id){
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Faculty> query=currentSession.createQuery("from Faculty Where institution_id=" + id);
		List<Faculty> list=query.getResultList();
		return list;
	}

	@Override
	public Faculty get(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Faculty facultyobj=currentSession.get(Faculty.class, id); 		
		return facultyobj;
	}

	@Override
	public void save(Faculty fac) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(fac);

	}

	@Override
	public void delete(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Faculty facultyobj=currentSession.get(Faculty.class, id);
		currentSession.delete(facultyobj);

	}

}
