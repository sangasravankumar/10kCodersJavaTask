package com.constructors.thiskeyword;

public class Student 
{
 int rollno;
 String name;
 public  Student(int rollno,String name)
 {
	 this.rollno=rollno;
	 this.name=name;
 }
 public void Updatedetails(String name)
 {
	 this.name=name;
 }
 public String display()
 {
	 return "Roll no :"+rollno +"\n Name : "+name;
 }
 public static  void main(String [] args)
 {
	 Student student =new Student(21,"Sravankumar");
	 String str1 = student.display();
	 System.out.println(str1);
	 student.Updatedetails("kumar");
	 String str2 = student.display();
	 System.out.println(str2);  
 }
}
