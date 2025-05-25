package com.constructors;

public class Book 
{
	String Title;
	String Author;
	
	public  Book(String Title1 ,String Author1)
	{
		Title=Title1;
		Author=Author1;
	}
	public  void  display(String Title ,String Author)
	{
		System.out.println("Title :"+Title+"\nAuthor :"+Author);
	}
	public static void main(String [] args)
	{
		Book b = new Book("Maths-1","Laxminarayana");
		b.display("Maths-1","Laxminarayana");
	}
}
