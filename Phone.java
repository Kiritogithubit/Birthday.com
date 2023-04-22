package com.Kirito;
import java.util.Scanner;
 class Jio
{
	String simName;
	public Jio(String simName)
	{
		this.simName=simName;
	}
	public void callUsingJio()
	{
		System.out.println("call through" + simName + "and also use internet" );
	}
	
}
 class Airtel
 {
	 String simName;
		public Airtel(String simName)
		{
			this.simName=simName;
		}
		public void callUsingAirtel()
		{
			System.out.println("call through" + simName + "and no internet" );
		}
 }
 class Battery
 {
	 String batteryName;
	 public Battery(String batteryName)
	 {
		 this.batteryName=batteryName;
	 }
 }
 class Mobile
 {
	 String mobileName;
	 Jio jio;
	 Airtel airtel;
	 Battery battery;
	 
	 public Mobile(String mobileName,Battery batterey)
	 {
		 this.mobileName=mobileName;
		 this.battery=battery;
	 }
	 public void call()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("1.JIO \n2.Airtel");
		 int simSelect=scan.nextInt();
		 switch(simSelect)
		 {
		case 1:jio=new Jio("Jio");
			 jio.callUsingJio();
			 break;
		case 2:airtel=new Airtel("Airtel");
			 airtel.callUsingAirtel();
			 break;
		 }
	 }
 }
public class Phone {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Abhijit");
		System.out.println("Dial the Number: ");
		Long num=scn.nextLong();
		if(num==7008642150l)
		{
			Battery battery1=new Battery("Lithium-Ion");
			Mobile mobile1=new Mobile("NOKIA",battery1);
			mobile1.call();
		}
		else
			System.out.println("Wrong Number\nTry again");
		
	}

}
