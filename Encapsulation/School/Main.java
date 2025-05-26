package com.mainstudentschool;
import com.school.School;
import com.student.Student;

public class Main 
{    
	
	public static void main(String [] args) 
	{
	School school = School.getSchoolObject("TSMS",null,"Success Anywhere");
	Student student = Student.getStudentObject("Sravankumar","B",school,40.0);
	if (school ==null || student ==null)
	{
	System.out.println("Invalid object");	
		
	}
	else {
	System.out.println(student);
	System.out.println(school);
	}
	}

}
