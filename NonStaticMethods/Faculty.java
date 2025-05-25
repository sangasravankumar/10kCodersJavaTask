public class  Faculty
{
public  void showfacultydetails(String universityname,String facultyName,String department)
{
System.out.println("universityname="+universityname);
System.out.println("facultyName="+facultyName);
System.out.println("department="+department);
}
public static void  main(String [] args)
{
Faculty faculty = new Faculty();
faculty.showfacultydetails("SR","sravankumar","ECE");
faculty.showfacultydetails("SR-2","kumar","ECE-b");
}
}