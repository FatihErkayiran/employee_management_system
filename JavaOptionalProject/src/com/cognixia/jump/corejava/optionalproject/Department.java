package com.cognixia.jump.corejava.optionalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class represents a Department in a company that has a name and a list of employees.
 * @author Fatih Erkayiran, Jennifer Echavarria, Lori White
 * @version v3 (06/3/2020)
 */
public class Department {

    public enum DepartmentName {
        CUSTOMER_SERVICE, HR, BILLING_DEP, ACCOUNTING
    }
    private DepartmentName departmentName;
    private String location;
    private List<Employee>employeeList;

    /**
     * The overloaded constructor that creates an instance of a department based on it's name and location.
     * @param departmentName the name of the department
     * @param location the location of the department
     */
    public Department(DepartmentName departmentName, String location) {
    	super();
        this.departmentName = departmentName;
        this.location = location;
        this.employeeList = new ArrayList<Employee>();
    }
    /**
     * The copy constructor.
     * @param d the department to copy
     */
    public Department(Department d) {
    	this.departmentName = d.departmentName;
    	this.location = d.location;
    	this.employeeList = d.employeeList;
    }
    /**
     * Retrieves the department's name.
     * @return String - the department's name
     */
    public DepartmentName getDepartmentName() {
        return departmentName;
    }
    /**
     * Updates the department's name.
     * @param departmentName the new department's name
     */
    public void setDepartmentName(DepartmentName departmentName) {
        this.departmentName = departmentName;
    }
    /**
     * Retrieves the department's location.
	 * @return String - the department's location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * Updates the department's location.
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
     * Retrieves the number of current employees in the department.
     * @return int - the number of employees
     */
    public int getEmployeeNum() {
        return employeeList.size();
    }
    /**
     * Retrieves the list of current employees.
     * @return List<Employee> - the list of employees
     */
    public List<Employee> getListEmp(){
    	return employeeList;
    }
    /**
     * Adds a new Employee to the list of employees.
     * @param employee the new Employee
     * @throws Exception can not add an employee that doesn't exist
     */
    public void addEmp(Employee employee) throws Exception{
    	if(employee == null) {
    		throw new Exception();
    	}
        employeeList.add(employee);
    }
    /**
     * Removes an employee from the list of employees based off the employeeID.
     * @param employeeId the employee to remove
     * @return Employee - the employee that was removed
     * @throws Exception can not remove an employee from a list that doesn't exist or a list that is empty
     */
    public Employee removeEmp(int employeeId) throws Exception{
    	if(employeeList == null || employeeList.size() == 0 || employeeList.isEmpty()) {
    		throw new Exception();
    	}
    	
    	Employee employee = null;
    	
        for(int i = 0; i < employeeList.size(); i++) {
        	employee = employeeList.get(i);
            if(employee.getEmployeeId() == employeeId) {
                employeeList.remove(employee);
                break;
            }
        }
        return employee;
    }
    /**
     * Finds a an employee based on their id and retrieves them.
     * @param employeeId the employee to search for
     * @return Employee - the employee that was found
     * @throws Exception can not search a list that doesn't exist or a list that is empty
     */
    public Employee findEmp(int employeeId) throws Exception{
    	if(employeeList == null || employeeList.size() == 0 || employeeList.isEmpty()) {
    		throw new Exception();
    	}
    	
    	Employee employee = null;
    	
    	 for(int i = 0; i < employeeList.size(); i++) {
        	employee = employeeList.get(i);
            if(employee.getEmployeeId() == employeeId) {
                break;
            }
        }
        return employee;
    }
    /**
     * Updates an employee in the list of current employees.
     * @param employeeId the employee to update
     * @param e the new employee to update to
     * @throws Exception can not update a list that doesn't exist, a list that is empty, or a list that doesn't contain the employee
     */
    public void editEmp(int employeeId, Employee e) throws Exception{
        Employee employee = findEmp(employeeId);
        if(employee == null) {
        	throw new Exception();
        }
        employee = new Employee(e);
    }
    /**
     * Creates a string representation of a department.
     * @return String - the string representation of a department
     */
    @Override
    public String toString() {
    	String out = "Department [departmentName= " + departmentName + ", location= " + location + ", employeeNum= " + getEmployeeNum();
    	
    	if(employeeList.size() != 0) {
    		out += ", employeeList= \n";

            for(int index = 0; index < employeeList.size() - 1; index++) {
            	out += employeeList.get(index).toString() + ",\n";
            }
            out += employeeList.get(employeeList.size() - 1).toString() + " ]";
    	}
    	else {
        	out += "]";
    	}
        return out;
    }
}
