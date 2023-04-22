package com.StringArray;

public class Reverse {

	public static void main(String[] args) 
	{
		System.out.println(reverse("java"));
		System.out.println(reverse("souhagya"));

	}
	static String reverse(String s)
	{
		char[]a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
}
