package com.Kirito;
 class Art 
 {
	int a;
	public void initialize(int num)
	{
		 a=num;
	}
	public void display()
	{
		System.out.println("a= "+a);
	}
	public void Sum()
	{
		int sum=a+a;
		System.out.println("sum is " +sum);
	}
	int n1,n2;
	public void Minitialize(int b, int c)
	{
		 n1=b;
		 n2=c;
	}
	public void Mdisplay()
	{
		System.out.println("B="+n1+" "+"C="+n2);		
	}
	public void sum1()
	{
		int sum1=n1+n2;
		System.out.println("sum is :"+sum1);
	}
	int i,j,k;
	public void M1initialize(int d, int e, int f)
	{
		 i=d;
		 j=e;
		 k=f;
	}
	public void M1display()
	{
		System.out.println("i="+i+" "+"j="+j+" "+"k="+k);
				
	}
	public void sum2()
	{
		int sum2=i+j+k;
		System.out.println("sum is :"+sum2);
	}

		public static void main(String[] args)
		{
	      Art a1=new Art();
	      a1.initialize(15);
	      a1.display();
	      a1.Sum();
	      
	      Art a2=new Art();
	      a2.Minitialize(10, 15);
	      a2.Mdisplay();
	      a2.sum1();
	      
	      Art a3=new Art();
	      a3.M1initialize(10, 15,20);
	      a3.M1display();
	      a3.sum2();
		}

	}
	
	
