package _12_Movies;

public class Movie {

	//Properties
	String genre;
	String rating;
//	String[] actors;
//	String[] actresses;
	int movieLength;
	int boxOfficeGross;
	boolean inRedBox;
	boolean onNetflix;
	
	
	//Constructor
	public Movie(String genre, String rating, int movieLength, boolean inRedBox, boolean onNetflix) {
		this.genre = genre;
		this.rating = rating;
		this.movieLength = movieLength;
		this.inRedBox = inRedBox;
		this.onNetflix = onNetflix;
	}
	
	
	//Methods
	public void getMovieLength() {
		System.out.println(movieLength);
	}
	
	public void getMovieGenre() {
		System.out.println(genre);
	}
	
	
	public void rentalCheck() {
			if((inRedBox == true) || (onNetflix == true)) {
				if((inRedBox == true) && (onNetflix == false)) {
					System.out.println("This movie is available on Redbox.");
				} else {
					System.out.println("This movie is available on Netflix.");
				}
			} else {
				System.out.println("Have you checked Amazon?");
			}
		}
	
	
	
	
	
	//Create a new method that prints boxOfficeGross
	
	public void getBoxOfficeGross() {
		System.out.println("This movie made \u0024" + boxOfficeGross +" at the box office.");
	}
	
	
	
	
	
	
}
