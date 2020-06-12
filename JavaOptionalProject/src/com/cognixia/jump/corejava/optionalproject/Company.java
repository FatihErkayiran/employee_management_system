package com.cognixia.jump.corejava.optionalproject;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Company with departments and their employees.
 * @author Jennifer Echavarria, Samidh Patel, Lori White
 * @version v5 (06/12/2020)
 */
public class Company {
	
	private String companyName;
	private Employee owner;
	private String headquarters;
	private List<Department> departments;
	
	/**
	 * The overloaded constructor that creates an instance of a company.
	 * @param name the name of the company
	 * @param ceo the current head of the company
	 * @param location the location of the headquarters
	 */
	public Company(String name, Employee ceo, String location) {
		super();
		this.companyName = name;
		this.owner = ceo;
		this.headquarters = location;
		this.departments = new ArrayList<Department>();
	}
	/**
	 * The copy constructor.
	 * @param c the company to copy
	 */
	public Company(Company c) {
		this.companyName = c.companyName;
		this.owner = c.owner;
		this.headquarters = c.headquarters;
		this.departments = c.departments;
	}
	/**
	 * Retrieves the company's name.  
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * Updates the company's name.
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * Retrieves the location of the company headquarters.
	 * @return String - the headquarters
	 */
	public String getHeadquarters() {
		return headquarters;
	}
	/**
	 * Updates the location of the company headquarters.
	 * @param headquarters the headquarters to set
	 */
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	/**
	 * Retrieves the owner of the company.
	 * @return Employee - the owner
	 */
	public Employee getOwner() {
		return owner;
	}
	/**
	 * Updates the owner of the company.
	 * @param owner the owner to set
	 */
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	/**
	 * Retrieves the list of departments.
	 * @return List<Department> - the departments
	 */
	public List<Department> getDepartments() {
		return departments;
	}
//    /**
//     * Adds a new Department to the list of Departments.
//     * @param department the new Department
//     * @throws EmployeeAddException can not add a department that doesn't exist, or a department that already exists in the company
//     */
//    public void addEmp(Department department) throws EmployeeAddException{
//    	boolean found = false;
//    	if(employee == null) {
//    		throw new EmployeeAddException("This employee could not be added to department " + departmentName +".");
//    	}
//    	try {
//    		findEmp(employee.getEmployeeId());
//    		found = true;
//    	} catch (EmployeeNotFoundException e) {
//    		employeeList.add(employee);
//    	} 
//    	if(found) {
//    		throw new EmployeeAddException("This employee could not be added to department " + departmentName +" since this employee already exists.");
//    	}
//    }
//    /**
//     * Removes an employee from the list of employees based off the employeeID.
//     * @param employeeId the employee to remove
//     * @return Employee - the employee that was removed
//     * @throws EmployeeRemoveException can not remove an employee from a list that doesn't exist or a list that is empty
//     */
//    public Employee removeEmp(int employeeId) throws EmployeeRemoveException{
//    	if(employeeList == null || employeeList.size() == 0 || employeeList.isEmpty()) {
//    		throw new EmployeeRemoveException("Employee: "+ employeeId + " can not be found in " + departmentName + ", because the department doesn't have employees. Thus the employee can not be removed.");
//    	}
//    	
//    	Employee employee = null;
//    	
//    	try {
//    		employee = findEmp(employeeId);
//    		employeeList.remove(employee);
//    	} catch (EmployeeNotFoundException e) {
//    		System.err.print(e);
//    	} 
//    	
//        return employee;
//    }
//    /**
//     * Finds a an employee based on their id and retrieves them.
//     * @param employeeId the employee to search for
//     * @return Employee - the employee that was found
//     * @throws EmployeeNotFoundException can not search a list that doesn't exist or a list that is empty
//     */
//    public Employee findEmp(int employeeId) throws EmployeeNotFoundException{
//    	if(employeeList == null || employeeList.size() == 0 || employeeList.isEmpty()) {
//    		throw new EmployeeNotFoundException("Employee: "+ employeeId + " can not be found in " + departmentName + ", because the department doesn't have employees.");
//    	}
//    	
//    	Employee employee = null;
//    	
//    	 for(int i = 0; i < employeeList.size(); i++) {
//        	employee = employeeList.get(i);
//            if(employee.getEmployeeId() == employeeId) {
//                break;
//            }
//            else {
//            	employee = null;
//            }
//        }
//    	
//    	if(employee == null) {
//    		throw new EmployeeNotFoundException("Employee: "+ employeeId + " was not found in " + departmentName + ",");
//    	}
//    	 
//        return employee;
//    }
//    /**
//     * Updates an employee in the list of current employees.
//     * @param employeeId the employee to update
//     * @param e the new employee to update to
//     * @throws EmployeeNotFoundException can not update a list that doesn't exist, a list that is empty, or a list that doesn't contain the employee
//     */
//    public void editEmp(int employeeId, Employee e) throws EmployeeNotFoundException{
//    	
//        employeeList.set(employeeList.indexOf(findEmp(employeeId)), e);
//        
//    }
    /**
     * Creates a string representation of a company.
     * @return String - the string representation of a company
     */
	@Override
	public String toString() {	
		
		String out = "Company [companyName= " + companyName + ", headquarters= " + headquarters + ", owner= " + owner.toString();
		//if there is a department present print the list of employees 
		if(departments.size() != 0) {
    		out += ",\n departmentList= \n";

            for(int index = 0; index < departments.size() - 1; index++) {
            	out += departments.get(index).toString() + ",\n";
            }
            out += departments.get(departments.size() - 1).toString();
    	}
    	else {
        	out += " ]";
    	}
		return out;
	}
	
//	//Probably not needed...
//	// displays every department in the department class
//		public void displayCompanyInfo() {
//			 System.out.println("Company: " + this.getCompanyName() + " Departments: ");
//			 	// iterates through the department array to list department toString() method
//			    for (int i = 0; i < this.departments.length; i++) {
//			        Department temp = departments[i];
//			        if (temp != null) {
//			            System.out.println(temp);
//			        }
//			
//			    }
//		}
//		
//		//displays every employee in the employee class
//		public void displayEmployees() {
//			 System.out.println("Company: " + this.getCompanyName() + " Departments: ");
//			 displayCompanyInfo();
//			 System.out.println("Employees: ");
//			 for (int i=0; i<this.employees.length; i++) {
//				 Employee holder=employees[i];
//				 if(holder!= null) {
//					 System.out.println(holder);
//				 }
//			 }
//		}
}
