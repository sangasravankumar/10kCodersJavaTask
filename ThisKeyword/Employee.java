package com.constructors.thiskeyword;

public class Employee 
{
	String name;
	double salary;
public Employee(String name,double salary)
{
  	this.name=name;
  	this.salary=salary;
}
public void setsalary(String name,double salary)
{
	this.name=name;
	this.salary=salary;
}
public String display()
{
	return "name = "+name+"\nSalary = "+salary;
}
public static void  main(String [] args)
{
	Employee employee = new Employee("Sravankumar",50000);
	String str=employee.display();
	System.out.println(str);
	employee.setsalary("kumar", 10000);
	String str1=employee.display();
	System.out.println(str1);
	
}
}
