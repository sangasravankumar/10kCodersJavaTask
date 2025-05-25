public class Divisibleby9
{
public  static  void main(String [] args)
{
int num=100 ,c=0;
for( int i=1;i<=num;i++)
{
if (i%9==0)
{
c=c+1;
System.out.println(i);
}
}
System.out.println(c);
}  
}