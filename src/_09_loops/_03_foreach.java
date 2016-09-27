package _09_loops;

public class _03_foreach {

	public static void main(String[] args) {
		
		
		//Create an array of the best comedians of all time.
		
		String[] comedians = {"Jim Gaffigan", "Chris Farley", "Demetri Martin", "Louis CK"};
		
		for(String comedian : comedians) {
			System.out.println(comedian);
		}
		
		String[] greatestBossesOfAllTime = {"Jenn Aikins", "Bob Alcon", "Robin Holer", "Kady Falls"};
		
		for(String greatestBossOfAllTime : greatestBossesOfAllTime) {
			System.out.println(greatestBossOfAllTime);
		}
		
		
		
		String s = "Hello";
		for(char ch : s.toCharArray()){
			System.out.println(ch);
		}
		
		

	}

}
