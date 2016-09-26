package _05_Booleans;

public class _02_operators_relational {

	public static void main(String[] args) {
		
		int bankAccount = 1000000;
		
		if (bankAccount >= 1000000) {
			System.out.println("Treat Yo' Self");
			
		} else if (bankAccount >= 100000) {
			
			System.out.println("You're doing well!");
			
		} else if (bankAccount >= 10000) {
			
			System.out.println("Keep working.");
			
		} else {
			
			System.out.println("You're not broke...");
		}
		
		
		String password = "notpassword";
		
		if (password.equals("password")) {
			System.out.println("That is correct!");
		} else {
			System.out.println("Please try again!");
		}
		
	}

}
