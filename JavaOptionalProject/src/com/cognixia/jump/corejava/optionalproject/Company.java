package com.cognixia.jump.corejava.optionalproject;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

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
    /**
     * Adds a new Department to the list of Departments.
     * @param department the new Department
     * @throws AddException can not add a department that doesn't exist, or a department that already exists in the company
     */
    public void addDep(Department department) throws AddException{
    	boolean found = false;
    	if(department == null) {
    		throw new AddException(3, companyName);
    	}
    	try {
    		findDep(department.getDepartmentName());
    		found = true;
    	} catch (NotFoundException e) {
    		departments.add(department);
    	} 
    	if(found) {
    		throw new AddException(4, companyName);
    	}
    }
    /**
     * Removes a department from the list of departments based off the name.
     * @param name the department to remove
     * @return Department - the department that was removed
     * @throws RemoveException can not remove a department from a list that doesn't exist or a list that is empty
     */
    public Department removeDep(DepartmentName name) throws RemoveException{
    	if(departments == null || departments.size() == 0 || departments.isEmpty()) {
    		throw new RemoveException(2, name, companyName);
    	}
    	
    	Department d = null;
    	
    	try {
    		d = findDep(name);
    		departments.remove(d);
    	} catch (NotFoundException e) {
    		System.err.print(e);
    	} 
    	
        return d;
    }
    /**
     * Finds a department based on their name and retrieves them.
     * @param name the department to search for
     * @return Department - the department that was found
     * @throws NotFoundException can not search a list of departments that doesn't exist or a list that is empty
     */
    public Department findDep(DepartmentName name) throws NotFoundException{
    	if(departments == null || departments.size() == 0 || departments.isEmpty()) {
    		throw new NotFoundException(3, name, companyName);
    	}
    	
    	Department d = null;
    	
    	 for(int i = 0; i < departments.size(); i++) {
        	d = departments.get(i);
            if(d.getDepartmentName() == name) {
                break;
            }
            else {
            	d = null;
            }
        }
    	
    	if(d == null) {
    		throw new NotFoundException(4, name, companyName);
    	}
    	 
        return d;
    }
    /**
     * Updates a department in the list of current departments.
     * @param name the department to update
     * @param d the new department to update to
     * @throws NotFoundException can not update a list of departments that doesn't exist, a list that is empty, or a list that doesn't contain the employee
     */
    public void editEmp(DepartmentName name, Department d) throws NotFoundException{
    	
    	departments.set(departments.indexOf(findDep(name)), d);
        
    }
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
