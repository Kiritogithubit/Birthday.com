package com.Kirito;
class Static
{
public static void m1(int...arg)
{
	for(int i:arg)
	{
		System.out.println(i);
	}
	int sum=0;
	for(int i=0;i<arg.length;i++)
	{
		sum=sum+arg[i];
	}
	System.out.println("The sum is "+sum);
}
static int a;
public static void initialize(int num)
{
	 a=num;
}
public static void display()
{
	System.out.println("a= "+a);
}
public static void Sum()
{
	int sum=a+a;
	System.out.println("sum is " +sum);
}

	public static void main(String[] args) 
	{
       m1(20,28,26);
       m1(29,10);
       
       Static a1=new Static();
	      a1.initialize(15);
	      a1.display();
	      a1.Sum();
	      
	   m1(10,23,45,54);
	}
}


