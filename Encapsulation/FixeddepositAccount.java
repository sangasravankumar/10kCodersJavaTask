package com.encapsulation;

public class FixeddepositAccount 
{
private String CustomerName;
private double principalAmount;
private double interestRate;
private int duration;
private double maturityAmount;
public FixeddepositAccount(String CustomerName,double principalAmount, double interestRate, int duration,double maturityAmount)
{
	this.CustomerName=CustomerName;
	this.principalAmount=principalAmount;
	this.interestRate=interestRate;
	this.duration=duration;
	this.maturityAmount=maturityAmount;
}
public String getCustomerName()
{
	return CustomerName;
}
public double getprincipalAmount()
{
	return principalAmount;
}
public double  interestRate()
{
	return interestRate;
}
public int getduration()
{
	return duration;
}
public double getmaturityAmount()
{
	return maturityAmount;
}
public void setCustomerName(String CustomerName )
{
	this.CustomerName=CustomerName;
}
public void setprincipalamount(double principalAmount)
{
	this.principalAmount=principalAmount;
}
public void setinterestRate(double interestRate)
{
	this.interestRate=interestRate;
}
public void setduration(int  duration)
{
	this.duration=duration;
}
public void setmaturityAmount(double maturityAmount )
{
	this.maturityAmount=maturityAmount;
}
public void calculateMaturityAmount()
{
	maturityAmount= this.principalAmount*Math.pow(1+interestRate/100,duration);
			System.out.println("Maturity Amount is "+this.maturityAmount);
}
public void withdrawBeforeMaturity( int months) {
	if (months<=12) {
		System.out.println("Cannot With Drae Before One Year");
	}
	else {
		double remainingAmount=(principalAmount-(principalAmount*2/100));
	System.out.println("remainingAmount"+remainingAmount);
	}	
	}
public static void main(String[] args) {
	FixeddepositAccount obj1 = new FixeddepositAccount("teja,",50000,8,3,0);
	obj1.withdrawBeforeMaturity(14);
	obj1.calculateMaturityAmount();
}
	
}
