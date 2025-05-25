package com.constructors;

public class Empolyee 
{
	String Name;
	double Salary;
 public Empolyee(String name,double salary)
 {
	Name= name;
	Salary=salary;
 
 if (Salary<0)
 {
	 Salary=0;
 }
 }
 
 public void displayDetails()
 {
	 System.out.println("Name of the Employee :"+Name);
	 System.out.println("Salary of the Employee: "+Salary);
 }
 public static void main(String [] args) 
 {
 
	 Empolyee E = new Empolyee("Sravankumar",-1.0);
	 E.displayDetails(); 
}
}
