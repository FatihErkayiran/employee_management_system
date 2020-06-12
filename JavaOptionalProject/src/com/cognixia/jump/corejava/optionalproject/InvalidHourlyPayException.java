package com.cognixia.jump.corejava.optionalproject;

/**
 * This an exception for when a hourly employee's pay can be not updated.
 * @author Lori White
 * @version v1 (06/11/2020)
 */
public class InvalidHourlyPayException extends Exception {
	
	private static final long serialVersionUID = 4L;
	/**
	 * The overloaded constructor.
	 * @param message the error message
	 */
	public InvalidHourlyPayException(int message) {
		super("This employee cannot log "+ message + " many hours.");
	}
}
