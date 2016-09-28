package _11_Class_Properties;

import java.lang.reflect.Array;

public class BasicObjects {

	public static void main(String[] args) {
		
		//travisDreamCar - is the object or instance of the Car class.
		
		Car paulsDreamCar = new Car();
		
		paulsDreamCar.make = "Tesla";
		paulsDreamCar.model = "Model 3";
		paulsDreamCar.color = "Black";
		paulsDreamCar.isFast = true;
		paulsDreamCar.isElectric = true;
		paulsDreamCar.milesPerCharge = 300;
		
		
		//Make another car that is your dream car and add 8 properties.
		
		Car travisDreamCar = new Car();
		
		travisDreamCar.make = "Tesla";
		travisDreamCar.model = "Model S";
		travisDreamCar.color = "Charcoal";
		travisDreamCar.leatherSeats = true;
		travisDreamCar.isElectric = true;
		travisDreamCar.milesPerCharge = 250.72;
		travisDreamCar.isPopularAmongstMillenials = false;
		travisDreamCar.marketSegment = "Luxury";
		
		System.out.println();
		
		
		
		
		
		
		

	}

}
