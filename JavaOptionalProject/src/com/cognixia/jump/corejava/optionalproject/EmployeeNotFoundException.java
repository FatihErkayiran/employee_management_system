package com.cognixia.jump.corejava.optionalproject;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

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
	public EmployeeNotFoundException(int choice, int id, DepartmentName dn) {
		super(message(choice, id, dn));
	}
	/**
	 * Returns a error message.
	 * @param choice the type of message
	 * @param id the employee's id
	 * @param n the department's name
	 * @return String - the error message
	 */
	private static String message(int choice, int id, DepartmentName n) {
		switch(choice) {
			case 1:
				return "Employee: "+ id + " can not be found in " + n + ", because the department doesn't have employees.";
			case 2:
				return "Employee: "+ id + " was not found in " + n + ".";
			default:
				return "";
		}
	}
}
