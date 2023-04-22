package com.Kirito;
import java.util.*;
public class Amstrong {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		  System.out.println("Enter a number: ");
		  int num=scn.nextInt();
		  int temp=num;
		  int s=0;
		  while(num>0)
		  {
			  int rev=num%10; s=s+rev*rev*rev; num=num/10;
		  }
			  if(s==temp) System.out.println("Amstrong number");
			  else System.out.println("Not an Amstrong number");
	}
}
