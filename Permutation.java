package com.StringArray;

public class Permutation {

	public static void main(String[] args)
	{
		permutation1("you",0,2);

	}
	static void permutation1(String s,int start,int end)
	{
		if(start==end)
			{
			System.out.println(s);
		    return;
			}
		
		for(int i=start;i<=end;i++)
		{
			String s1=swap(s,start,i);
			permutation1(s1,start+1,end);
		}
			
	}
	static String swap(String s,int i,int j)
	{
		char[]a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}

}
