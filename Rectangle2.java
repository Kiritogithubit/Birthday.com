package com.Kirito;

 class Rectangle2
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
 
	

		public static void main(String[] args)
		{
	       Rectangle2 r1=new Rectangle2();
	       r1.initialize(4,7);
	       r1.display();
	       r1.CalcArea();
	       Rectangle2 r2=new Rectangle2 ();
	       r2.initialize(12,5);
	       r2.display();
	       r2.CalcArea();
	    }

	}



	


