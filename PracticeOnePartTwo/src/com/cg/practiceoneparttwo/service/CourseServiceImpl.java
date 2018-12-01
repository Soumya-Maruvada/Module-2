package com.cg.practiceoneparttwo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.practiceoneparttwo.dao.ICourseDao;
import com.cg.practiceoneparttwo.dto.CourseDetail;

@Service("courseservice")
@Transactional
public class CourseServiceImpl implements ICourseService{
	
	@Autowired
	ICourseDao coursedao;
	@Override
	public List<CourseDetail> courseDetails() {
		// TODO Auto-generated method stub
		return coursedao.courseDetails();
	}

}
