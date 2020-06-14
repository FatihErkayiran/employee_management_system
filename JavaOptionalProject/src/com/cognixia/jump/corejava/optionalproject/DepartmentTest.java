package com.cognixia.jump.corejava.optionalproject;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    LocalDate date = LocalDate.now();
    Employee employee0 = new Employee("name0", "tx", "manager", 100.000, date, Employee.EmployeeType.FULL_TIME, Employee.PayPeriod.MONTHLY);

    @org.junit.jupiter.api.Test
    void getListEmp() throws AddException {
        // Department department=new Department();
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);

        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME, Employee.PayPeriod.MONTHLY);
        Employee employee2 = new Employee("name2", "ca", "tester", 60.000, date, Employee.EmployeeType.FULL_TIME, Employee.PayPeriod.MONTHLY);
        Employee employee3 = new Employee("name3", "nm", "developer", 70.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.getListEmp();
    }

    @org.junit.jupiter.api.Test
    void getListEmp2() throws AddException {
        // Department department=new Department();
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);

        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME, Employee.PayPeriod.MONTHLY);
        Employee employee2 = new Employee("name2", "ca", "tester", 60.000, date, Employee.EmployeeType.FULL_TIME, Employee.PayPeriod.MONTHLY);
        Employee employee3 = new Employee("name3", "nm", "developer", 70.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.addEmp(employee2);
        department.addEmp(employee3);
        department.getListEmp();
    }

    //ADDING NULL TO ADD EMP METHOD
    @org.junit.jupiter.api.Test
    void addEmp() throws AddException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee = null;
        department.addEmp(employee);
    }

    //ADDING REGULAR EMP TO DEPARTMENT
    @org.junit.jupiter.api.Test
    void addEmp2() throws AddException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
    }

    //ADDING DUPLICATE EMP TO DEPARTMENT
    @org.junit.jupiter.api.Test
    void addEmp3() throws AddException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.addEmp(employee1);
    }




    //REMOVING AN EMP CALLING THEIR ID
    @org.junit.jupiter.api.Test
    void removeEmp() throws AddException, RemoveException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.removeEmp(1);
    }

    //REMOVING AN EMP CALLING FAKE ID
    @org.junit.jupiter.api.Test
    void removeEmp2() throws AddException, RemoveException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.removeEmp(16);
    }
     //FINDING AN EMP CALLING THEIR ID
    @org.junit.jupiter.api.Test
    void findEmp() throws AddException, NotFoundException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.findEmp(1);
    }
    //FINDING AN EMP CALLING FAKE ID
    @org.junit.jupiter.api.Test
    void findEmp2() throws AddException, NotFoundException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.findEmp(13);
    }


    @org.junit.jupiter.api.Test
    void editEmp() throws AddException, NotFoundException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        LocalDate date = LocalDate.now();
        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        Employee employee2 = new Employee("name2", "ca", "tester", 60.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.editEmp(1, employee1);
    }
    //EDITING AN EMP WITH NULL OBJECT
    @org.junit.jupiter.api.Test
    void editEmp2() throws AddException, NotFoundException {
        Department department = new Department(Department.DepartmentName.HR, "NEW YORK",employee0);
        LocalDate date = LocalDate.now();
        Employee employee = null;
        Employee employee1 = new Employee("name1", "tx", "developer", 50.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        Employee employee2 = new Employee("name2", "ca", "tester", 60.000, date, Employee.EmployeeType.FULL_TIME,Employee.PayPeriod.MONTHLY);
        department.addEmp(employee1);
        department.editEmp(1, employee);

    }

}