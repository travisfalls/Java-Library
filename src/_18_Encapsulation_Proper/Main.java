package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {
		
		Player travis = new Player("Travis", "Awesome", 255000, 100);
		
		Player kady = new Player("Kady", "Great",99000, 200);
		
		Player paul = new Player("Paul", "Straight Up Boss", 255500000, 10);
		
		
		travis.getName();
		
		System.out.println(travis.getName());
		System.out.println(travis.getStatus());
		System.out.println(travis.getHighScore());
		System.out.println(travis.getHp());
		
		
		kady.setNewPlayerName("Kady Falls");
		kady.getName();
		System.out.println(kady.getName());
		
		kady.setNewStatus("Totally Awesome");
		kady.getStatus();
		
	}

}
