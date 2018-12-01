package com.cg.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hotelbooking.dao.IHotelBookingDao;
import com.cg.hotelbooking.dto.HotelDetails;

@Service("hotelBookingService")
@Transactional
public class HotelBookingServiceImpl implements IHotelBookingService{
	

	@Autowired
	IHotelBookingDao hotelBookingDao;
	
	@Override
	public List<HotelDetails> showAllHotels() {
		
		return hotelBookingDao.showAllHotels();
	}

	@Override
	public HotelDetails searchHotel(int id) {
	
		return hotelBookingDao.searchHotel(id);
	}

	@Override
	public int bookingconfirmation(HotelDetails hotel) {
		// TODO Auto-generated method stub
		return 0;
	}

}
