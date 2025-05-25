public class Calculator
{
public static void addition()
{
int a=10;
int b=2;
int c=a+b;
System.out.println("Addition of a and b is "+ c );
}
public static void subraction()
{
int a=10;
int b=2;
int s=a-b;
System.out.println("Subtraction of a and b is "+ s );
}
public static void multiplication()
{
int a=10;
int b=2;
int m=a*b;
System.out.println("multiplication of a and b is "+ m );
}
public static void division ()
{
int a=10;
int b=2;
int d=a/b;
System.out.println("Division of a and b is "+ d );
}
public static void modulus()
{
int a=10;
int b=2;
int mod=a%b;
System.out.println("Modulus of a and b is "+ mod );
}
public static void main (String [] args)
{
addition();
subraction();
multiplication();
division ();
modulus();
}
}