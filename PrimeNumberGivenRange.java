package com.Kirito;

import java.util.Scanner;

public class PrimeNumberGivenRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter start:");
		int s=scn.nextInt();
		System.out.println("enter end:");
		int e=scn.nextInt();
		int count=0;
		int flag=e-s;
		int r=e-s;
		int i,j;
		for( i=e;i>=s;i--)
		{
			
			for( j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
//				System.out.println(j);
				flag--;
				if(flag==r-2) {
					System.out.println(i);
					break;
				}
		}
		
	}

}
