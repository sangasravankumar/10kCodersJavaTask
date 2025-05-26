package com.company;

public class Company 
{
  private String CompanyName;
  private String CompanyAddress;
  private String CompanyRules;
  
  private Company(String CompanyName,String CompanyAddress,String CompanyRules)
  {
	  this.CompanyName=CompanyName;
	  this.CompanyAddress=CompanyAddress;
	  this.CompanyRules=CompanyRules;
  }
  public String getCompanyName( )
  
  {
	  return CompanyName;
  }
  public String getCompanyAddress()

  {
	  return CompanyAddress;
  }
  public String getCompanyRules() 
  {
	return CompanyRules;  
  }
  public void setCompanyName(String name)
  {
	  this.CompanyName=CompanyName;
  }
  public void setCompanyAddress(String CompanyAddress)
  {
	  this.CompanyAddress=CompanyAddress;
  }
  public void setCompanyRules(String CompanyRules)
  {
	  this.CompanyRules=CompanyRules;
  }
  
  public String toString()
 {
 return "CompanyName :"+CompanyName+"CompanyAddress"+CompanyAddress+"CompanyRules:"+CompanyRules;	  
 }
  public static Company getCompanyObject(String CompanyName,String CompanyAddress,String CompanyRules)
  {
	  return new Company(CompanyName,CompanyAddress,CompanyRules);
  }
}
