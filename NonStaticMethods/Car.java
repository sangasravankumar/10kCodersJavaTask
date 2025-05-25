public class  Car
{
public  void displaydetails(String showroomName,String modelName,int price)
{
System.out.println("ShowroomName="+showroomName);
System.out.println("modelName="+modelName);
System.out.println("price="+price);
}
public static void  main(String [] args)
{
Car car=new Car();
car.displaydetails("Elite","Tesla",80000);
}
}