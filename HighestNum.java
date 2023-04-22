package com.Kirito;
import java.util.*;
public class HighestNum 
{

	public static void main(String[] args) 
	{
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num=scn.nextInt();
      if(num<0) System.out.println("no negatives");
      else
      {
    	  int highest=0;
    	  while(num>0)
    	  {
    		  int rem=num%10;
    		  if(highest<rem)
    		  {
    			  highest=rem;
    		  }
    			  num/=10;
    	  }
    	  
      }
	}

}
