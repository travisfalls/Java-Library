package _02_Hello_World;

import _17_Encapsulation.ColtsPlayers;

public class HelloWorld
{
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		ColtsPlayers aCastonzo = new ColtsPlayers();
		
		aCastonzo.name = "Anthony Castonzo";
		aCastonzo.setNumber(74);
		System.out.println(aCastonzo.getNumber());
		
		
		
	}
	
}
