package com.constructors;

public class BankAccount {
	
	double balance;
	String  CustomerName;
	String  Address;
		
	public BankAccount(double balance, String  CustomerName ,String  Address) 
	{
	  this.balance=balance;
	  this.CustomerName=CustomerName;
	  this.Address=Address;
	}
	public BankAccount() 
	{
	  this.balance=0;
	  this.CustomerName="NA";
	  this.Address="NA";
	}
    public void deposit(double amount)
    {
    	if (amount>0)
    	{
    		this.balance+=amount;
    		System.out.println("Deposit Amount is "+balance);
    	}
    	else 
    	{
    		System.out.println("the Amount is invalid Deposit failed ");
    	}	
    }
   public void withdraw(double amount)
   {
	   if(amount<0) 
	   {
		   System.out.println("Invalid amount . Withdraw failed");
	   }
	   else if (amount>this.balance)
	   {
		   System.out.println("Insufficient Funds .withdraw is failed");
	   }
	   else
	   {
		   this.balance-=amount;
		   System.out.println("Remaining amount" + this.balance);
	   }
   }
   public void UpdateAddress(String newAddress)
   {
	   this.Address=newAddress;
	   System.out.println("Update Address is "+newAddress);
   }
   public void UpdateCustomerName(String newCustomerName)
   {
	   this.CustomerName=newCustomerName;
	   System.out.println("Update CustomerName is "+newCustomerName);
   }
   
   public void displayBankAccountdetails() 
   {
	   System.out.println("CustomerName: "+CustomerName+"\nBalance :"+ balance+ "\nAddress :"+Address);
   }
   public void displayBankAccountdetails(double balance, String  CustomerName ,String  Address) 
   {
	   System.out.println("Balance :"+ balance+"\nCustomerName: "+CustomerName+ "\nAddress :"+Address);
   }
   public static  void main(String [] args)
   
   {
	   BankAccount b = new BankAccount();
	   b. displayBankAccountdetails();
	   System.out.println("---------------------");
	   b.displayBankAccountdetails(1000.0,"Sravankumar","Nizampet");
	   b.deposit(2000);
	   b.deposit(-1000);
	   b.withdraw(1000);
	   b.withdraw(2000);
	   b.withdraw(500);
	   b.UpdateAddress("Maisammaguda");
	   b.UpdateCustomerName("Sanga Sravankumar");
   }
   
}
