public class  Reservation
{
public  String getReservationdetails(String hotelName,String guestName,int nights)
{
 return "hotelName :"+hotelName+"\nguestName :"+guestName+"\nnights :"+nights;
}
public static void  main(String [] args)
{
   Reservation reservation  = new Reservation();
   System.out.println(reservation.getReservationdetails("Varma's International","prasanth",2));           
}
}