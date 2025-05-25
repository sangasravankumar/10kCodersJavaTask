public class NeonNumber
{
public void squaremethod(int num)
{
int squarednumber=num*num;
int temp=num;
int digit=0,sum=0;
while(squarednumber!=0)
{
digit= squarednumber%10;
sum=sum+digit;
squarednumber/=10;
}
if (temp==sum)
{
System.out.println("Neon");
}
else
{
System.out.println("Not Neon");
}

}
public static void main(String [] args )
{
NeonNumber NN = new NeonNumber();
NN.squaremethod(12);

}
}



