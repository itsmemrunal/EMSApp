package com.ems.view;

import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

public class EmpUI  {
	public void UI() {
		while(true) {
		System.out.println("Enter your choice");
		System.out.println("1.New Employee");
		System.out.println("2.Edit Employee");
		System.out.println("3.Delete Employee");
	    System.out.println("4.View All Employees");
	    System.out.println("5.Exit");
	    
	    Scanner sc = new Scanner(System.in);
	    int choice= sc.nextInt();
	    
	    switch(choice)
	    {
	    case 1:
	    {
	    	System.out.println("Enter employee data : ");
	    	System.out.println("Enter EmpID");
	       	int empid= sc.nextInt();
	       	System.out.println("Enter name ");
	       	String name= sc.next();
	       	System.out.println("Enter age");
	       	int age= sc.nextInt();
	       	System.out.println("Enter city");
	       	String city = sc.next();
	       	Employee emp= new Employee(empid,name,age,city);
	       	
	       	
	       	new EmployeeDAO().newEmployee(emp);
	    
	    	
	    }
	    break;
	    case 2:
	    {
	    	System.out.println("Enter EmpID to be edited: ");
	    	int id= sc.nextInt();
	    	new EmployeeDAO().updateEmployee(id);;
	    	break;
	    }
	    case 3:
	    {
	    	System.out.println("Enter EmpID to be deleted: ");
	    	int id= sc.nextInt();
	    	new EmployeeDAO().deleteEmployee(id);
	    }
	    	break;
	    case 4:
	    {
	    	System.out.println("Data of all employee: ");
	    	List ls= new EmployeeDAO().getAllEmployees();
	    	for(Object e1: ls)
	        {
	        	System.out.println(e1);
	        }
	    }
	    	break;
	    case 5:
	    	System.exit(0);
	    	break;
	    default:
	    	System.out.println("Invalid choice");
	    	
	    
	    }
	    
	    }
	}

}


