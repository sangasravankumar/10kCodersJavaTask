package com.publisher;

public class Publisher 
{
 private String publisherName;
 private String publisherLocation;
 private String licenseCode;
  private Publisher(String publisherName,String publisherLocation,String licenseCode)
  {
	  this.licenseCode=licenseCode;
	  this.publisherLocation=publisherLocation;
	  this.publisherName=publisherName;
  }
  
  public void setPublisherName(String publisherName)
  {
	  this.publisherName=publisherName;
  }
  public void setpublisherLocation(String publisherLocation)
  {
	  this.publisherLocation=publisherLocation; 
  }
  public void setLicenseCode(String licenseCode)
  {
	  this.licenseCode=licenseCode;  
  }
  
  public String getpublisherName()
  {
	  return publisherName;
  }
  public  String getpublisherLocation()
  {
	  return publisherLocation;
  }
  
  public String getlicenseCode()
  {
	  return  licenseCode;
  }
  
  public String toString()
  {
	  return"licenseCode="+licenseCode
	  		+ "publisherLocation="+publisherLocation
	  		+ "publisherName="+publisherName;
  }
  public static Publisher getPublisherObject(String publisherName,String publisherLocation,String licenseCode)
  {
	  if((licenseCode.startsWith("PUB")) && (licenseCode.length()==8))
      {
        return new Publisher(publisherName,publisherLocation,licenseCode);
      }
	  return null;
  }
}
