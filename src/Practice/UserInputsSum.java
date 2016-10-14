package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class UserInputsSum {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Collection<Integer> numbers = new ArrayList<>();
		int userNums = 0;
		int sum = 0;

		System.out.println("Please enter in as many numbers as you would like. Enter any none number to exit.");

		while (true) {
			try {
				userNums = userInput.nextInt();
			} catch (Exception e) {

				break;
			}

			numbers.add(userNums);
		}

		for (int n : numbers) {
			sum += n;
		}

		System.out.println("The sum of your numbers is: " + sum);

		userInput.close();

	}

}
