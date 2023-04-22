package com.Kirito;
import java.util.*;
public class Room
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
      System.out.println("!.....Welcome to my Hotel....!");
      System.out.println("enter any number for start the system");
      int num=scn.nextInt();
     for(;;)
     {
	      int j=1;
	      while(j<=10)
	      {
	    	 System.out.println(j);
	    	 j++;
	      }
	      System.out.println("How many person you want room 1-10");
	      int ch=scn.nextInt();
	      if (ch<=0|| ch>10)
	      {
	    	  break;
	      }
	      else
	      {
	    	  if(ch==1)
	    	  {
	    	  System.out.println("Room 107 avalable"); 
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==2)
	    	  {
	    	  System.out.println("Room 105 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==3)
	    	  {
	    	  System.out.println("Room 101 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==4)
	    	  {
	    	  System.out.println("Room 109 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==5)
	    	  {
	    	  System.out.println("Room not avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==6)
	    	  {
	    	  System.out.println("Room not avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==7)
	    	  {
	    	  System.out.println("Room 103 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==8)
	    	  {
	    	  System.out.println("Room 106 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==9)
	    	  {
	    	  System.out.println("Room 105 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else if(ch==10)
	    	  {
	    	  System.out.println("Room 110 avalable ");
	    	  System.out.println("Thanks for comming");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("We only have 10 rooms");
	    		  System.out.println("Thanks for comming");
	    	  }
	    	  return;
    	     }
    	  }
         System.out.println("Sorry sir/madam we don't have room for that many people");
         System.out.println("Thanks for comming");
	  }
    }
      
    

