package com.cognixia.jump.corejava.optionalproject;

import java.time.LocalDate;

/**
 * This class represents a salary based employee that works for a company under a department.
 * @author Lori White
 * @version v1 (06/11/2020)
 */
public class SalariedEmployee extends Employee{
	
	private double salary;
	
	/**
	 * The overloaded constructor that creates an instance of a salary based employee based on their name, ID, address, job title, payment and date hired.
     * @param employeeName the employee's name
     * @param address the employee's current address
     * @param job the job title
     * @param date the date the employee was hired
     * @param period the payment period
	 * @param salary the employee's minimum yearly earnings
	 */
	public SalariedEmployee(String employeeName, String address, String job, LocalDate date, PayPeriod payPeriod, double salary) {
		super(employeeName, address, job, 0 , date, EmployeeType.FULL_TIME, payPeriod);
		this.setSalary(salary);
	}
	/**
	 * The copy constructor.
	 * @param se the salary based employee to copy
	 */
	public SalariedEmployee(SalariedEmployee se) {
		super(se);
		this.salary = se.salary;
	}
	/**
	 * Retrieves the employee's yearly salary.
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * Updates the employee's yearly salary.
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
		super.setPay(salary / (double)(super.getPayPeriod().pp));
	}
	/**
     * Creates a string representation of a salary based employee.
     * @return String - the string representation of a salary based employee
     */
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]" + super.toString();
	}
}
