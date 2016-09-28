package _12_Movies;

public class BasicObjects {

	public static void main(String[] args) {
		

		Movie tommyBoy = new Movie("Comedy", "PG-13", 97, false, false);
		
		//TODO figure out what is causing the error with these arrays.
//		tommyBoy.actors[0] = "Chris Farley";
//		tommyBoy.actors[1] = "David Spade";
//		tommyBoy.actors[2] = "Dan Aykroyd";
//		tommyBoy.actresses[0] = "Bo Derek";
//		tommyBoy.actresses[1] = "Julie Warner";
		tommyBoy.genre = "Comedy";
		tommyBoy.inRedBox = false;
		tommyBoy.movieLength = 97;
		tommyBoy.boxOfficeGross = 32700000;
		
		Movie avengers = new Movie("Action", "PG-13", 143, true, false);
		avengers.movieLength = 143;
		avengers.boxOfficeGross = 623279547;
		
		Movie civilWar = new Movie("Action", "PG-13", 152, false, true);
		
//		tommyBoy.getMovieLength();
//		tommyBoy.getMovieGenre();
//		
//		avengers.getMovieLength();
//		
//
//		tommyBoy.getBoxOfficeGross();
//		avengers.getBoxOfficeGross();
//		
//		
//		System.out.println(tommyBoy.inRedBox);
//		System.out.println(avengers.movieLength);
		
		tommyBoy.rentalCheck();
		avengers.rentalCheck();
		civilWar.rentalCheck();
		
	}

}
