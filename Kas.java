package com.Kirito;

import java.util.Scanner;

public class Kas 
{
	public static void RestAmount()
	{
		int Total=50000;
		int num=0;
		int Rest=Total-num;
	}

	

	public static void main(String[] args) 
	{
		
		Scanner Keyboard=new Scanner(System.in);
		for(;;)
		{
		System.out.println("1.Withdraw\n"
				+ "2.Deposite\n"
				+ "3.Account Balance\n"
				+ "4.Atm Balaance");
		int Choice=Keyboard.nextInt();
		if(Choice >4 || Choice <1) 
		{
			System.out.println("Not an Option");
		}
		
		if(Choice==1)
		{
			int num=0;
			System.out.println("Enter your Amount: ");
			 num=Keyboard.nextInt();
			System.out.println("Enter your Pin: ");
			int n1=Keyboard.nextInt();
			if(n1<1000 || n1>9999)
			{
				System.out.println("Invalid Pin");
			}
			else 
			{
				System.out.println(n1);
			}
		
		
		System.out.println("Amount Succesfully Withdraw");
		
		int n=num;
          int Total=50000;
          int rest=Total-n;
          System.out.println("rest balance is"+rest);
		}
          if(Choice==4)
  		{
        	int Atmbalance=1000000;
            System.out.println("Atm balance is");
		}	
			
		
		
		}
	}

}
