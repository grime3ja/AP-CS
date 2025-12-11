import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Jacob Grimes
 *This is a class to simulate the movie program "Netflix"
 */
public class Netflix 
{
	private static Scanner scan = new Scanner(System.in);
	private static String name = ""; 
	private static ArrayList<Movie> movies = new ArrayList<Movie>();
	private static ArrayList<Movie> favorites = new ArrayList<Movie>();
	private static int numMovies = 0;
	//private static int tempMovies = 0;
	private static int select;
	//private static Movie m;
	private static int offset = 0;
	
	/**
	 * This allows the code to run
	 */
	public static void main(String[] args)
	{
		netflixMovie();
	}
	
	/**
	 * This is what everything runs under
	 */
	public static void netflixMovie()
	{
		Movie a = new Movie("Star Wars", 1977, "PG", "Science Fiction", "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, "
																	  + "a Wookiee and two droids to save the galaxy from the Empire's "
																	  + "world-destroying battle station, while also attempting to rescue "
																	  + "Princess Leia from the mysterious Darth Vader.");
		
		Movie b = new Movie("I Can Only Imagine", 2018, "PG", "Christian/Gospel", "I Can Only Imagine is a 2018 American Christian drama "
																				+ "film directed by the Erwin Brothers and written by Alex Cramer, "
																				+ "Jon Erwin, and Brent McCorkle, based on the story behind the group"
																				+ " MercyMe's song of the same name, the best-selling Christian single of all time.");
		
		Movie c = new Movie("Back to the Future", 1985, "PG", "Comedy", "Back to the Future is a 1985 American science fiction film directed by Robert Zemeckis and "
																	  + "written by Zemeckis and Bob Gale. It stars Michael J. Fox as teenager Marty McFly, "
																	  + "who accidentally travels back in time from 1985 to 1955, where he meets his future "
																	  + "parents and becomes his mother's romantic interest.");
		
		Movie d = new Movie("Dumb and Dumber", 1994, "PG-13", "Comedy", "Imbecilic best friends Lloyd Christmas (Jim Carrey) and Harry Dunne (Jeff Daniels) "
																	  + "stumble across a suitcase full of money left behind in Harry's car by Mary Swanson (Lauren Holly), "
																	  + "who was on her way to the airport. The pair decide to go to Aspen, Colo., to return the money, "
																	  + "unaware that it is connected to a kidnapping. As Harry and Lloyd -- who has fallen in love with "
																	  + "Mary -- are pursued across the country by hired killers and police, they find both their friendship "
																	  + "and their brains tested.");
		
		Movie e = new Movie("Captain America: The First Avenger", 2011, "PG-13", "Action", "Set predominantly during World War II, the film tells the story of Steve Rogers, "
																						 + "a sickly man from Brooklyn who is transformed into the super-soldier Captain America "
																						 + "and must stop the Red Skull, who intends to use an artifact called the \"Tesseract\" "
																						 + "as an energy-source for world domination.");
		System.out.println("Welcome to Netflix!");
		
		System.out.print("Enter Your Name: ");
		if(scan.hasNext())
		{
			name = scan.next();
		}
		
		do
		{
			System.out.print("How many movies would you like to display (3 - 5): ");
			if(scan.hasNextInt())
			{
				numMovies = scan.nextInt();
			}
			else
			{
				scan.next();
			}
		}
		while(numMovies < 3 || numMovies > 5);
		
		System.out.println("Welcome " + name + "!");
		
		movies.add(a);
		movies.add(b);
		movies.add(c);
		movies.add(d);
		movies.add(e);
		
		
		boolean done = false;
		while(done == false)
		{
			
			System.out.println("-----------------\nMovie Options:\n-----------------");
			movies();
			
			options();
			boolean happened = false;
			do 
			{
				String temp = scan.next();
				if(temp.equals(">"))
				{
					offset++;
					scroll();
					happened = true;
				}
				
				else if(temp.equals("<"))
				{
					offset--;
					scroll();
					happened = true;
				}
				
				else if(temp.equals("D") || temp.equals("d"))
				{
					displayAll();
					happened = true;
				}
				
				else if(temp.equals("F") || temp.equals("f"))
				{
					favorite();
					happened = true;
				}
				
				else if(temp.equals("M") || temp.equals("m"))
				{
					select();
					happened = true;
				}
				
				else if(temp.equals("A") || temp.equals("a"))
				{
					System.out.print("What is the movie title? "); scan.nextLine(); String title = scan.nextLine();
					System.out.print("What year was it released? "); int year = scan.nextInt();
					System.out.print("What was it rated? "); scan.nextLine(); String rating = scan.nextLine();
					System.out.print("What is the genre? "); String genre = scan.nextLine();
					System.out.print("Please describe the movie: "); String desc = scan.nextLine();
					Movie newMovie = new Movie(title, year, rating, genre, desc);
					movies.add(newMovie);
					happened = true;
				}
				
				else if(temp.equals("R") || temp.equals("r"))
				{
					remove();
					happened = true;
				}
				
				else if(temp.equals("X") || temp.equals("x"))
				{
					System.out.println("Goodbye");
					happened = true;
					done = true;
				}
				
				else if(temp.equals("W") || temp.equals("w"))
				{
					watch();
					happened = true;
					done = true;
				}
			}
			while(happened == false);	
		}
	}
	
	/**
	 * This displays the movies that are shown
	 */
	public static void movies()
	{
		for(int i = 0; i < numMovies; i++)
		{
			System.out.println(i+1 + ". " + movies.get(i));
		}
	}
	
	/**
	 * This displays the options menu that are shown
	 */
	public static void options()
	{
		System.out.println("-----------------\nSelect an Option\n> to scroll forward\n< to scroll backward\nD to display all\nF to add / display favorites"
				  + "\nM to select a movie"
				  + "\nA to add a movie to the list"
				  + "\nR to remove a movie from the list"
				  + "\nX to exit"
				  + "\nW to watch"
				  + "\n------------------\n"
				  + "Please enter your selection: ");
	}
	
	/**
	 * This is used to scroll to the left / right when > or < is clicked
	 */
	public static void scroll()
	{
		for(int i = offset; i < numMovies + offset; i++)
		{
			if(i < 0)
			{
				System.out.println(i + movies.size() + 1 + ". " + movies.get(i + movies.size()));
			}
			else if(i < movies.size())
			{
				System.out.println((i+1) + ". " + movies.get(i));
			}
			else if( i >= movies.size()) 
			{
				System.out.println(i - movies.size() + 1 + ". " + movies.get(i - movies.size()));
			}
		}
	}
	
	/**
	 * This displays all the movies
	 */
	public static void displayAll()
	{
		for(int i = 0; i < movies.size(); i++)
		{
			System.out.println(i+1 + ". " + movies.get(i));
		}
	}
	
	/**
	 * This adds movies to the favorites
	 */
	public static void favorite()
	{
		favorites.add(movies.get(select));
		System.out.println("Favorite Movies: ");
		for(int i = 0; i < favorites.size(); i++)
		{
			System.out.println(i + ". " + movies.get(i));
		}
	}
	
	/**
	 * Determines if a movie is favorited
	 * @return If it is favorited, it returns true
	 */
	public static boolean isFavorite()
	{
		for(int i = 0; i < movies.size(); i++)
		{
			if(favorites.contains(movies.get(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This selects the movies that the options are done with
	 */
	public static void select()
	{
		System.out.println("Please Select the Number You Want to Select");
		if(scan.hasNextInt())
		{
			select = scan.nextInt();
		}
		Movie m = movies.get(select-1);
		System.out.println(m.toString() + "\n" + m.getDescription());
		
	}
	
	/**
	 * This removes the movie from the list
	 */
	public static void remove()
	{
		System.out.println("Please Select the Number You Want to Remove: ");
		int remove = scan.nextInt();
		movies.remove(remove-1);
		numMovies--;
	}
	
	/**
	 * This is how you watch the movie!
	 */
	public static void watch()
	{
		System.out.println("Enjoy " + movies.get(select-1) + "!");
	}
}
