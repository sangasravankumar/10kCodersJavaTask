package com.VechicleHierarchy_Task_3_1;

class Vechicle 
{
	String make;
	String model;
	String year;
    public void displayInfo()
    {
    	System.out.println("Make :"+make+"Model"+model+"Year"+year);
    }
}

class Car extends Vechicle
{  int NumberOfDoors;
  public Car(String make,String model,String year,int  NumberOfDoors ) 
  {
	  this.make=make;
	  this.model=model;
	  this.year=year;
	  this.NumberOfDoors=NumberOfDoors;
  }
    public void displayCarInfo()
    {
    	System.out.println("NumberOfDoors :"+NumberOfDoors);
    	
    }
}

class Truck extends Vechicle
{
int  cargoCapacity;
public Truck(String make,String model,String year,int  cargoCapacity)
{
	 this.make=make;
	 this.model=model;
	 this.year=year;
	 this.cargoCapacity=cargoCapacity;
}
public void displayTruckInfo()
{
System.out.println("CargoCapacity "+cargoCapacity);
}
}
class MotorCycle extends Vechicle
{
	boolean hasSidebar;
	public MotorCycle(String make,String model,String year,boolean hasSidebar)
	{
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 this.hasSidebar=hasSidebar;	
	}
	public void displayMotorCycleInfo(){
	System.out.println("hasSiderbar :"+hasSidebar);	
	}
}
public class Vechicle_Hierarchy 
{
	
	public static void main(String [] args)
	{
      Vechicle car = new Car("Toyota","corolla","2022",4);
      car.displayInfo();
      ((Car) car).displayCarInfo();
      System.out.println();
       Vechicle  truck = new Truck("Ford","F-150","2021",1000);
       truck.displayInfo();
       ((Truck)truck).displayTruckInfo();
       System.out.println();
       Vechicle motorCycle = new MotorCycle("Harley-Davidson", "Street Glide", "2023", true);
       motorCycle.displayInfo();
      ((MotorCycle) motorCycle).displayMotorCycleInfo();
       
	}
}

