public class  Book
{
public  void displayInfo(String libraryname,String title,String author)
{
System.out.println("libraryname="+libraryname);
System.out.println("title="+title);
System.out.println("author="+author);
}
public static void  main(String [] args)
{
Book book=new Book();
book.displayInfo("City Public Library","The Great Gatsby","F.scott fitzgerald");
}
}