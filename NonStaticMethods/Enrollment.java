public class  Enrollment
{
public  String getEnrollmentInfo(String platform,String course,String student)
{
 return "Platform :"+platform+"\ncourse :"+course+"\nstudent :"+student;
}
public static void  main(String [] args)
{
   Enrollment enrollment = new Enrollment();
   System.out.println(enrollment.getEnrollmentInfo("10kCoders","Java Full stack","Sravankumar"));
            
}
}