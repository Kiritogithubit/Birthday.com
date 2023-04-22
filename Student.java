package com.Kirito;

public class Student 
{
	int id;
	String Name;
	int age;
	String Phno;
	static String StudentCollegeName; 
	
	public void AddStudents(int id,String Name,int age,String Phno)
	{
		this.id=id;
		this.Name=Name;
		this.age=age;
		this.Phno=Phno;
	}
	
	

	public static void main(String[] args)
	{
		Student.StudentCollegeName="jsp";
         Student a1=new Student();
        a1.AddStudents(0, StudentCollegeName, 0, StudentCollegeName);
	}
}
