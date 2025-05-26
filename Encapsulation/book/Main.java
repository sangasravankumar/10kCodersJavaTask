package com.mainpublisher;

import com.book.Book;
import com.publisher.Publisher;

public class Main 
{
public static  void main(String [] args)
{
Publisher publisher = Publisher.getPublisherObject("Sravankumar", "KNR","PUB12314");
Book book = Book.getBookObject("CoreJava","Hemanth",500, publisher);

if (publisher==null|| book==null)
{
	System.out.println("Enter Valid object");
}
else {
System.out.println(publisher);
System.out.println(book);
}
}
}

