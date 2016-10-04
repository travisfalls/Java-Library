package _16_Interfaces;

public class DVD implements IFunctions{
	
	String title;

	@Override
	public void play() {
		System.out.println("Play movie.");
	}

	@Override
	public void stop() {
		System.out.println("Stop movie.");
	}

	@Override
	public void skip() {
		System.out.println("Skip to the next scene.");
	}

	@Override
	public void menu() {
		System.out.println("Go to DVD menu.");
	}

	@Override
	public void pause() {
		System.out.println("Pause the movie.");
	}
	
	public void bootleg() {
		System.out.println("This DVD player will play bootleg DVDs");
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
		
	}

}
