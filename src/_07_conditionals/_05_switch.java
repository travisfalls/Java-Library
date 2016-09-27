package _07_conditionals;



public class _05_switch {

	public static void main(String[] args) {
		


	
	int numPiesEaten = 10;
	String response;

	
	switch(numPiesEaten){
		case 0:
			response = "You should have some pie.";
			break;
		case 5:
			response = "That's impressive.";
			break;
		case 10:
			response = "Woah, slow down.";
			break;
		case 20:
			response = "How can you even move?";
			break;
		default:
			response = "Pie is so good!";
	}
	
	System.out.println(response);
	
	
	}

}
