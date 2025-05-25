public class  Order
{
public  void getOrderdetails(String RestaurantName,String fooditem,int quantity)
{
System.out.println("RestaurantName="+RestaurantName);
System.out.println("fooditem="+fooditem);
System.out.println(" quantity="+ quantity);
}
public static void  main(String [] args)
{
Order order =new Order();
order.getOrderdetails("Mehfil","Briyani",150);
}
}