package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{

	
	//Properties
	public boolean hasWhiskers;
	
	
	
	
	@Override
	public void speak() {
		System.out.println("Hi, I'm Mickey!");
	}
	
	public void eats() {
		System.out.println("Chese for me please.");
	}
	
	
}
