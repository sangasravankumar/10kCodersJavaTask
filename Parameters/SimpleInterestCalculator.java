public class  SimpleInterestCalculator
{
public static void  calculateSimpleInterest(double principle, double rate, double time)
{
double Simpleinterest= (principle*rate*time)/100;
System.out.println("for inputs 1000.0, 5.0, 2.0 :"+Simpleinterest);
System.out.println("Simpleinterest :"+ Simpleinterest);
}
public static void main(String [] args)
{
calculateSimpleInterest(1000.0, 5.0, 2.0);
}
}
