import java.util.*;
public class Main{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Movie[] movie=new Movie[4];
		for(int i=0;i<4;i++)
		{
			int movieId=sc.nextInt();sc.nextLine();
			String director=sc.nextLine();
			int rating=sc.nextInt();
			int budget=sc.nextInt();sc.nextLine();
			movie[i]=new Movie(movieId,director,rating,budget);
		}
		String director1=sc.nextLine();
		int rating1=sc.nextInt();
		int budget1=sc.nextInt();
		int ans1=findAvgBudgetByDirector(movie,director1);
		Movie movie2=getMovieByRatingBudget(movie,rating1,budget1);
		System.out.println(ans1);
		System.out.println(movie2.getMovieId());
	}
	public static int findAvgBudgetByDirector(Movie[] movie, String director)
	{
		int sum=0,avg=0,count=0;
		for(int i=0;i<4;i++)
		{
			if(movie[i].getDirector().equalsIgnoreCase(director)) {
				sum=sum+movie[i].getBudget();
				count=count+1;
			}
		}
		avg=sum/count;
		return avg;
		
	}
	public static Movie getMovieByRatingBudget(Movie[] movie,int rating,int budget)
	{
		Movie movie1=new Movie(0,null,0,0);
		for(int i=0;i<4;i++)
		{
			if((movie[i].getRating()==rating)&&(movie[i].getBudget()==budget)) {
				if(budget%rating==0)
				{
					movie1=movie[i];
				}
			}
		}
		return movie1;
	}
}
class Movie{
	private int movieId;
	private String director;
	private int rating;
	private int budget;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public Movie(int movieId, String director, int rating, int budget) {
		super();
		this.movieId = movieId;
		this.director = director;
		this.rating = rating;
		this.budget = budget;
	}
	
}