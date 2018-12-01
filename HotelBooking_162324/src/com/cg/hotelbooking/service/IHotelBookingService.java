package com.cg.hotelbooking.service;

import java.util.List;

import com.cg.hotelbooking.dto.HotelDetails;

public interface IHotelBookingService {

	List<HotelDetails> showAllHotels();

	HotelDetails searchHotel(int id);

	int bookingconfirmation(HotelDetails hotel);

}
