package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		

		Animal george = new Animal();
		george.name = "George the Animal";
		george.printName();
		george.speak();
		george.eats();
		
		Bear barney = new Bear();
		barney.name = "Barney";
		barney.isHibernating = true;
		barney.printName();
		barney.speak();
		barney.eats();
		
		Kangaroo roo = new Kangaroo();
		roo.name = "Roo";
		roo.jumps = true;
		roo.printName();
		roo.isWarmBlooded = true;
		roo.isReptile();
		roo.speak();
		roo.eats();
		
		Mouse mickey = new Mouse();
		mickey.name = "Mickey";
		mickey.hasWhiskers = true;
		mickey.eats();
		

		
		
	}

}
