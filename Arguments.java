package com.Kirito;
import java.util.Scanner;

public class Arguments {
	public static int factorial(int num)
	{
		
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
		
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please give me number: ");
		int num=scan.nextInt();
		if(num<0)
		{
			System.out.println("No negative values...!");
			
		}
		else
		{
			System.out.println(num +"!="+factorial(num));
			System.out.println("Thank you");
		}
		
		
	}

}
