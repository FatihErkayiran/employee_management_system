package com.cognixia.jump.corejava.optionalproject;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

/**
 * This an exception for when an object can not be added to another object.
 * @author Lori White
 * @version v3 (06/12/2020)
 */
public class AddException extends Exception{

	private static final long serialVersionUID = 1L;
	/**
	 * The overloaded constructor for employees.
	 * @param choice the type of message
	 * @param dn the department's name
	 */
	public AddException(int choice, DepartmentName dn) {
		super(message(choice, dn, ""));
	}
	/**
	 * The overloaded constructor for departments.
	 * @param choice the type of message
	 * @param n the company's name
	 */
	public AddException(int choice, String n) {
		super(message(choice, null, n));
	}
	/**
	 * Returns an error message.
	 * @param choice the type of message
	 * @param n the department's name
	 * @param name the company's name
	 * @return String - the error message
	 */
	private static String message(int choice, DepartmentName n, String name) {
		switch(choice) {
			case 1:
				return "This employee could not be added to department " + n +".";
			case 2:
				return "This employee could not be added to department " + n +" since this employee already exists.";
			case 3:
				return "This department could not be added to company " + name +".";
			case 4:
				return "This department could not be added to company " + name +" since this department already exists.";
			default:
				return "";
		}
	}
}
