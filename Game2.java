 package com.Kirito;
import java.util.*;
public class Game2
{
	public static void main(String[] args) 
	{
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("!...Welcome to my game...!");
		
		System.out.println("Enter your choice");
		for(;;)
		{
			System.out.println("1.Truth\n"
					+ "2.Dare");
			int choice=Keyboard.nextInt();
			
			if(choice>3 || choice<1)
				break;
			if (choice==1);
			{
			int num=0;
			if (num<0)System.out.println("No negatives");
			else
			{
				int i=1;
				while(i<=10)
				 {
					System.out.println(i);
					i++;
				 }
				System.out.println("choose a number between 1-10");
				int ch=Keyboard.nextInt();
				if(ch==1)
				{
				  System.out.println("Tell me your insta id");
				}
				else if(ch==2)
				{
			       System.out.println("Tell me your name");
				}
				else if(ch==3)
				{
			       System.out.println("Tell me your Address");
				}
				else if(ch==4)
				{
			       System.out.println("Tell me your Phone Number");
				}
				else if(ch==5)
				{
			       System.out.println("Tell me your bf/gf name");
				}
				else if(ch==6)
				{
			       System.out.println("Tell me your goal");
				}
				else if(ch==7)
				{
			       System.out.println("Tell me your biggest fear");
				}
				else if(ch==8)
				{
			       System.out.println("Tell me your bestfriend name");
				}
				else if(ch==9)
				{
			       System.out.println("Tell me your first love name");
				}
				else if(ch==10)
				{
			       System.out.println("Tell me about your dream");
				}
				else
					System.out.println("invalid number try again...!");
			}
}
			
			if(choice==2);
			{
				 int n=0;
					if (n<0)System.out.println("No negatives");
					else
					{
						int j=1;
						while(j<=10)
						 {
							System.out.println(j);
							j++;
						 }
			    System.out.println("choose a number between 1-10");
				int cho=Keyboard.nextInt();
				if(cho==1)
				{
				  System.out.println("call your best friend tell you are a fool ");
				}	
				else if(cho==2)
				{
				  System.out.println("slap your person on right side");
				}	
				else if(cho==3)
				{
				  System.out.println("kick your bestfriend ");
				}	
				else if(cho==4)
				{
				  System.out.println("slap rakesh rout ");
				}	
				else if(cho==5)
				{
				  System.out.println("stand up and dance for 1 min ");
				}	
				else if(cho==6)
				{
				  System.out.println("sing a song ");
				}	
				else if(cho==7)
				{
				  System.out.println("propose your cruse ");
				}	
				else if(cho==8)
				{
				  System.out.println("legs up head down ");
				}	
				
				else if(cho==9)
				{
				  System.out.println("see a horror movie tonight ");
				}	
				else if(cho==10)
				{
				  System.out.println("were your faviorate dress tomorrow ");
				}	
				else
				{
				  System.out.println("invalid number try again....! ");
				}	
				
             }
		
           }
		}
		System.out.println("please choose 1 for Truth 2 for Dare");
	
	
	}
}

	
	

