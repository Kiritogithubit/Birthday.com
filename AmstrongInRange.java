package com.Kirito;

import java.util.Scanner;

public class AmstrongInRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter start:");
		int s=scn.nextInt();
		System.out.println("enter end:");
		int e=scn.nextInt();
		int i,j;
		int temp;
		int res=0;
		for( i=e;i>=s;i--)
		{
			
			for( j=1;j<=i;j++)
			{
				int rem=i%10;
				res=res+rem*rem*rem;
				i=i/10;
			}
			System.out.println(i);

	}

}
	public int length(int a,int b)
	{
		int res=1;
		for(int i=0;i<b;i++)
		{
			res*=a;
		}
		return res;
	
		
	}
}
