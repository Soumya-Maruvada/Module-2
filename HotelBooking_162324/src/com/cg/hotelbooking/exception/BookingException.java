package com.cg.hotelbooking.exception;

public class BookingException {
	private static final long serialVersionUID = 1L;
	private String message;
	
	
	public BookingException(String message){
		this.message = message;
	}


	public String getException() {
	return message;
	}
}
