package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Travis");
		names.add("Kady");
		names.add("Haddie");
		
		System.out.println("Currently the array list has the following names: " + names);
		
		names.add(0, "Felicity");
		
		System.out.println("Now our array list has these names: " + names);

		names.addAll(Arrays.asList("Gemma", "Hayden", "Grayson"));
		
		System.out.println("Our list is now even bigger: " + names);
		
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		ages.add(31);
		ages.add(29);
		ages.add(2);
		
		System.out.println("Our ages are: " + ages);
		
		ArrayList<Double> weights = new ArrayList<Double>();
		
		weights.add(120.6);
		weights.add(190.3);
		weights.add(28.9);
		
		System.out.println("These are the doubles we added to our arraylist: " + weights);
		
		
	}

}
