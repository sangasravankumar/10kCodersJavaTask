package com.school;

public class School 
{
 private  String schoolName;
 private String schoolAddress;
 private String schoolMotto;
 
 private School(String schoolName,String schoolAddress, String schoolMotto)
 {
      this.schoolName=schoolName;
      this.schoolAddress=schoolAddress;
      this.schoolMotto=schoolMotto;
 }
 public String getSchoolName()
 {
	 return schoolName;
 }
 public String getSchoolAddress()
 {
	 return schoolAddress;
 }
 public String  getSchoolMotto()
 {
	return schoolMotto; 
 }
 
 public void setSchoolName(String schoolName)
 {
	 this.schoolName=schoolName;
 }
 public void setSchoolAddress(String schoolAddress)
 {
	 this.schoolAddress=schoolAddress;
 }
 
 public void setSchoolMotto(String schoolMotto)
 {
	 this.schoolMotto=schoolMotto;
 }
 public String toString()
 {
	  return "SchoolName : " +schoolName+"SchoolAddress:"+schoolAddress +"SchoolMotto :"+schoolMotto;
 }
 
 public static School  getSchoolObject(String schoolName,String schoolAddress, String schoolMotto)
 {
	 if (schoolName.isEmpty() || schoolAddress.isEmpty() || schoolMotto.isEmpty() || schoolName==null|| schoolAddress==null||schoolMotto==null)
	 {
		 
		 return null;
	 }
	 return new School(schoolName,schoolAddress,schoolMotto);
 
 }
 }
 
 
 
 