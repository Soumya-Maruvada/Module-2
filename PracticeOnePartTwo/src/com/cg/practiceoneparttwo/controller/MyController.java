package com.cg.practiceoneparttwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.practiceoneparttwo.dto.CourseDetail;
import com.cg.practiceoneparttwo.service.ICourseService;


@Controller
public class MyController {
	@Autowired
	ICourseService courseservice;
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public String getAll() {
		return "home";

	}
	
	@RequestMapping(value = "coursedetails", method = RequestMethod.GET)
	public ModelAndView courseDetails() {
		List<CourseDetail> courses = courseservice.courseDetails();
		return new ModelAndView("coursedetails", "course", courses);
	}
	
	@RequestMapping(value = "enroll", method = RequestMethod.GET)
	public ModelAndView courseEnroll(@RequestParam("name") int id) {
		
		return new ModelAndView("enrollCourse", "temp", id);
	}
}
