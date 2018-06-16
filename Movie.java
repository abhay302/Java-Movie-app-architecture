import java.text.DateFormat;
import java.util.Date;

/**
 * @author abhay
 *
 */
enum Type {
    TOLLYWOOD, BOLLYWOOD, HOLLYWOOD;
}

class Movie {

    private String name;
    private int year;
    private String language;
    private String genre;
    private Date releaseDate;
    private int type;
    private int blockBuster;
    private String dish;

    public Movie(String name, int year, String language, String genre, Date releaseDate, int type) {
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.type = type;
        setDish();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Movie && ((Movie)o).name.equals(this.name))
            return true;
        else
            return false;
    }

	@Override
    public int hashCode() {
        return this.type;
    }
	
    @Override
    public String toString() {
        String s="";
        s+= "\nName:\t\t\t" + name + "\n";
        s+= "Year:\t\t\t" + year + "\n";
        s+= "Language:\t\t" + language + "\n";
        s+= "Genre:\t\t\t" + genre + "\n";
        s+= "Release Date:\t\t" + DateFormat.getDateInstance(DateFormat.MEDIUM).format(releaseDate) + "\n";
        s+= "Type:\t\t\t" + showType(type) + "\n";
        s+= "Free Dish:\t\t" + dish;
        return s;
    }
	
    public String showType(int type) {
        if(type==0)
            return Type.TOLLYWOOD.toString();
        else if(type==1)
            return Type.BOLLYWOOD.toString();
        else if(type==2)
            return Type.HOLLYWOOD.toString();
        else
            return null;
    }
	
    public void setDish() {
        if(type==0)
            dish="Dosa";
        else if(type==1)
            dish="Dal Makhni";
        else if(type==2)
            dish="Pepper Steak";
    }

    public String getName() {
        return name;
    }
	
    public int getType() {
        return type;
    }
	
    public String getBlockBuster() {
        if(blockBuster==0) {
            int temp=(int)(Math.random()*2);
            if(temp==0)
                blockBuster=-1;
            else
            	blockBuster=1;
        }
        if(blockBuster==1)
            return "Movie is a blockbuster";
        else
            return "Movie is not a blockbuster";
		
    }

}
