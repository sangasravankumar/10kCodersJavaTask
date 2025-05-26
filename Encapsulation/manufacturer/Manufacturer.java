package com.manufacturer;

public class Manufacturer 
{
    private String manufacturer;
    private String ManufacturerName;
    private String registrationNumber;
    
    private Manufacturer(String manufacturer, String ManufacturerName,String registrationNumber)
    {
    	this.manufacturer=manufacturer;
    	this.ManufacturerName=ManufacturerName;
    	this.registrationNumber=registrationNumber;
    }
    public void setManufacturer(String manufacturer) 
    {

        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturerName(String manufacturerName) {
        this.ManufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return ManufacturerName;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() 
    {
        return "Manufacturer [manufacturer=" + manufacturer + ", ManufacturerName=" + ManufacturerName + ", registrationNumber=" + registrationNumber + "]";
    }
    
    public  static Manufacturer getManufacturerObject(String manufacturer, String manufacturerName, String registrationNumber) {
      if (registrationNumber.length()>=10)
       {
    	
    	return null;   
       }return new Manufacturer(manufacturer, manufacturerName, registrationNumber);
       
}
}
