package com.StringArray;

public class SmallestNum {

	public static void main(String[] args)
	{
		int[]a= {5,7,9,3,7,4};
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<small)small=a[i];
		
		}
       System.out.println(small);
	}

}
