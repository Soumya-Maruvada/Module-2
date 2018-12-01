package com.cg.hotelbooking.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hotelbooking.dto.HotelDetails;

@Repository("hotelBookingDao")
public class HotelBookingDaoImpl implements IHotelBookingDao {

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public List<HotelDetails> showAllHotels() {
		Query query = entitymanager.createQuery("FROM HotelDetails");
		List<HotelDetails> hotelList = query.getResultList();
		return hotelList;
	}

	@Override
	public HotelDetails searchHotel(int id) {
		HotelDetails hotel = entitymanager.find(HotelDetails.class, id);
		return hotel;
	}

}
