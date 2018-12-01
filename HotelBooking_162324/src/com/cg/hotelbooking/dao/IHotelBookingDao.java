package com.cg.hotelbooking.dao;

import java.util.List;

import com.cg.hotelbooking.dto.HotelDetails;

public interface IHotelBookingDao {

	List<HotelDetails> showAllHotels();

	HotelDetails searchHotel(int id);

}
