package com.Kirito;

import java.util.Scanner;

public class Atm
{
	
	


	public  void TotalBalance(int num)
	{
		int Mbalance=50000;
		System.out.println("balance is "+Mbalance);
	}
	

	public void Amount(int num)
	{
		System.out.println("Enter your Amount: ");
		int Amount=num;
		System.out.println("Amount="+Amount);
	}
	public void display()
	{
	  System.out.println("Amount is ");
	}
	public void Pin(int num1)
	{
		System.out.println("Enter your pin: ");
		if(num1 >=1000 && num1 <=9999)
		{
			System.out.println("pin= "+num1);
		}
		else
		
		{
			System.out.println("Invalid Pin");
		}
	}
	  
	public void AccountBalance()
	{
		int Total=50000;
		int AccBalance=Total;
		System.out.println("Now your Balance is: "+AccBalance);
	}
	public void Withdraw() 
	{
		System.out.println("Amount="+new Atm());
		
	}


	public static void main(String[] args) 
	{ 
		Scanner scn=new Scanner(System.in);
		
		
		
		Atm a=new Atm();
		a.Amount(30000);
		Atm a1=new Atm();
		a1.Pin(2345);
		Atm a2=new Atm();
		a2.AccountBalance();
		

	}

	

	

	
		
	
}
