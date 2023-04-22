package com.Kirito;
public class Employee1
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
    
    	   public static void main(String[] args)
    	   {
    		   
    		Employee1.StudentCollageName="JSP";
    	    Employee1.StudentCollageAdress="OAR"; 
    	    
    	    Employee1 s1=new Employee1();
    	    s1.addstudents(0, StudentCollageName, 0, StudentCollageName, StudentCollageAdress);
    	   }
    	    
   }













