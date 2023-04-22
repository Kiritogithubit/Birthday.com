package com.Kirito;
class Test
{
	int a;
	
public void initialize(int num)
{
	int a=num;
}
public void display()
{
	System.out.println("sum=");
}
public void Sum()
{
	int sum=a*2;
	System.out.println();
}
class Test1 
 {

	public static void main(String[] args)
	{
      Test a1=new Test();
      a1.initialize(5);
      a1.display();
      a1.Sum();
	}

}
}