package _90_Recursion;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		Main thing = new Main();
		
		BigDecimal myNum = new BigDecimal(65);
		
		System.out.println(thing.factorial(myNum));

	}
	
	public static BigDecimal factorial(BigDecimal n){
    	if(n.intValue() == 1){
    		return BigDecimal.ONE;
    	} else {
    		BigDecimal result = (n.multiply(factorial(n.subtract(BigDecimal.ONE))));
    		return result;
    	}
    }

}
