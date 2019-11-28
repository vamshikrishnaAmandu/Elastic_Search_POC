package com.krishna.exception;

public class CustomerNotFoundException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String id) {
		 super("Customer Not Found : " + id);
	}

}
