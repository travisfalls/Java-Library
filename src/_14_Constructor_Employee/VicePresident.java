package _14_Constructor_Employee;

public class VicePresident extends Employee {

	//Properties
	public String department;
	
	
	VicePresident(String name, double salary, int startYear, int birthYear, String department) {
		super(name, salary, startYear, birthYear);
		this.department = department;
	}

	
	@Override
	public void speak() {
		System.out.println("I am a Vice President.");
	}
	
	
	
	
}
