package com.Employee_Hierarchy_Task_3_2;

class Employee
{
     String name ;
     int baseSalary;
      public  void  calculateAnnualSalary()
      {
    	  System.out.println("AnnualSalary :"+(baseSalary*12));
      }
}

class Manager extends Employee
{
	 int  bonus;
	 int numberOfEmpoyeeManaged;
	 public Manager(String name,int baseSalary,int  bonus, int numberOfEmpoyeeManaged)
	 {
		 this.name=name;
		 this.baseSalary=baseSalary;
		 this.bonus=bonus;
		 this.numberOfEmpoyeeManaged=numberOfEmpoyeeManaged;
	 }
   public void  calculateManagerSalary()
   {
	   System.out.println("Annual Salary  with bonus:"+((baseSalary*12)+bonus));
   }
}
class Engineer extends Employee
{
	int projectCount;
	public  Engineer(String name,int baseSalary,int projectCount)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		this.projectCount=projectCount;
	}
	public void  calculateEngineerSalary() 
	{
	System.out.println("Annual Salary with ProjectCount :"+((baseSalary*12) +(projectCount*1000)));
	}


}
class Salesperson extends Employee
{
   double CommissionRate;
   int totalSales;
     public Salesperson(String name ,int baseSalary,double CommissionRate,
     int totalSales)
     {
    	 this.name=name;
		 this.baseSalary=baseSalary;
		 this.CommissionRate=CommissionRate;
		 this.totalSales=totalSales;   
     }
    public void calculateSalespersonSalary()
    {
    	 System.out.println("Annual Salary  with :"+((baseSalary*12)+(CommissionRate*totalSales)));
    }   
}

public class Employee_Hierarchy 
{
	  public static void main(String [] args)
	  {
		  Employee manager = new Manager("Alice", 50000, 10000, 5);
		  manager.calculateAnnualSalary();
		  ((Manager)  manager).calculateManagerSalary();
		  System.out.println("---------------");
		  Employee engineer= new Engineer("Bob", 70000, 5);
		  engineer.calculateAnnualSalary();
		  ((Engineer)  engineer).calculateEngineerSalary();
		  System.out.println("---------------");
		  Employee salesperson= new Salesperson("Charlie", 40000, 0.1, 200000);
		  salesperson.calculateAnnualSalary();
		  ((Salesperson) salesperson).calculateSalespersonSalary(); 
	}
}
