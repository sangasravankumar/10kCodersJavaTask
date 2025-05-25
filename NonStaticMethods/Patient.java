public class  Patient
{
public  void printdetails(String Hospitalname,String patientNmae,int age)
{
System.out.println("Hospitalname="+Hospitalname);
System.out.println("patientNmae="+patientNmae);
System.out.println(" age="+ age);
}
public static void  main(String [] args)
{
Patient patient = new Patient();
patient.printdetails("Aruna","chintu",21);
}
}