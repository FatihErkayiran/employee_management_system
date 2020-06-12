package com.cognixia.jump.corejava.optionalproject;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

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
	public EmployeeRemoveException(int id, DepartmentName dn) {
		super("Employee: " + id + " can not be found in " + dn + ", because the department doesn't have employees. Thus the employee can not be removed.");
	}
}
