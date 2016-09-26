package _04_Strings;

public class _03_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Through examples, explain the char type.
		
		// \" will add double quotation marks
		System.out.println("Hello \"Jim\", How are you?");
		
		// \t will add a tab
		System.out.println("\t Hello \"Jim\", How are you?"); 
		
		// \\ will add a \
		System.out.println("Hello Jim, \\How are you?");
	
		// \' will add single quotation marks
		System.out.println("Hello \'Jim\', How are you?");
		
		// \u00A5 will add a Yen symbol
		System.out.println("\u00A5 Hello Jim, How are you?");
		
		char yen = '\u00A5';
		System.out.println(yen);
		
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray);
		
		String charArry = "abcde";
		System.out.println(charArry);
		
		char dollar = '\u0024';
		System.out.println(dollar);
	}

}
