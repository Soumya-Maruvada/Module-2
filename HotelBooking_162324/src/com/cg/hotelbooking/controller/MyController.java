package com.cg.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hotelbooking.dto.HotelDetails;
import com.cg.hotelbooking.service.IHotelBookingService;

@Controller
public class MyController {
	
	@Autowired
	IHotelBookingService hotelBookingService;
	
	/*@RequestMapping(value = "all", method = RequestMethod.GET)
	public String getAll() {
		return "home";

	}*/
	
	@RequestMapping(value = "hoteldetails", method = RequestMethod.GET)
	public ModelAndView showAllEmployee() {
		List<HotelDetails> hotelList = hotelBookingService.showAllHotels();
		return new ModelAndView("hotelsdetails", "temp", hotelList);
	}
	


	

}
