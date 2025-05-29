package com.AnimalHierarchy;


class Animal
{
	String name;
	String habitat;
	public Animal()
	{
		this.name=name;
		this.habitat=habitat;
	}
	
	public Animal(String name,String habitat)
	{
		this.name=name;
		this.habitat=habitat;
	}
	public  String displayHabitat() 
	{
		 return "Name:"+name+"Habitat :"+habitat;
	}
}

class Mammal extends Animal
{
	 boolean isWarmBlooded;
	 public Mammal (String name,String habitat, boolean isWarmBlooded )
		{
			this.name=name;
			this.habitat=habitat;
			this.isWarmBlooded=isWarmBlooded;
		}
	 public String displayMammalInfo()
	 {
		 return "isWarmBlooded" +isWarmBlooded;
	 }

}
class Bird  extends Animal
{
	 boolean canFly;
	 public Bird(String name,String habitat, boolean canFly )
		{
			this.name=name;
			this.habitat=habitat;
			this.canFly=canFly;
		}
	 public String displayBirdInfo()
	 {
		 return "canFly" +canFly;
	 }
}

class  Reptile extends Animal
{
	 boolean isColdBlooded;
	 public Reptile (String name,String habitat, boolean isColdBlooded )
		{
			this.name=name;
			this.habitat=habitat;
			this.isColdBlooded=isColdBlooded;
		}
	 public String displayReptileInfo()
	 {
		 return "isColdBlooded" +isColdBlooded;
	 }
}


public class AnimalHierarchy 
{
	public static  void  main(String [] args)
	{
	Animal mammal = new Mammal("Lion", "Savannah", true);
	System.out.println(mammal.displayHabitat()); 
	System.out.println(((Mammal) mammal).displayMammalInfo()); 
	Animal  bird  = new  Bird ("Eagle", "Forest", true);
	System.out.println(bird.displayHabitat()); 
	System.out.println((( Bird ) bird).displayBirdInfo()); 
	Animal reptile = new Reptile("Snake", "Desert", true);
	System.out.println(reptile.displayHabitat()); 
	System.out.println(((Reptile) reptile).displayReptileInfo()); 
	
	}
}
