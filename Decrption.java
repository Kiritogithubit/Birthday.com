package com.StringArray;

public class Decrption {

	public static void main(String[] args) 
	{
        String s="aa";
        int n=-2;
        System.out.println(decrypt(s,n));  		
	}
	static String decrypt(String s,int n)
	{
		char[]a=new char[26];
		char ch='a';
		for(int i=0;i<26;i++)
		{
			a[i]=ch;
			ch++;
		}
		String s2=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int index=c-'a';
			index+=n;
			s2+=a[index%26];
		}
		return s2;
	}

}
