package com.shapeHierarchy;

class Shape 
{
   public double calculateArea()
   { 
	     return 0.0;
   }
}

class Circle extends Shape
{
	double radius;
  public Circle(double radius)
  {
	  this.radius=radius;
  }
  public double calculateCircleArea()
  {
	    return (3.14)*(radius*radius);
  }
  
  public double calculateArea()
  {
	  return calculateCircleArea();
  }
}
class Rectangle extends Shape
{
	double length,width;
  public Rectangle(double length,double width)
  {
	  this.length=length;
	  this.width=width;
  }
  public double calculateRectangleArea()
  {
	    return (length*width);
  }
  public double calculateArea()
  {
	  return calculateRectangleArea();
  }
}
class Triangle extends Shape
{
	double base;
	double height;
  public Triangle(double height,double base )
  {
	  this.height=height;
	  this.base=base;
  }
  public double calculateTriangleArea()
  {
	    return (0.5)*(base*height);
  }
  public double calculateArea()
  {
	  return calculateTriangleArea();
  }
  }
public class ShapeHierarchy 
{

	public static void main(String [] args)
	{
		
		Shape circle =new Circle(4.0);
		System.out.println(circle.calculateArea());
		System.out.println(((Circle) circle).calculateCircleArea());
		Shape rectangle =new Rectangle(4.0,2.0);
		System.out.println(rectangle.calculateArea());
		System.out.println(((Rectangle) rectangle).calculateRectangleArea());
		Shape triangle =new Triangle(4.0,2.0);
		System.out.println(triangle.calculateArea());
		System.out.println(((Triangle) triangle).calculateTriangleArea());
		
		
	}
	
}
