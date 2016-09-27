package _07_conditionals;

import java.util.Scanner;

public class _03_else_if {

	public static void main(String[] args) {
		
		//Bronze Challenge
//		String firstName = "Haddie";
//		String lastName = "Falls";
//		
//		if(name.equals("Travis")){
//			System.out.println("Hello Travis");
//		} else if(name.equalsIgnoreCase("Kady")){
//			System.out.println("Hey Kady!");
//		} else if(name.equals("Haddie")){
//			System.out.println("I love that name!");
//		} else {
//			System.out.println("New phone, who this?");
//		}
		
		
		//Silver Challenge
		
		
//		if(firstName.equals("Travis")&&lastName.equals("Falls")){
//			System.out.println("How are you doing?");
//		} else if (firstName.equals("Travis")||firstName.equals("Kady")){
//			System.out.println("Hey there!");
//		} else {
//			System.out.println("Sorry, who's this?");
//		}
		
		
		//Gold Challenge
		
		Scanner inputInfo = new Scanner(System.in);
		
		int percentage;
		
		System.out.println("Please enter your percentage: ");
		
		percentage = inputInfo.nextInt();{
			if(percentage >= 90){
				System.out.println("Your grade is: A");
			} else if(percentage >= 80){
				System.out.println("Your grade is: B");
			} else if(percentage >= 70){
				System.out.println("Your grade is: C");
			} else if(percentage >= 60){
				System.out.println("Your grade is: D");
			} else {
				System.out.println("Your grade is: F");
			}
		}
		

	}

}
