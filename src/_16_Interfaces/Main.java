package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		
		CD switchfoot = new CD();
		DVD darkKnight = new DVD();
		BluRay avengers = new BluRay();
		
		
		
		switchfoot.play();
		switchfoot.stop();
		switchfoot.menu();
		switchfoot.skip();
		switchfoot.pause();
		switchfoot.turnUpToEleven(11);
		switchfoot.getTitle("Vice Verses");
		
		
		darkKnight.play();
		darkKnight.stop();
		darkKnight.menu();
		darkKnight.skip();
		darkKnight.pause();
		darkKnight.bootleg();
		darkKnight.getTitle("Batman!");
		
		
		avengers.play();
		avengers.stop();
		avengers.menu();
		avengers.skip();
		avengers.pause();
		avengers.highDef();
		avengers.getTitle("The first one was better");

	}

}
