public class Evencount
{
public  static  void main(String [] args)
{
int c=0, num=50;
for( int i=1;i<=num;i++)
{
if(i%2==0)
{
c=c+1;
}
}
System.out.println(c);
}  
}