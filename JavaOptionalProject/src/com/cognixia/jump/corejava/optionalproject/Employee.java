package com.cognixia.jump.corejava.optionalproject;

import java.time.LocalDate;

/**
 * This class represents an employee that works for a company under a department.
 * @author Fatih Erkayiran, Jennifer Echavarria, Lori White
 * @version v3 (06/3/2020)
 */
public class Employee {
	public enum EmployeeType {
		FULL_TIME, PART_TIME;
	}
    private String employeeName;
    private int employeeId;
    private String address;
    private String jobTitle;
    private double pay;
    private LocalDate dateHired;
    private EmployeeType type;
    private static int idCounter=1;

    /**
     * The overloaded constructor that creates an instance of an employee based on their name, ID, address, job title, payment and date hired.
     * @param employeeName the employee's name
     * @param address the employee's current address
     */
    public Employee(String employeeName, String address, String job, double pay, LocalDate date, EmployeeType type) {
        this.employeeName = employeeName;
        this.employeeId = idCounter++;
        this.address = address;
        this.jobTitle = job;
        this.pay = pay;
        this.dateHired = date;
        this.type = type;
    }
    /**
     * The copy constructor.
     * @param e the employee to copy
     */
    public Employee(Employee e) {
    	this.employeeName = e.employeeName;
    	this.employeeId = e.employeeId;
    	this.address = e.address; 
    	this.jobTitle = e.jobTitle;
    	this.pay = e.pay;
    	this.dateHired = e.dateHired;
    	this.type = e.type;
    }
    /**
     * Retrieves the employee's name.
     * @return String - the employee's name
     */
    public String getEmployeeName() {
        return employeeName;
    }
    /**
     * Updates the employee's name.
     * @param employeeName the new employee's name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    /**
     * Retrieves the employee's address.
     * @return String - the employee's address
     */
    public String getAddress() {
        return address;
    }
    /**
     * Updates the employee's address.
     * @param address the new employee's address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Retrieves the employee's job title.
	 * @return String - the employee's job title
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * Updates the employee's job title.
	 * @param jobTitle the new job title
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * Retrieves the employee's type of employee.
	 * @return EmployeeType - the employee type
	 */
	public EmployeeType getType() {
		return type;
	}
	/**
	 * Updates the employee's type of employee.
	 * @param type the new type of employee
	 */
	public void setType(EmployeeType type) {
		this.type = type;
	}
	/**
	 * Retrieves the employee's salary/hourly pay.
	 * @return double - the employee's salary/hourly pay
	 */
	public double getPay() {
		return pay;
	}
	/**
	 * Updates the employee's salary/hourly pay.
	 * @param pay the new salary/hourly pay
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}
	/**
	 * Retrieves the employee's date they were hired.
	 * @return LocalDate - the employee's date they were hired
	 */
	public LocalDate getDateHired() {
		return dateHired;
	}
	/**
	 * Updates the employee's date they were hired.
	 * @param dateHired the new date they were hired
	 */
	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}
	/**
     * Retrieves the employee's ID.
     * @return int - the employee's ID
     */
    public int getEmployeeId() {
        return employeeId;
    }
    /**
     * Creates a string representation of an employee.
     * @return String - the string representation of an employee
     */
	@Override
	public String toString() {
		return "Employee [employeeName= " + employeeName + ", employeeId= " + employeeId + ", address= " + address
				+ ", jobTitle= " + jobTitle + ", pay= " + pay + ", dateHired= " + dateHired + ", type= " + type + "]";
	}

}
