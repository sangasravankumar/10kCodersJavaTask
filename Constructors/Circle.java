package com.constructors;

public class Circle 
{ 
	double Radius;
	public Circle()
	{
	  Radius=5.0;
	}
    public void getArea(double Radius)
    {
    	double Area = (3.14)*(Radius*Radius);
    	System.out.println("Area of Cicle :"+Area);
    }
    public void getCircumreference(double Radius)
    {
    	double Circum = 2*(3.14)*(Radius);
    	System.out.println("Circumreference of Cicle :"+Circum);
    }
    public   static void  main(String [] args)
    {
    	Circle C = new Circle();
    	C.getArea(8);
    	C.getCircumreference(9);
    	
    }
}
