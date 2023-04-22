package com.StringArray;

public class Reverse2 {

	public static void main(String[] args)
	{
      System.out.println(reverse2("soubhagya"));
	}
	static String reverse2(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		return s2;
	}

}
