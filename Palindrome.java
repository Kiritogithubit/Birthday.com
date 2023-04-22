package com.StringArray;

public class Palindrome {

	public static void main(String[] args)
	{
		System.out.println(ispalindrome("MAlayalam"));
		System.out.println(("JAva"));
		System.out.println(ispalindrome("cTC"));
		System.out.println(ispalindrome("BaNana"));  

	}
	static boolean ispalindrome(String s)
	{
		char[]a=s.toLowerCase().toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])return false;
			i++;
			j--;
		}
		return true;
	}
}
