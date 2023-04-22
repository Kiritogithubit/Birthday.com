package com.Kirito;
class E
{
	int id;
	String name;
	int age;
	String gender;
	String phone;
	static String StudentCollageName;
    static String StudentCollageAdress;
    public void addstudents(int id,String name,int age,String gender,String phone)
	{
		this. id=id;
		this. name=name;
		this. age=age;
		this. gender=gender;
        this. phone=phone;
	
	}
    
    public void displaystudents()
    {
    	System.out.println("student ID:"+ this.id);
    	System.out.println("student Name:"+ this.name);
    	System.out.println("student Age:"+ this.age);
    	System.out.println("student gender:"+this. gender);
    	System.out.println("student phone:"+this. phone);
    	System.out.println("StudentCollageNames:"+ StudentCollageName);
    	System.out.println("StudentCollageAdress:"+ StudentCollageAdress);
    	
    }
    public class Employee
    {
    
    	   public static void main(String[] args)
    	   {
    		   
    		E.StudentCollageName="JSP";
    	    E.StudentCollageAdress="OAR"; 
    	    
    	    E s1=new E();
    	    s1.addstudents(1, "KJJK", 12, "JSP", "OAR");
    	    s1.displaystudents();
    	    
    	    E s2=new E();
    	    s2.addstudents(2, StudentCollageName, 0, StudentCollageName, StudentCollageAdress);
    	    s2.displaystudents();
    	    
    	    E s3=new E();
    	    s3.addstudents(3, StudentCollageName, 0, StudentCollageName, StudentCollageAdress);
    	    s3.displaystudents();
    	    
    	    E s4=new E();
    	    s4.addstudents(0, StudentCollageName, 0, StudentCollageName, StudentCollageAdress);
    	   }
    	    
   }



}









