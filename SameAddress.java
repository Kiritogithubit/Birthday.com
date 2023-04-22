package com.Kirito;

class S
{
	int i=10;
	public S(int i)
	{
		this.i=i;
	}
	public S modify(int i)
	{
		if(this.i!=i)
		{
			return new S(i);
		}
		return this.i;
	}
	
}
public class SameAddress 
{

	public static void main(String[] args)
	{
      S s1=new S(10);
      System.out.println(s1);
      S s2=s1.modify(10);
      System.out.println(s2);
      System.out.println(s1==s2);
      
      
	}

}
