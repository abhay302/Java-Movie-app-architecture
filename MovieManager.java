package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The MovieManager will hold movies i.e. maintains ArrayList for the movie
 * objects. It also calculates the average cost of production depending upon the
 * type of movie. It provides various functionalities such as: 1. Get all movies
 * - give a list of all Movies 2. Get all movies of a type- give a list of all
 * movies of specified type 3. Is a movie block buster? - give true or false
 * randomly for the first time. From second time onwards it should give the same
 * result as first time.
 */
class MovieManager {

    private ArrayList<Movie> list;

    public MovieManager() {
        initializeList();
    }

    // This function initializes the ArrayList of movies
    public void initializeList() {
        list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
        try {
            list.add(new Movie("Mukkabaaz", 2018, "Hindi", "Drama", format.parse("12-01-2018"), Type.BOLLYWOOD));
            list.add(new Movie("Padmaavat", 2018, "Hindi", "Period drama", format.parse("25-01-2018"), Type.BOLLYWOOD));
            list.add(new Movie("Baahubali: The Conclusion", 2017, "Telgu/Tamil", "Epic/Historical fiction",
                    format.parse("28-01-2017"), Type.TOLLYWOOD));
            list.add(new Movie("Black Panther", 2018, "English", "Fantasy/Science fiction film",
                    format.parse("16-02-2018"), Type.HOLLYWOOD));
            list.add(new Movie("Fifty Shades of Grey", 2015, "English", "Drama/Thriller", format.parse("20-02-2015"),
                    Type.HOLLYWOOD));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // returns the average cost of production for a particular type of movie
    public int getAvgCostOfProduction(Type type) {
        if (type.equals(Type.TOLLYWOOD)) {
            return 100000000;
        }
        if (type.equals(Type.BOLLYWOOD)) {
            return 500000000;
        }
        if (type.equals(Type.HOLLYWOOD)) {
            return 1000000000;
        }
        return 0;
    }

    // returns a list of all Movies
    public List<Movie> getAllMovies() {
        return list;
    }

    // returns a list of all movies of specified type
    public List<Movie> getSpecificMovie(Type type) {
        ArrayList<Movie> arr = new ArrayList<>();
        for (Movie movie : list) {
            if (movie.getType().equals(type)) {
                arr.add(movie);
            }
        }
        return arr;
    }

    /*
     * returns whether a movie block buster or not. give true or false randomly for
     * the first time. From second time onwards it gives the same result as first
     * time.
     */
    public boolean isMovieBlockBuster(Movie movie) {
        if (!movie.isAccessed()) { // Checks whether isMovieBlockBuster() has already been called on this object
            Random randomGenerator = new Random();
            movie.setAccessed(true);
            movie.setBlockBuster(randomGenerator.nextBoolean());
        }
        return movie.isBlockBuster();
    }

    /*
     * public static void main(String... args) { MovieManager manager = new
     * MovieManager(); //System.out.println(manager.getAllMovies());
     * System.out.println(manager.getSpecificMovie(Type.BOLLYWOOD)); }
     */

}
