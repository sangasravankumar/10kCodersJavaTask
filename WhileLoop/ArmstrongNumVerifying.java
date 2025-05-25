public class ArmstrongNumVerifying
{
public void ArmstrongNumber(int  num)
{
int digit=0 ,sum=0;
int temp=num;
while(num!=0)
{
digit=num%10;
sum=sum+digit*digit*digit;
num=num/10;
}
if (temp==sum)
{
System.out.println("ArmstrongNumber");
}else{
System.out.println(" Not ArmstrongNumber");
}
}
public static void main(String [] args)
{
 ArmstrongNumVerifying ANV = new  ArmstrongNumVerifying();
 ANV. ArmstrongNumber(123);
}
}