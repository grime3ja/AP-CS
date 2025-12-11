
/**
 * @author Jacob Grimes
 */
public class Movie extends Netflix 
{
	private String movie;
	private int year;
	private String rating;
	private String genre;
	private String description;
	
	/**
	 * @param movie The title of the movie
	 * @param year The year the movie was made 
	 * @param rating The age rating of the movie
	 * @param genre The genre of the movie
	 * @param description The movie description
	 */
	public Movie(String movie, int year, String rating, String genre, String description)
	{
		this.movie = movie;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
		this.description = description;
	}
	
	/**
	 * @return Returns the movie that is selected
	 */
	public String getMovie()
	{
		return movie;
	}
	
	/**
	 * @return Returns the movie that is selected
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * @return Returns the needed information needed to show the movie
	 */
	public String toString()
	{
		return movie + " (" + year + ") " + "- " + rating  + " - " + genre;
	}
}
