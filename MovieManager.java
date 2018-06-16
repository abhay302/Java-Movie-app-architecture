import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class MovieManager {
    private HashSet<Movie> set;
    
    public MovieManager() {
        initializeSet();
    }

    public void initializeSet() {
        set = new HashSet<>();
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-YYYY");
        try {
            set.add(new Movie("Mukkabaaz", 2018, "Hindi", "Drama", format.parse("12-01-2018"), 1));
            set.add(new Movie("Padmaavat", 2018, "Hindi", "Period drama", format.parse("25-01-2018"), 1));
            set.add(new Movie("Baahubali: The Conclusion", 2017, "Telgu/Tamil", "Epic/Historical fiction",
					format.parse("28-01-2017"), 0));
            set.add(new Movie("Black Panther", 2018, "English", "Fantasy/Science fiction film",
					format.parse("16-02-2018"), 2));
            set.add(new Movie("Fifty Shades of Grey", 2015, "English", "Drama/Thriller", format.parse("20-02-2015"), 2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
	
	
    public void showAllMovies() {
        for(Movie movie: set)
            System.out.println(movie);
    }
	
	
    public void showSpecificMovie(int type) {
        for(Movie movie: set) {
            if(movie.getType()==type)
                System.out.println(movie);
        }
    }
	
    public void isBlockBuster(String name) {
        boolean flag=false;
        for(Movie movie: set) {
            if(movie.getName().equals(name)) { 
                System.out.println(movie.getBlockBuster());
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Invalid movie name");
    }

}
