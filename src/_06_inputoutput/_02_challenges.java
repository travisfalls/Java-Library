package _06_inputoutput;

import java.util.Scanner;

public class _02_challenges {

	public static void main(String[] args) {
		
		
		//Bronze Challenge
		String name;
		String city;
		int age;
		
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		name = inputInfo.nextLine();
		
		System.out.println("Enter your city");
		
		city = inputInfo.nextLine();
		
		System.out.println("Enter your age");
		
		age = inputInfo.nextInt();
		
		
		//Silver Challenge
		System.out.println("Hey " + name + ", you live in " + city + " and you are " + age + " years old.");
		
		
		
		//Gold Challenge		
		
		
	}

}
