package com.book;
import com.publisher.Publisher;

public class Book 
{
 private String title;
 private String author;
 private double price;
 private Publisher  publisher;
 
 private Book(String title,String author,double price,Publisher  publisher)
 {
	 this.author=author;
	 this.price=price;
	 this.publisher=publisher;
	 this.title=title;
 }
 
 public void setTitle(String title)
 {
	 this.title=title;
 }
 public  void setPrice(double price)
 {
	 this.price=price;
 }
 public void setPublisher(Publisher  publisher)
 {
	 this.publisher=publisher;
 }
 public void setAuthor(String author)
 {
	 this.author=author; 
 }
 public String gettitle()
 {
	 return title;
 }
 public String getauthor()
{
	return author; 
}
 public Publisher getPublisher(Publisher publisher)
 {
	 return publisher;
 }
 public double getPrice(double price)
 {
	 return price;
 }
 
 public String toString()
 {
	 return "Title :"+title+"Author :"+author+"Price :"+price+"Publisher :"+publisher;
	 
 }
 public static Book getBookObject(String title,String author,double price,Publisher  publisher)
 {
	 if (title.isEmpty() || author.isEmpty() || author ==null || title==null || !(price>=50 && price<=1000))
	 {
		 return null;
	 }
	 return new Book(title,author,price,publisher);
		 
	 }
 }

