package _04_Strings;

public class _02_challenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Challenges
		
		//Bronze
//		String first = "Travis";
//		String middle = "Martin";
//		String last = "Falls";
//		String space = " ";
//		String fullName = first + space + middle + space + last;
//		
//		String allCaps = fullName.toUpperCase();
//		
//		System.out.println(allCaps);
		
		//Silver
//		String phrase = "Soda Can";
//		System.out.println(phrase.substring(0,4));
//		System.out.println(phrase.substring(5,8));
		
		//Gold
		String longPhrase = "sally sells seashells";
		int numS = 0;
		
		for(int i = 0; i < longPhrase.length(); i++){
			if((longPhrase.charAt(i) != 's') && (longPhrase.charAt(i) != 'S')){
				continue;
			} else {
				numS++;
			}
		}
		System.out.println("There are " + numS + " S\'s in this phrase.");
		
		
	}

}
