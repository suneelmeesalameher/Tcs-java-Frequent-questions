import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player[] player=new Player[4];
		for(int i=0;i<4;i++)
		{
			int id=sc.nextInt();sc.nextLine();
			String name=sc.nextLine();
			int exp=sc.nextInt();
			int matchesPlayed=sc.nextInt();
			int runsScored=sc.nextInt();
			player[i]=new Player(id,name,exp,matchesPlayed,runsScored);

		}
		int target=sc.nextInt();
		Player[] player2=averagep(player,target);
		for(int i=0;i<player2.length;i++)
		{
			int x=player2[i].getRunsScored();
			int y=player2[i].getMatchesPlayed();
			int k=x/y;
			if(k>=80 && k<=100)
			{
				System.out.println("Grade A");
			}
			else if(k>=50 && k<=79)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade C");
			}
		}

	}
	public static Player [] averagep(Player [] player,int target)
	{
		Player[] player1=new Player[0];
		for(int i=0;i<4;i++)
		{
			if(player[i].getMatchesPlayed()>=target)
			{
				player1=Arrays.copyOf(player1,player1.length+1);
				player1[player1.length-1]=player[i];
			}
		}
		return player1;

	}
}
class Player{
	private int id;
	private String name;
	private int exp;
	private int matchesPlayed;
	private int runsScored;

	public Player(int id,String name,int exp,int matchesPlayed,int runsScored){
		this.id=id;
		this.name=name;
		this.exp=exp;
		this.matchesPlayed=matchesPlayed;
		this.runsScored=runsScored;
	}
//1
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
//2
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
//3
	public int getExp()
	{
		return exp;
	}
	public void setExp(int exp)
	{
		this.exp=exp;
	}
//4
	public int getMatchesPlayed()
	{
		return matchesPlayed;
	} 
	public void setMatchesPlayed(int matchesPlayed)
	{
		this.matchesPlayed=matchesPlayed;
	}
//5
	public int getRunsScored()
	{
		return runsScored;
	}
	public void setRunsScored(int runsScored)
	{
		this.runsScored=runsScored;
	}
}