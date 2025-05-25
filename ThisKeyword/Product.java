package com.constructors.thiskeyword;

public class Product {
	int id;
	double price;
	public Product(int id,double price)
	{
		this.id=id;
		this.price=price;
	}
	public boolean isSame(Product p)
	{
		if(p.id==this.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		 
		Product p = new Product(1,234);
		Product p1 = new Product(1,432);
		System.out.println(p.isSame(p));
		System.out.println(p1.isSame(p));
		
		System.out.println("----------------");
		Product p2 = new Product(1,234);
		Product p3 = new Product(2,432);
		System.out.println(p2.isSame(p3));
		System.out.println(p3.isSame(p2));	
	}
}

