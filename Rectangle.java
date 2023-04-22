package com.Kirito;
class Rectangle
{
	int Length,Breath;

public void initialize(int a,int b)
{
	Length=a;
	Breath=b;
}
public void display()
{
	System.out.println(Length +"and"+ Breath);
	
}
public void CalcArea()
{
	int Area=Length*Breath;
	System.out.println("Area=" +Area);
}


public class Rectangle1 
{

	public static void main(String[] args)
	{
       Rectangle r1=new Rectangle();
       r1.initialize(4,7);
       r1.display();
       r1.CalcArea();
       Rectangle r2=new Rectangle ();
       r2.initialize(12,5);
       r2.display();
       r2.CalcArea();
    }

}
}
