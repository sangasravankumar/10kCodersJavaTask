package com.student;
import com.school.School;

public class Student 
{
  private String studentName;
  private String grade;
  private School school;
  private double averageMarks;
  
  private Student(String studentName,String grade,School school,double averageMarks)
  {
	  this.school=school;
	  this.averageMarks=averageMarks;
	  this.grade=grade;
	  this.studentName=studentName;
  }
  public String getStudentName()
  {
	  return studentName;
  }  
  public String getGrade()
{
	return grade;
}
  public double getaverageMarks()
  {
	  return averageMarks;
  }
  public School getSchool()

  {
	  return school;
  }
  public void setStudentName(String studentName)
  {
	  this.studentName=studentName;
  }
  public void setGrade(String grade)
  {
	  this.grade=grade;  
  }
  public void setaverageMarks(double averageMarks)
  {
	  this.averageMarks=averageMarks;
  }
  public void setSchool(School school)
  {
	  this.school=school;
  }
  
  public String toString()
  {
	  return "StudentName : " +studentName+"Grade :"+grade +"School :"+school+"averageMarks :"+averageMarks;
  }
  public static Student getStudentObject(String studentName,String grade,School school,double averageMarks)
  {
	 if ((averageMarks<=0)&&(averageMarks>=100)|| (school==null ))
	 { 
		  return null ;
	 }
	  return new Student(studentName, grade,school, averageMarks);
  }
		  
  }
  