package Practice;

import java.lang.Math;

public class CheckPrime {
	public static void main(String[] args) {
		
		int n = 13;
		int sqrt = (int) Math.sqrt(n) + 1;
		boolean isPrime = true;
		
		for(int i = 2; i < sqrt; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			} 

		 }
		
		
		if(isPrime == true){
			System.out.println(n + " is prime.");
		} else {
			System.out.println(n + " is not prime.");
		}
		
	}
}	
	


