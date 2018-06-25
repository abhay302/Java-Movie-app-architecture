package Application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

// Type specifies the type of a particular movie
enum Type {
    TOLLYWOOD, BOLLYWOOD, HOLLYWOOD;
}

/**
 * Movie is the most important Entity of the application. A movie will have
 * name, year, language, genre and release date associated with it. A movie can
 * be either TollyWood, BollyWood or HollyWood. The average cost of production
 * will depend on the type of the movie.
 * 
 * The Movie class will hold movies i.e. maintains ArrayList for the movie
 * objects. It also calculates the average cost of production depending upon the
 * type of movie. It provides various functionalities such as: 1. Get all movies
 * - give a list of all Movies 2. Get all movies of a type- give a list of all
 * movies of specified type 3. Is a movie block buster? - give true or false
 * randomly for the first time. From second time onwards it should give the same
 * result as first time.
 */
class Movie {

    private String name;
    private int year;
    private String language;
    private String genre;
    private Date releaseDate;
    private Type type;

    // The list stores the movie objects
    private static List<Movie> list = new ArrayList<>();

    // Specify whether the movie is block buster or not
    private boolean isblockBuster;

    // This function initializes the ArrayList of movies
    static {
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

    // Constructor to initialize the movie object
    public Movie(String name, int year, String language, String genre, Date releaseDate, Type type) {
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.type = type;

        list.add(this);
        Random randomGenerator = new Random();

        isblockBuster = randomGenerator.nextBoolean();
    }

    // Override toString() method to display the content of the movie object
    @Override
    public String toString() {
        String s = "";
        s += "\nName:\t\t\t\t" + name + "\n";
        s += "Year:\t\t\t\t" + year + "\n";
        s += "Language:\t\t\t" + language + "\n";
        s += "Genre:\t\t\t\t" + genre + "\n";
        s += "Release Date:\t\t\t" + DateFormat.getDateInstance(DateFormat.MEDIUM).format(releaseDate) + "\n";
        return s;
    }

    // returns a list of all Movies
    public static List<Movie> getAllMovies() {
        return list;
    }

    // returns a list of all movies of specified type
    public static List<Movie> getSpecificMovie(Type type) {
        ArrayList<Movie> arr = new ArrayList<>();
        for (Movie movie : list) {
            if (movie.getType().equals(type)) {
                arr.add(movie);
            }
        }
        return arr;
    }

    // returns the average cost of production for a particular type of movie
    public int getAvgCostOfProduction(Type type) {
        switch (type) {
        case TOLLYWOOD:
            return 100000000;
        case BOLLYWOOD:
            return 500000000;
        case HOLLYWOOD:
            return 1000000000;
        default:
            return 0;
        }
    }

    /*
     * returns whether a movie block buster or not. give true or false randomly for
     * the first time. From second time onwards it gives the same result as first
     * time.
     */
    public boolean isBlockBuster() {
        return isblockBuster;
    }

    public Type getType() {
        return type;
    }

}
