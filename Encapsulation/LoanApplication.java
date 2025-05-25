package com.encapsulation;

public class LoanApplication 
{
	private String CustomerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;
	
	public LoanApplication(String CustomerName,double loanAmount,double interestRate,int loanTerm,double outstandingBalance )
	{
	   this.CustomerName=CustomerName;
	   this.loanAmount=loanAmount;
	   this.interestRate=interestRate;
	   this.loanTerm=loanTerm;
	   this.outstandingBalance=outstandingBalance;
	   System.out.println("LoanApplication");
	}
	
	public String getCustomerName()
	{
		return CustomerName;
	}
	public double getloanAmount()
	{
		return loanAmount;
	}
	public double getinterestRate()
	{
		return interestRate;
	}
	public int getloanTerm()
	{
		return loanTerm;
	}
	public double getoutStandingBalance()
	{
		return outstandingBalance;
	}
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName=CustomerName;
	}
	public void setloanAmount(double loanAmount)
	{
		this.loanAmount=loanAmount;
	}
	public void setinterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
   public void setloanTerm(int loanTerm) 
   {
	   this.loanTerm=loanTerm;
   }
   public void  setoutstandingBalance(double outstandingBalance)
   {
	   this.outstandingBalance=outstandingBalance;
   }
  public void makePayment(double amount)
  {
	  if(amount<=0)
	  {
		  System.out.println("Invalid Payment");
	  }
	  else if (amount>this.outstandingBalance)
	  {
		System.out.println("payment exceeds loan balance");  
	  }
	  else
	  {
		  this.outstandingBalance-=amount;
		  System.out.println( "deducedamount is "+this.outstandingBalance);
	  }
  }
	
  public double calculateEMI() {
		double monrate = this.interestRate / (12 * 100);
	    int months = this.loanTerm *12;

	    if (monrate == 0) {
	        
	        return this.loanAmount / months;
	    }

	    double emi = (this.loanAmount * monrate * Math.pow(1 + monrate, months)) /
	                 (Math.pow(1 + monrate, months) - 1);
	    
	    return Math.round(emi*100.0)/100.0;
		
	}
  public void displayLoanDetails() {
		System.out.println("Customer Name:"+this.CustomerName+"\nInterest Rate:"+this.interestRate+"\nEMI:"+this.calculateEMI()+"\nBalance: "+this.outstandingBalance);
		System.out.println("-------------------------------------------------------------------------------");
	}
  public static void main(String[] args) {
		
		LoanApplication l = new LoanApplication("jithu",500000,10,5,1000);
		l.displayLoanDetails();
		l.makePayment(7000);
		l.setCustomerName("Nandha");
		l.setoutstandingBalance(23000);
		l.setinterestRate(8.6);
		l.setloanAmount(700000);
		l.setloanTerm(8);
		l.displayLoanDetails();
		
	LoanApplication l1 = new LoanApplication("Sivaji",100000,7.6,4,6000);
		l1.displayLoanDetails();
		l1.makePayment(7000);
		l1.setCustomerName("Harha Vardhan");
		l1.setoutstandingBalance(23000);
		l1.setinterestRate(8.6);
		l1.setloanAmount(700000);
		l1.setloanTerm(8);
		l1.displayLoanDetails();
		
	}
  }
