package i2.main;

import java.util.ArrayList;
import java.util.List;


public class Movie {
public List<Movie> movieList = new ArrayList<>();

public void setMovies(Movie movie) {
getMovies().add(movie);
}

public List<Movie> getMovies() {
return this.movieList;
}

public void rateMovie(String title, int rating) {
getMovies().forEach(movie -> {
if (movie.getTitle().equals(title)) {
movie.setRating(rating);
}

});
}

private void setRating(int rating) {
	// TODO Auto-generated method stub
	
}

private Object getTitle() {
	// TODO Auto-generated method stub
	return null;
}

public int pickFavorite() {
int maxRating = 0;
for (Movie movie : getMovies()) {
if (movie.getRating() > maxRating) {
maxRating = movie.getRating();
}
}
return maxRating;
}

private int getRating() {
	// TODO Auto-generated method stub
	return 0;
}
}

