package com.cognixia.jump.corejava.optionalproject;

/**
 * This an exception for when an employee can not removed from the department.
 * @author Lori White
 * @version v1 (06/04/2020)
 */
public class EmployeeRemoveException extends Exception {

	private static final long serialVersionUID = 2L;
	/**
	 * The overloaded constructor.
	 * @param message the error message
	 */
	public EmployeeRemoveException(String message) {
		super(message);
	}

}
