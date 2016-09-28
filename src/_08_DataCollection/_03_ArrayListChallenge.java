package _08_DataCollection;

import java.util.ArrayList;

public class _03_ArrayListChallenge {

	public static void main(String[] args) {
		

		//Bronze Challenge
		//After adding numbers 1 - 10 to an array list, print out the size of the list
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++){
			numbers.add(i);
		}
		System.out.println(numbers.size());
		
		
		
		//Silver Challenge
		//Add the numbers in the array list together and place that into a variable
		
//		int sum = 0;
//		for(int i = 0; i <= 15; i++){
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		//Gold Challenge
		//1) Add numbers in array 1 - 10.
		//2) Print out the array 
		//3) Print out the total of the array 
		//4) Print out the equation the for loop goes through to add each element together

		//i.e this should be your output:
		//0 + 1 = 1
		//1 + 2 = 3
		//3 + 3 = 6
		//6 + 4 = 10
		//10 + 5 = 15
		//15 + 6 = 21
		//21 + 7 = 28
		//28 + 8 = 36
		//36 + 9 = 45
		//45 + 10 = 55
		
		Integer sum = 0;
		for(Integer i = 1; i <=10; i++){
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		System.out.println();
		
		

	}

}
