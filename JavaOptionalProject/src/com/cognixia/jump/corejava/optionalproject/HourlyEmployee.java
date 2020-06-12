package com.cognixia.jump.corejava.optionalproject;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * This class represents a hourly based employee that works for a company under a department.
 * @author Lori White
 * @version v1 (06/11/2020)
 */
public class HourlyEmployee extends Employee{

	private final static int MAX_HOURS_WORKED = 40;
	private final static int MAX_PART_TIME_HOURS = 20;
	private final static double OVERTIME_FACTOR = 1.5;
	
	private int[] hoursWorked;
	private double payRate;
	private boolean overtimeAllowed;
	
	/**
	 * The overloaded constructor that creates an instance of a hourly based employee based on their name, ID, address, job title, payment and date hired.
	 * @param employeeName the employee's name
	 * @param address the employee's current address
	 * @param job the job title
	 * @param date the date the employee was hired
	 * @param type the type of employee, full time versus part time
	 * @param payPeriod the payment period
	 * @param hours the hours the employee has worked each week
	 * @param rate the amount the employee gets paid per hour
	 * @param allowed whether or not the employee is able to work overtime
	 * @throws InvalidHourlyPayException can not allow for an employee to have a payment with invalid logged hours
	 */
	public HourlyEmployee(String employeeName, String address, String job, LocalDate date, EmployeeType type, PayPeriod payPeriod, int[] hours, double rate, boolean allowed) throws InvalidHourlyPayException {
		super(employeeName, address, job, 0, date, type, payPeriod);
		this.hoursWorked = Arrays.copyOf(hours, hours.length);
		this.payRate = rate;
		this.overtimeAllowed = allowed;
		calcPay();
	}
	/**
	 * The copy constructor.
	 * @param he the hourly based employee to copy
	 */
	public HourlyEmployee(HourlyEmployee he) {
		super(he);
		this.hoursWorked = Arrays.copyOf(he.hoursWorked, he.hoursWorked.length);
		this.payRate = he.payRate;
		this.overtimeAllowed = he.overtimeAllowed;
	}
	/**
	 * Calculates the employee's pay day amount.
	 * @throws InvalidHourlyPayException can not calculate the pay if the employee has overtime logged and they are not allowed to work overtime
	 */
	private void calcPay() throws InvalidHourlyPayException
	{
		double pay = 0;
		
		for(int i = 0; i < hoursWorked.length; i++) {
			if(!overtimeAllowed && ((super.getType() == EmployeeType.PART_TIME && hoursWorked[i] > MAX_PART_TIME_HOURS) || (super.getType() == EmployeeType.FULL_TIME && hoursWorked[i] > MAX_HOURS_WORKED))) {
				throw new InvalidHourlyPayException(hoursWorked[i]);
			}
			
			if(hoursWorked[i] > MAX_HOURS_WORKED) {
				pay += (payRate * (double)(MAX_HOURS_WORKED)) + (payRate * (double)(hoursWorked[i] - MAX_HOURS_WORKED) * OVERTIME_FACTOR);
			}
			else {
				pay += payRate * (double)(hoursWorked[i]);
			}
		}
		
		super.setPay(pay);
	}
	/**
	 * Retrieves the hours the employee has worked each week.
	 * @return the hoursWorked
	 */
	public int[] getHoursWorked() {
		return hoursWorked;
	}
	/**
	 * Updates the hours the employee has worked each week.
	 * @param hours the hours to set
	 * @throws InvalidHourlyPayException can not allow for an employee to have a payment with invalid logged hours
	 */
	public void setHoursWorked(int[] hours) throws InvalidHourlyPayException {
		this.hoursWorked =  Arrays.copyOf(hours, hours.length);
		calcPay();
	}
	/**
	 * Retrieves the amount the employee gets paid per hour.
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}
	/**
	 * Updates the amount the employee gets paid per hour.
	 * @param payRate the payRate to set
	 * @throws InvalidHourlyPayException can not allow for an employee to have a payment with invalid logged hours
	 */
	public void setPayRate(double payRate) throws InvalidHourlyPayException {
		this.payRate = payRate;
		calcPay();
	}
	/**
	 * Retrieves whether or not the employee is able to work overtime.
	 * @return the overtimeAllowed
	 */
	public boolean isOvertimeAllowed() {
		return overtimeAllowed;
	}
	/**
	 * Updates whether or not the employee is able to work overtime.
	 * @param overtimeAllowed the overtimeAllowed to set
	 * @throws InvalidHourlyPayException can not allow for an employee to have a payment with invalid logged hours
	 */
	public void setOvertimeAllowed(boolean overtimeAllowed) throws InvalidHourlyPayException {
		this.overtimeAllowed = overtimeAllowed;
		calcPay();
	}
	/**
     * Creates a string representation of a hourly based employee.
     * @return String - the string representation of a hourly based employee
     */
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + Arrays.toString(hoursWorked) + ", payRate=" + payRate
				+ ", overtimeAllowed=" + overtimeAllowed + "]" + super.toString();
	}
}
