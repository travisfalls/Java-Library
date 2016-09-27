package _07_conditionals;

public class _04_nested_if {

	public static void main(String[] args) {
		
		
		boolean pizzaForLunch = true;
		boolean tacosForDinner = false;
		
		if(pizzaForLunch){
			if(tacosForDinner){
				System.out.println("What a great day!");
			} else
				System.out.println("What are we going to eat?");
		}
		
		
		

	}

}
