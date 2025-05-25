public class RectanglePerimeterCalculator
{
public static void calculatePerimeter(double length, double breadth)
{
double perimeter=2*(length+breadth);
System.out.println("for inputs  5.0, 3.0 :"+perimeter );
System.out.println(" perimeter :"+ perimeter);
}
public static void main(String [] args)
{
calculatePerimeter(5.0, 3.0);
}
}
