package com.Kirito;
import java.util.*;
public class Reverse2 
{
    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=scn.nextInt();
	int res=0;
	int temp=num;
	while(num>0)
	{
		int rem=num%10;
		res=rem*rem*rem+res;
		num=num/10;
	}
       if(temp==res)System.out.println("amstrong number");
       else System.out.println("not an amstrong number");
  }
}

