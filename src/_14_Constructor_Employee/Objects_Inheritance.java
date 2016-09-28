package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		

		
		Employee travis = new Employee("Travis", 100000.00, 2016, 1985);
		Manager m3 = new Manager("Tim", 50000.55, 2016, 1945, "Design");
		VicePresident vp2 = new VicePresident("Travis", 1000000.25, 2014, 1985, "Marketing");
		
		travis.speak();
		m3.speak();
		vp2.speak();
		
		
		
		

	}

}
