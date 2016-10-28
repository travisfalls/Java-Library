package Practice;

import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {

		String[][] twoD = { { "Hi Travis what's up" }, { "What's" }, { "up?" } };

		String word = "";
		String phrase = "";

		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				word = twoD[i][j] + " ";
				phrase += word;
			}
			System.out.println(phrase);
		}
		
		

		// System.out.println(twoD[0][0]);
		// System.out.println(twoD[0][0] + " " + twoD[1][0]);
		// System.out.println(twoD[0][0] + " " + twoD[1][0] + " " + twoD[2][0]);

	}

}
