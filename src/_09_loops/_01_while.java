package _09_loops;

public class _01_while {

	public static void main(String[] args) {
		

//		int count = 1;
//		
//		while (count < 11) {
//			System.out.println("Count is: " + count);
//			count++;
//		}
		
		
//		int newCount = 2;
//		
//		while (newCount <= 23) {
//			System.out.println("New Count is " + newCount);
//			newCount += 3;
//		}
//		
//		int newNum = 100;
//		
//		while(newNum >= 0) {
//			System.out.println(newNum);
//			newNum -= 5;
//		}
		
		
		
		//Bronze Challenge
		//Use a while loop to count backwards
//		int num = 25;
//		
//		while (num > 1) {
//			System.out.println("Counting Backwards: " + num);
//			num--;
//		}
		
		
		//Silver Challenge
		//Use a while loop that lists out each letter of your name
		
		String name = "Travis";
		int letters = 0;

		while(letters <= 5){
			System.out.println(name.charAt(letters));
			letters++;
		}
		
		
		//Gold Challenge
		//Create a while loop that prints your name backwards.
		
		int newLetters = 5;
		
		while(newLetters >= 0){
			System.out.println(name.charAt(newLetters));
			newLetters--;
		}
		
		
		
		

	}

}
