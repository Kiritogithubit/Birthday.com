package com.Kirito;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int rev=0;
		while(num>0)
		{
			int res=num%10;
			rev=rev*10+res;
			num=num/10;	
		}
				System.out.println("Reverse = "+rev);
	}

}
