package com.Kirito;
import java.util.*;
public class Strong {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		  System.out.println("Enter a number: ");
		  int num=scn.nextInt();
		  int temp=num;
		  int fact=1;
		  while(num>0)
		  {
			  int rev=num%10;
			  fact=(fact*rev)+ rev--;
			  num=num/10;
			    
		  }
		  if(fact==temp)
			  System.out.println("strong number");
		  else
			  System.out.println("Not a strong number");
	}

}
