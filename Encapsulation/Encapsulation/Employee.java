package com.employee;
import com.company.Company;
public class Employee 
{
private String name;
private String  designation;
private int salary;
private Company company ;

private  Employee(String name,String designation,int salary,Company company )
{
  this.name=name;
  this.designation=designation;
  this.company=company;
  this.salary=salary;
}

public void setName(String name)
{	
this.name=name;
}
public void setDesignation(String designation)
{
 this.designation=designation;	
}
public void setSalary(int salary)
{
 this.salary=salary;	
}
public void setCompany(Company company)
{
  this.company=company;	
}
public String getName()
{
return name;	
}
public String getDesignation()
{
return designation;	
}
public int getSalary()
{
return salary;	
}
public Company getcompany()
{
return company;	
}
public String toString()
{
return "Name :"+name+"\nDesination :"+designation+"\nSalary"+salary+"\nCompany :"+company;	
}

public static Employee  getEmployeeobject(String name ,String designation,int salary ,Company company)
{
      return new Employee( name ,designation,salary,company);
}
}
