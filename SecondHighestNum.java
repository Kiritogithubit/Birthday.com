package com.StringArray;

public class SecondHighestNum {

	public static void main(String[] args) 
	{
          int[]a= {3,4,5,3,4,7,8,5};
          int s1=a[0];
          int s2=a[0];
          for(int i=1;i<a.length;i++)
          {
        	  if(a[i]==s1)continue;
        	  if(a[i]<s1)
        	  {
        		  s2=s1;
        		  s1=a[i];
        	  }
        	  else if(a[i]<s2|| s1==s2)
        	  {
        		  s2=a[i];
        	  }
          }
          System.out.println(s2);
	}

}
