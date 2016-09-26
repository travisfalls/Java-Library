package _03_numbers;

public class _01_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    	//Exercise #1: Write variables for age, birthYear, gradYear, numSiblings.
        int myAge = 17;
        int birthYear = 1998;
        int gradYear = 2016;
        int numSiblings = 3;
        
        //Exercise #2: Who can remember the six numerical types? 
        
        byte by = 127; // 8 -bit signed -128 to 127 - useful for saving memory
        byte tooBig = -128;
		short sh = 32767; // 2^16, -32,768 to 32767, or +/- 0-32767, a.k.a. Int16
		int i = 0; // 32-bit signed number(-2^31 to 2^31) -> implicit conversion, too, a.k.a. Int32
		long l = 7; // -2^63 to 2^63 -> Use with range of values wider than those provided by int
        // The following can be both whole numbers and decimals:
		float f = 10.8f; // 32-bit signed number(-2^31 to 2^31) -> floating point integer Don't use with things that need to be super precise.
		double d = 7.80; // 64-bit signed number(-2^63 to 2^63) -> 64-bit decimal 
        
        //Each type has its advantages, but int and double will be used the most.
        int wholeNumber = 8;
        double decimal = 8.7;

        double pi = 3.14;
        
        
        //Exercise: Fix these.
        //int newNumber = 9.9;
        //byte data = 129;

        //You don't have to assign a value immediately
        int burgersEaten = 20;
        //However when you do assign the value, it must be the same type
        //burgersEaten = "five"    -Why won't this work?
        burgersEaten = 5;
        System.out.println(burgersEaten);
        
        
        int age = 31;
        byte fileSize = 100;
        long studentID = 123047083487L;
        double price = 9.99;
        float temperature = 98.6f;
        
        
        
        

        System.out.println(burgersEaten);
        
        burgersEaten = 25;
        System.out.println(burgersEaten);
        
        
        System.out.println(age);
        
        int tacosEaten;
        tacosEaten = 1;
        System.out.println(tacosEaten);
        
        tacosEaten = 2;
        System.out.println(tacosEaten);
		
	}

}





