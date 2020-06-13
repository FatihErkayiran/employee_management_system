package com.cognixia.jump.corejava.optionalproject;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

/**
 * This an exception for when an object can not be removed from another object.
 * @author Lori White
 * @version v3 (06/12/2020)
 */
public class RemoveException extends Exception {

	private static final long serialVersionUID = 2L;
	/**
	 * The overloaded constructor for employees.
	 * @param choice the type of message
	 * @param id the employee's id
	 * @param dn the department's name
	 */
	public RemoveException(int choice, int id, DepartmentName dn) {
		super(message(choice, id, dn, ""));
	}
	/**
	 * The overloaded constructor for departments.
	 * @param choice the type of message
	 * @param dn the department's name
	 * @param n the company's name
	 */
	public RemoveException(int choice, DepartmentName dn, String n) {
		super(message(choice, 0, dn, n));
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
				return "Employee: " + id + " can not be found in " + n + ", because the department doesn't have employees. Thus the employee can not be removed.";
			case 2:
				return "Department: "+ n + " can not be found in " + name + ", because the company doesn't have departments. Thus the department can not be removed.";
			default:
				return "";
		}
	}
}
