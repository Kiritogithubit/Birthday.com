package com.Kirito;


class C
{
	
}

class D extends C
{
	
}
public class Main1 {

	public static void main(String[] args)
	{
        Object obj=new Object();
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof D);
        
        C c=new C();
        System.out.println(c instanceof Object);
        System.out.println(c instanceof C);
        System.out.println(c instanceof D);
        
        D d=new D();
        System.out.println(d instanceof Object);
        System.out.println(d instanceof C);
        System.out.println(d instanceof D);
        
        C c1=new D();
        System.out.println(c1 instanceof Object);
        System.out.println(c1 instanceof C);
        System.out.println(c1 instanceof D);
        
	}

}
