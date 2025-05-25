package com.constructors;

public class Rectangle 
{
	int length;
	int breadth;
 public Rectangle()
 {
	 length=10;
	 breadth=20;
 }
 public Rectangle(int len ,int bdth)
 {
	 length=len;
	 breadth=bdth;
 }
 public void Area()
 {
	 int Area=length*breadth;
	 System.out.println("Area of Rectangle :"+Area);
 }
 public static void main(String [] args)
 {
	 Rectangle R = new Rectangle();
	 R.Area();
	 Rectangle R1 = new Rectangle(20,20);
	 R1.Area();
 }
 
}

