import java.util.Scanner;

public class Movie {

	private String movieName;
	private double IMDBRating;

	Scanner sc = new Scanner(System.in);

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	IMDB r = new IMDB();

	public double getIMDBRating() {
		return IMDBRating;
	}

	public void setIMDBRating(double rating) {
		r.countRating();
		IMDBRating = r.calculateAverageRating();
		IMDBRating = rating;
	}

	public void display() {

// IMDBRating r = new IMDBRating();
// setMovieName("3 Idiots");
// System.out.println("Movie Name : "+getMovieName());
// r.countRating();
// System.out.println("IMDB Rating for "+getMovieName()+" : "+r.calculateAverageRating());

		setMovieName("3 Idiots");
		System.out.println("Movie Name : " + getMovieName());
		System.out.println("Enter your rating from 1 to 5 for Movie ");
		int rating = sc.nextInt();
		setIMDBRating(rating);
		System.out.println("IMDB Rating for " + getMovieName() + " : " + getIMDBRating());

	}

}