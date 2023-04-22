package com.Kirito;
class Human1
{
	String name;
	int age;
	String gender;
	public Human1(String name1, int age1, String gender1) {
		super();
		this.name = name1;
		this.age = age1;
		this.gender = gender1;
	}


	@Override
	public String toString() {
		return "Human1 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
class Doctor extends Human1
{
String specialist;

public Doctor(String name,int age,String gender,String specialist)
{
	super(name,age,gender);
	this.specialist=specialist;
}

@Override
public String toString() {
	return "Doctor [name="+name+",age="+age+",gender="+gender+",occupation=" + specialist + "]";
}

}

public class DoctorHistory
	{

	public static void main(String[] args)
	{
      Doctor doctor1=new Doctor("Soubhagya", 22, "Male", "OPD");
      System.out.println(doctor1);
	}

}
