package com.constructors;
import java.util.Scanner;
	public class LaptopC {
	String brand;
	int ramSize;
	public LaptopC(String bran,int ram) {
	this.brand=bran;
	this.ramSize=ram;
	}
	public void showSpecs() {
	System.out.println("Laptop Brand:"+brand);
	System.out.println("Laptop ramsize:"+ramSize);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter brand name:\n");
	String userbrand=sc.nextLine();
	System.out.println("Enter ramsize:\n");
	int userRamSize=sc.nextInt();
	LaptopC lp=new LaptopC("Dell",32);
	lp.showSpecs();
	LaptopC userInput=new LaptopC(userbrand,userRamSize);
	userInput.showSpecs();
	sc.close();
	}
}
