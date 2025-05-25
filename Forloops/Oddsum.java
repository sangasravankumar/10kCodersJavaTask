public class Oddsum
{
public  static  void main(String [] args)
{
int sum=0, num=30;
for( int i=1;i<=num;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println(sum);
}  
}