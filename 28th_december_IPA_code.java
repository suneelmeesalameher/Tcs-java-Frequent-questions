import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie[] movie=new Movie[4];
		for(int i=0;i<4;i++)
		{
			String movieName=sc.nextLine();
			String company=sc.nextLine();
			String genre=sc.nextLine();
			int budget=sc.nextInt();sc.nextLine();
			movie[i]=new Movie(movieName,company,genre,budget);
		}
		String check=sc.nextLine();
		Movie movie2[]= getMovieByGenre(movie,check);
		for(int i=0;i<movie2.length;i++)
		{
			if(movie2[i].getBudget()<80000000)
			{
				System.out.println("Low Budget Movie");
			}	
			else{
				System.out.println("High Budget Movie");
			}
		}
		
	}
	public static Movie[] getMovieByGenre(Movie[] movie, String check){
		Movie[] movie1=new Movie[0];
		for(int j=0;j<4;j++)
		{
			if(movie[j].getGenre().equalsIgnoreCase(check))
			{
				movie1=Arrays.copyOf(movie1,movie1.length+1);
				movie1[movie1.length-1]=movie[j];
			}
		}
		return movie1;

	}
	
}
class Movie
{
	private String movieName;
	private String company;
	private String genre;
	private int budget;
	public Movie(String movieName,String company,String genre,int budget)
	{
		this.movieName=movieName;
		this.company=company;
		this.genre=genre;
		this.budget=budget;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setMovieName(String movieName)
	{
		this.movieName=movieName;
	}

	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}

	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}

	public int getBudget()
	{
		return budget;
	}
	public void setBudget(int budget)
	{
		this.budget=budget;
	}
}