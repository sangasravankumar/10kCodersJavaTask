package com.encapsulation;

public class CreditCardAccount 
{
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
	
	public  CreditCardAccount(String customerName,double creditLimit,double currentDebt,double interestRate)
	{
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.currentDebt=currentDebt;
		this.interestRate=interestRate;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	public double getcreditLimit()
	{
		return creditLimit;
	}
	public double getcurrentDebt()
	{
		return currentDebt;
	}
	public double getinterestRate()
	{
		return interestRate;
	}
	public void setcustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public void setcreditLimit(double creditLimit)
	{
		this.creditLimit=creditLimit;
	}
	public void setcurrentDebt(double currentDebt)
	{
		this.currentDebt=currentDebt;
	}
	public void setinterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	 public void swipeCard(double amount)
	 {
		 if (amount>this.creditLimit)
		 {
			 System.out.println("Transaction declined: Limit exceeded");
		 }
		 else {
				currentDebt=amount+currentDebt;
				System.out.println("Amount taken:"+amount);
				System.out.println("Current Debt:"+currentDebt);
			}
		}
		public void makePayment(double amount) {
			if(amount>currentDebt) {
				System.out.println("Excess payment not allowed");
			} else {
				currentDebt=currentDebt-amount;	
				System.out.println("Paid Amount:"+amount);
				System.out.println("Current Debt:"+currentDebt);
			}
		}
		public void applyIntrest() {
			currentDebt=currentDebt+(currentDebt*(interestRate/100));
			System.out.println("Current Debt with interest is:"+currentDebt);
		}
		public String toString() {
			return "Customer name:"+customerName+"\nCredit Limit:"+creditLimit+"\nCurrent Debt:"+currentDebt+"\nInterestRate:"+interestRate;
		}
		public static void main(String[] args) {
			CreditCardAccount card=new CreditCardAccount("teja", 3000, 10000, 0.8);
			System.out.println(card);
			card.swipeCard(500);
			card.makePayment(1000);
			card.applyIntrest();
		}
		 
	 }
