package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{

	
	public boolean jumps;
	
	@Override
	public void speak() {
		System.out.println("Something new.");
	}
	
	public void eats() {
		System.out.println("Throw another shrimp on the barbie!");
	}
	
	
}
