package _15_Inheritance_Polymorphism;

import java.util.Scanner;

public class Animal {
	
	Scanner inputInfo = new Scanner(System.in);

	//Properties
	public int numbLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	public String eats;
	
	
	
	//Methods
	public void printName(){
		System.out.println("My name is " + name);
	}
	
	public void isReptile(){
		if(isWarmBlooded == true) {
			System.out.println(name + " is not a reptile.");
		} else {
			System.out.println(name + " could be a reptile.");
		}	
	}	

	public void speak(){
		System.out.println("I am an animal.");
	}
	
	public void eats(){
		System.out.println(name + " likes to each pizza.");
	}
		
		
}
