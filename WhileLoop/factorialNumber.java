public class factorialNumber
{
public void findFactorialofnum(int num)
{
int fact=1 ,i=1;
while(i<=num)
{
fact=fact*i;
i++;
}
System.out.println("factorial of num"+fact);
}
public static void main(String [] args)
{
factorialNumber fn = new factorialNumber();
fn.findFactorialofnum(7);
}
}