package com.Kirito;

class Animal
{
	public void drinkWater()
	{
		System.out.println("Every animal required water to survive");
	}
	public void sound()
	{
		
	}
	public void movement()
	{
		
	}
}
class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Lion Roars");
	}
	@Override
	public void movement()
	{
		System.out.println("Lion Runs/Walks");
	}
	public void Pray()  //specific method
	{
		System.out.println("Ready for the food");
	}
}
class Snake extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("HHHHHHssssssssss");
	}
	@Override
	public void movement()
	{
		System.out.println("Nagin Dance");
	}
	public void venomUse()  //specific method
	{
		System.out.println("snake venom is a medicinal when used with some guidelines");
	}
}
public class GamingCharacters 
{

	public static void main(String[] args) 
	{
       
       Animal animal1=new Lion();
       animal1.drinkWater();
       animal1.sound();
       animal1.movement();
       
       System.out.println("*****************");
       
       Lion lion=(Lion)animal1;
       lion.Pray();
       
       System.out.println("*****************");
       System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
       
       Animal animal2=new Snake();
       animal2.drinkWater();
       animal2.sound();
       animal2.movement();
       
       System.out.println("*****************");
     //  ((Snake)animal2).venomUse(); // Another way of downcast
       Snake snake=(Snake)animal2;
       snake.venomUse();
	}

}
