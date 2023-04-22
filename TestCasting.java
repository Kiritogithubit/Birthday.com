package com.Kirito;

class AA extends Object
{
	int i=100;
	public void m1()
	{
		System.out.println("hii");//generic
	}
	public void m2()
	{
		System.out.println("good morning");//overridden methodss
	}
}
class B extends AA
{
	int i=200;
	public void m2()
	{
		System.out.println("Hello");//overriding method
	}
	public void m3()
	{
		System.out.println("good evening");//specific method
	}
}

public class TestCasting
{

	public static void main(String[] args) 
	{
        // A a=new B();
         AA a=(AA) new B();//uocasting
         a.m1();
         a.m2();
        // a.m3()//NOT ACCESABLE
         
         B b=(B)a; //downcasting
         b.m3();
         
     //  ((B)a).m3( ;
     //  b.m3();
         
         System.out.println(b.i);
         
    }

}
