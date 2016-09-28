package _14_Constructor_Employee;

public class Employee {

	
	//Properties
	private String firstName;
	private String lastName;
	String position;
	String address;
	String city;
	String email;
	
	int zip;
	int age;
	int yearsEmployed;
	int phone;
	int startYear;
	int birthYear;
	
	double salary;
	
	boolean male;
	
	
	//Constructor
	//A constructor is a method that always has the same name as the Class itself - it builds
	//our instances or objects of that class type
	Employee(String name, double salary, int startYear, int birthYear) {
		this.firstName = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
	}
	
	
	//Methods
	public void getFirstName() {
	System.out.println();
	}
	
	public void speak() {
		System.out.println("I am an employee.");
	}
	
	
	
	
	
	
	
	
	
}
