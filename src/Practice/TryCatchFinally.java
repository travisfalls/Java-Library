package Practice;

import java.util.ArrayList;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String[] candyBar = new String[3];
		
		candyBar[0] = "Snickers";
		candyBar[1] = "Reeses";
		
		try{
			System.out.println(candyBar[2]);
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		} finally {
			candyBar[2] = "KitKat";
			System.out.println(candyBar[2]);
		}

	}

}
