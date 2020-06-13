package com.cognixia.jump.corejava.optionalproject;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

/**
 * This an exception for when an object can not be found.
 * @author Lori White
 * @version v3 (06/12/2020)
 */
public class NotFoundException extends Exception {
	
	private static final long serialVersionUID = 3L;
	/**
	 * The overloaded constructor for employees.
	 * @param choice the type of message
	 * @param id the employee's id
	 * @param dn the department's name
	 */
	public NotFoundException(int choice, int id, DepartmentName dn) {
		super(message(choice, id, dn, ""));
	}
	/**
	 * The overloaded constructor for departments.
	 * @param choice the type of message
	 * @param dn the department's name
	 * @param name the company's name
	 */
	public NotFoundException(int choice, DepartmentName dn, String name) {
		super(message(choice, 0, dn, name));
	}
	/**
	 * Returns an error message.
	 * @param choice the type of message
	 * @param id the employee's id
	 * @param n the department's name
	 * @param name the company's name
	 * @return String - the error message
	 */
	private static String message(int choice, int id, DepartmentName n, String name) {
		switch(choice) {
			case 1:
				return "Employee: "+ id + " can not be found in " + n + ", because the department doesn't have employees.";
			case 2:
				return "Employee: "+ id + " was not found in " + n + ".";
			case 3:
				return "Department: "+ n + " can not be found in " + name + ", because the company doesn't have employees.";
			case 4:
				return "Department: "+ n + " was not found in " + name + ".";
			default:
				return "";
		}
	}
}
