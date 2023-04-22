package com.Kirito;
import java.util.Scanner;
public class Power
{

	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the base: ");
	 int base=scan.nextInt();
	 System.out.println("Enter the Exp: ");
	 int Exp=scan.nextInt();
	 int res=1;
	 for(int i=1;i<=Exp;i++)
	 {
		 res=res*base;
	 }
	 System.out.println("The output is " +res);
	}

}
