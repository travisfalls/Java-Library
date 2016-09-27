package _06_inputoutput;

import java.util.Scanner;
public class _01_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		String birthCity;
		int age;
		
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.println("Enter your name below");
		
		name = inputInfo.nextLine();
		
		System.out.println("Enter your birth city");
		
		birthCity = inputInfo.nextLine();
		
		System.out.println("Enter your age");
		
		age = inputInfo.nextInt();
		
		System.out.println("Hi, " + name + " you are " + age + " and you were born in " + birthCity);
		
		
		inputInfo.close();
		
		
	}

}
