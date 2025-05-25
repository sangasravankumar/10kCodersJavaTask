package com.constructors.thiskeyword;

public class Box 
{
 int length;
 public Box() {
	 
 }
 public Box(int length)
 {
	 this.length=length;
 }
 public Box setLength(int length)
 {
	 this.length=length;
	 return this;
 }
 public void display()
 {
	 System.out.println("Length :"+length); 
 }
 public  static void main(String [] args)
 {
	 
	 Box b =new Box();
	 b.setLength(20).display();
	 Box box =new Box(10);
	 box.setLength(10).display();
 }
}
