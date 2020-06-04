package com.cognixia.jump.corejava.optionalproject;

/**
 * This an exception for when an employee can not be found.
 * @author Lori White
 * @version v1 (06/04/2020)
 */
public class EmployeeNotFoundException extends Exception {
	
	private static final long serialVersionUID = 3L;
	/**
	 * The overloaded constructor.
	 * @param message the error message
	 */
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
