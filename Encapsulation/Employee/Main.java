package com.main;
import com.employee.Employee;
import  com.company.Company;

public class Main 
{
	public static void  main(String [] args)
	{
	Company company =Company.getCompanyObject("TCS","Hyd","3 bond");
	Employee employee = Employee.getEmployeeobject( "Sravankumar","SD",12000,company);
	System.out.println(employee);
	System.out.println(company);
	
	}

}
