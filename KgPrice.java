package com.Kirito;
import java.util.*;
public class KgPrice
{

	public static void main(String[] args) 
	{
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter how much you take(in gram):");
      int num=scn.nextInt();
      float gm=(float) 0.67;
      if(num<=0)System.out.println("0.0 Ruppes");
      else
      {
    	  if(num>0 && num<10000)
    	  {
    		  float price=num*gm;
    		  System.out.println(price +" Rupees");
    	  }
    	  else
    	  {
    		 System.out.println("Over Weight Please Reduce the amount");
    	  }
      }
	}

}
