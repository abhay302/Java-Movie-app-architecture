package Application;

import java.text.DateFormat;
import java.util.Date;

// Type specifies the type of a particular movie
enum Type {
    TOLLYWOOD, BOLLYWOOD, HOLLYWOOD;
}

/**
 * Movie is the most important Entity of the application. A movie will have
 * name, year, language, genre and release date associated with it. A movie can
 * be either TollyWood, BollyWood or HollyWood. The average cost of production
 * will depend on the type of the movie.
 */
class Movie {

    private String name;
    private int year;
    private String language;
    private String genre;
    private Date releaseDate;
    private Type type;
    
    // Specify whether the movie is block buster or not
    private boolean blockBuster;

    /*
     * Specify whether the movie has been already checked for being a block buster
     * or not. Initially assigned as false indicating that this movie is not yet
     * checked for being a block buster
     */
    private boolean accessed = false;

    // Constructor to initialize the movie object
    public Movie(String name, int year, String language, String genre, Date releaseDate, Type type) {
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.type = type;
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

    public boolean isBlockBuster() {
        return blockBuster;
    }

    public void setBlockBuster(boolean blockBuster) {
        this.blockBuster = blockBuster;
    }

    public boolean isAccessed() {
        return accessed;
    }

    public void setAccessed(boolean accessed) {
        this.accessed = accessed;
    }

    public Type getType() {
        return type;
    }

}
