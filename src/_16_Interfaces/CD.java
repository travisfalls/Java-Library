package _16_Interfaces;

public class CD implements IFunctions{
	
	String title;

	@Override
	public void play() {
		System.out.println("CD is now playing.");
	}

	@Override
	public void stop() {
		System.out.println("CD is stopped.");
	}

	@Override
	public void skip() {
		System.out.println("Skip to next song.");
	}

	@Override
	public void menu() {
		System.out.println("Show CD menu.");
	}

	@Override
	public void pause() {
		System.out.println("Pause song.");
	}
	
	public void turnUpToEleven(int i){
		System.out.println(i);
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
		
	}
	
	

}
