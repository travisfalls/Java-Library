package _03_numbers;

public class _04_challenge_story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A family is eating at a restaurant and has the following at their table:
		double tacos = 35.5;
		
		//Each family member takes some tacos:
		double dad = 11.5;
		double mom = 5.6;
		double child = 2.25;
		
		//The total amount of tacos eaten:
		double tacosEaten = dad + mom + child;
		
		//How many tacos were eaten?
		System.out.println("Tacos Eaten: " + tacosEaten);

		//How many tacos are left?
		double tacosLeft = tacos - tacosEaten;
		System.out.println("Tacos Left: " + tacosLeft);
		
		//New amount of tacos left
		tacos = tacosLeft;
				
		//The waiter comes by with more tacos!
		tacos = tacos + 20;
		
		//Another waiter accidentally brings more tacos...
		tacos += 10;
		System.out.println(tacos);
		
		//It's time for to go bags
		tacos = tacos / 2;
		System.out.println(tacos);
		
		//There's a special offer to send you home with 3 times what you have left.
		tacos = tacos * 3;
		System.out.println(tacos);
		
		//The mom wants to take more tacos home than the dad so she can share with a friend down the street. Dad can only keep 10 tacos.
		tacos = tacos % 10;
		System.out.println("Tacos for mom: " + tacos);
	}

}
