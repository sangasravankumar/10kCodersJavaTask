package com.mainmanucaturer;

import com.manufacturer.Manufacturer;
import com.products.Product;

public class Main 
{
	public static void main(String [] args)
	{
Manufacturer manufacturer = Manufacturer.getManufacturerObject("Sravankumar","Honda", "12333");
Product product = Product.getProductObject("Car","Automobiles", manufacturer, 1200);
if((manufacturer==null )|| (product==null))
{
System.out.println("Invalid Product/Manufacturer");	
}
else {
System.out.println(manufacturer);
System.out.println(product);
}
}
}
