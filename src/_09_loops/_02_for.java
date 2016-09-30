package _09_loops;

import java.util.Scanner;

public class _02_for {

	public static void main(String[] args) {
		

//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		//TODO create a for loop that increments by 5 and counts 0-100 by 5
		
		
//		for(int i = 0; i <= 100; i+=5) {
//			System.out.println(i);
//		}
		
		
//		int sum = 0;
//		for(int i = 0; i <= 10; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		//simple intrest over time - compound over 10 years
//		double balance = 5000;
//		double rate = 1.02; //2% interest
//		
//		for(int i = 0; i <= 10; i++){
//			System.out.println(balance);
//			balance *= rate;
//		}
		
//		String spaces = "There are spaces in this string";
//		int numSpaces = 0;
//		
//		for(int i = 0; i < spaces.length(); i++) {
//			if(spaces.charAt(i) != ' '){
//				continue;
//			} else {
//				numSpaces++;
//			}
//		}
//		System.out.println("There are " + numSpaces + " spaces in your string.");
		
		//Tobie
	  	for(int i = 0; i <=  10; i+=2){
	  		System.out.println(i);
	  	}
	  	
	  	//Danielle
	  	for(int i = 1; i <=  30; i++){
	  		System.out.println(i += 2);
	  	}
		  
			
	  	for(int i=0; i<=30;i+=3){
	  	
	  		System.out.println(i);
	  		if(i == 15){
	  			System.out.println("Midpoint");
	  		}else{
	  			System.out.println("");
	  		}
	  	}
	  	
	  		//Count to 100 by 7s
	  		//Leave out 28 & 49
	  	//Travis
	  	for(int i = 0; i <= 100; i+=7){
	  		if(i == 28 || i == 49){
	  			continue;
	  		}
	  		System.out.println(i);
	  	}
	  
	  	for(int i = 0; i <= 100; i+=7){
	  		if( i != 28 && i != 49){
	  			System.out.println(i);
	  		}
	  	}
	  	
	  	
	  	for(int i = 0; i <=100; i+=7){
				if(i != 28 && i != 49){
					System.out.println(i);
				}
			}
			
			
			
			//Count from 1-10.
			//Console: The number is (number).
			//Console: If it's five, print "I'm alive."
			
			//Steve
			for(int i=0; i<=10; i++){
			if (i==5){
				System.out.println("I'm Alive!");
			}else{
				System.out.println("The number is "+i);
			}
		}
		
		
		//FIZZBUZZ
		//1. Print from 1 to 100.
		//2. If i is a multiple of 3, print Fizz.
		//3. If i is a multiple of 5, print Buzz.
		//4. If i is a multiple of 3 & 5, print FizzBuzz.
		
		

			for(int i = 1; i <= 10; i++){
				if(i == 5){
					System.out.println("I am alive!");
				}else{
				System.out.println("The number is " + i);
				}
			}
			
			
			
			
			for(int i= 1; i <= 100; i++){
				if(i % 15 == 0){
					System.out.println("FizzBuzz");
				}else if(i % 3 == 0){
					System.out.println("Fizz");
				}else if(i % 5 == 0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
			}
		
		
		
		//Bronze Challenge
		//Create a loop that counts from 0 to 10 and prints even for even numbers
		
//		for(int i = 0; i <= 10; i+=2){
//			System.out.println(i);
//		}
		
		
		
		//Silver Challenge
		//Create a for loop that counts the amount of vowels in a string
//		String phrase = "How are you doing today?";
//		int numVowels = 0;
//		
//		for(int i = 0; i < phrase.length(); i++) {
//			if((phrase.charAt(i) != 'a') && (phrase.charAt(i) != 'e') && (phrase.charAt(i) != 'i') && (phrase.charAt(i) != 'I') && (phrase.charAt(i) != 'o' && (phrase.charAt(i) != 'u'))){
//				continue;
//			} else {
//				numVowels++;
//			}
//		}
//		System.out.println(numVowels);
		
		
		
		//Gold Challenge
		//Create a for loop that counts the amount of vowels in a string given by a user req. input.
		
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.println("What's on your mind?");
		
		String answer;
		int numVowels = 0;
		
		answer = inputInfo.nextLine();
		
		
		for(int i = 0; i < answer.length(); i++) {
			if((answer.charAt(i) != 'a') && (answer.charAt(i) != 'A') && (answer.charAt(i) != 'e') && (answer.charAt(i) != 'E') && (answer.charAt(i) != 'i') && (answer.charAt(i) != 'I') && (answer.charAt(i) != 'o') && (answer.charAt(i) != 'O') && (answer.charAt(i) != 'u') && (answer.charAt(i) != 'U')){
				continue;
			} else {
				numVowels++;
			}
		}
		System.out.println("Your sentence has " + numVowels + " vowels in it.");
		
	}

}
