package com.cg.practiceoneparttwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.practiceoneparttwo.dto.CourseDetail;

@Repository("coursedao")
public class CourseDaoImpl implements ICourseDao {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public List<CourseDetail> courseDetails() {
		Query query = entitymanager.createQuery("SELECT c FROM CourseDetail c");
		List<CourseDetail> myList = query.getResultList();
		return myList;
	}

}
