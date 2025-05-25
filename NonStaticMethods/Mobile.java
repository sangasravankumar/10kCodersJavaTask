public class  Mobile
{
public  void showdetails(String storename,String brand,int price)
{
System.out.println("storename="+storename);
System.out.println("brand="+brand);
System.out.println(" price="+ price);
}
public static void  main(String [] args)
{
Mobile mobile = new Mobile();
mobile.showdetails(" world","iphone",800000);
}
}