package com.cognixia.jump.corejava.optionalproject;

public class Company {
	
	private String companyName;
	//private DepartmentName departmentName;
	
	private Department[] departments;
	private Employee[] employees;
	
	
	public Company(String companyName, int numberOfDepartments) {
		super();
		this.companyName = companyName;
		//this.departmentName= departmentName;
		this.departments= new Department[numberOfDepartments];
	}
	
	
	// grab company name
	public String getCompanyName() {
        return companyName;
    }
	
	
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
  
	// This will print out the employee class toString() method
	// Still confused on how to display the employees to their specific department because it 
	// currently displays them separately. 
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
