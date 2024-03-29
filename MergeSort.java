package com.StringArray;

public class MergeSort {

	public static void main(String[] args) 
	{
		int []a= {4,8,6,3,9,2};
		sort(a);
		for(int n:a)
		{
			System.out.println(n);
		}
	}
	public static void sort(int[]a)
	{
		if(a.length==1)return;
		int[]left=new int[a.length/2];
		int[]right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i]=a[i];
		}
		for(int i=0;i<right.length;i++)
		{
			right[i]=a[i+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	private static void merge(int[]a,int[]b,int[]c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<a[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else 
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
			
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
	}
}
