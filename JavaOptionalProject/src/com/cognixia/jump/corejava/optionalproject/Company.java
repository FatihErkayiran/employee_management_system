/**
 * This class represents a Company with department and their employees.
 * @author Jennifer Echavarria,Samidh Patel, Lori White
 * @version v4 (06/11/2020)
 */
package com.cognixia.jump.corejava.optionalproject;

import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.corejava.optionalproject.Department.DepartmentName;

public class Company{
	private String companyName;
	private DepartmentName departmentName;
	private List<Employee>employeeList;
	private Department[] departments;
	private Employee[] employees;
	
	public Company(String companyName, DepartmentName departmentName) {
		super();
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.employeeList=new ArrayList<Employee>();
		 
	}
	
	public Company(Company c) {
		this.companyName = c.companyName;
		this.departmentName = c.departmentName;
		this.employeeList=c.employeeList;
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	 public List<Employee> getListEmp(){
	    	return employeeList;
	    }
	
	@Override
	public String toString() {	
		//if there is a department present print the list of employees 
		//Samidh Input
		if(departmentName != null) {
			System.out.println(employeeList);
			
		}
		return "CompanyCopy [companyName=" + companyName + ", departmentName=" + departmentName + ", employeeList="
		+ employeeList + "]";
	}
	
	//Probably not needed...
	// displays every department in the department class
		public void displayCompanyInfo() {
			 System.out.println("Company: " + this.getCompanyName() + " Departments: ");
			 	// iterates through the department array to list department toString() method
			    for (int i = 0; i < this.departments.length; i++) {
			        Department temp = departments[i];
			        if (temp != null) {
			            System.out.println(temp);
			        }
			
			    }
		}
		
		//displays every employee in the employee class
		public void displayEmployees() {
			 System.out.println("Company: " + this.getCompanyName() + " Departments: ");
			 displayCompanyInfo();
			 System.out.println("Employees: ");
			 for (int i=0; i<this.employees.length; i++) {
				 Employee holder=employees[i];
				 if(holder!= null) {
					 System.out.println(holder);
				 }
			 }
		}

	
	
	
}
