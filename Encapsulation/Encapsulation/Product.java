package com.products;
import com.manufacturer.Manufacturer;

public class Product 
{
   private String productName;
   private String category;
   private Manufacturer manufacturer;
   private double price;
   
   private  Product( String productName, String category,Manufacturer manufacturer,double price) 
   {
	   this.manufacturer=manufacturer;
	   this.category=category;
	   this.price=price;
	   this.productName=productName;
   }
   public void setProductame(String productName)
   {
	   this.productName=productName;
   }
   public void setCategory(String category)
   {
	   this.category=category;
   }
   public void setPrice(double price)
   {
	   this.price=price;
   }
   public void setManufacturer(Manufacturer manufacturer)
   {
	   this.manufacturer=manufacturer;
   }
   public String getProductName()
   {
	   return productName;
   }
   public Manufacturer getManufacturer()
   {
	   return manufacturer;
   }
   public String getCategory()
   {
	   return category;
   }
   public double getPrice()
   {
	   return price;
   }
   public String toString()
   {
	   return productName+price+category+manufacturer;
   }
   
   public static Product getProductObject(String productName, String category,Manufacturer manufacturer,double price) 
   {
	   if ((manufacturer==null)||(price<=0))
	 {
		   return null;
	 }
	   return new Product(productName,category,manufacturer,price);    
   }
   
}


