package _07_conditionals;

import java.util.Scanner;

public class _02_if_else {

	public static void main(String[] args) {
		
		
		//Bronze Challenge
		boolean tired = false;
		
		if (tired == false){
			System.out.println("Let's go for a run.");
		} else {
			System.out.println("Go to bed.");
		}
		
		boolean hungry = true;
		
		if(hungry == false){
			System.out.println("Are you sure you aren't hungry?");
		} else {
			System.out.println("Grab a Snickers! You always get cranky when you're hungry");
		}

		
		//Silver Challenge
		
		Scanner inputInfo = new Scanner(System.in);
		
		String userInput;
		String password = "password1234";
		
		System.out.println("Please enter your password");
		userInput = inputInfo.next();{
			if (userInput.equals(password)) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Please try again.");
			}
			
			
		//Gold Challenge
		double hourlyPay;
		double hoursWorked;
		
		System.out.println("Enter your hourly pay: ");
		hourlyPay = inputInfo.nextDouble();
		
		System.out.println("Enter the number of hours you worked: ");
		hoursWorked = inputInfo.nextDouble();
		
		System.out.println("You will earn \u0024" + (hourlyPay * hoursWorked) + " on your check.");
			
		}
		
	}

}
