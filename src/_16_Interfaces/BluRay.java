package _16_Interfaces;

public class BluRay implements IFunctions {
	
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
		System.out.println("Skip to next scene.");
	}

	@Override
	public void menu() {
		System.out.println("Go to BluRay menu.");	
	}

	@Override
	public void pause() {
		System.out.println("Pause movie.");
	}

	
	public void highDef() {
		System.out.println("This movie is in high definition.");
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
	}

		
	
	
	
	
}
