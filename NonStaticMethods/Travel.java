public class  Travel
{
public  String getBookingdetails(String agencyName,String desination,int travellers)
{
 return "agencyName :"+agencyName+"desination :"+desination+"travellers :"+travellers;
}
public static void  main(String [] args)
{
   Travel travel = new Travel();
   System.out.println(travel.getBookingdetails("Trips","Thirupathi",12));           
}
}