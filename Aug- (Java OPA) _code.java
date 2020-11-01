import java.util.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player[] player=new Player[4];
		for(int i=0;i<4;i++)
		{
			int playerId=sc.nextInt();sc.nextLine();
			String playerName=sc.nextLine();
			int score1=sc.nextInt();
			int score2=sc.nextInt();
			int score3=sc.nextInt();
			player[i]=new Player(playerId,playerName,score1,score2,score3);

		}
		int number=findTotalHundredsCount(player);
		System.out.println(number);
		Player player1= getTopPlayer(player);
		System.out.println(player1.getPlayerId()+" "+player1.getPlayerName());
		
	}
	public static int findTotalHundredsCount(Player[] player){
		int count=0;
		for(int j=0;j<4;j++)
		{
			if(player[j].getScore1()>=100)
			{
				count=count+1;
			}
			if(player[j].getScore2()>=100)
			{
				count=count+1;
			}
			if(player[j].getScore3()>=100)
			{
				count=count+1;
			}
		}
		return count;
	}
	public static Player getTopPlayer(Player[] player){
		Player player2= new Player(0,null,0,0,0);
		int con=0;
		int sum=player[0].getScore1()+player[0].getScore2()+player[0].getScore3();
		player2=player[0];
		for(int i=1;i<player.length;i++)
		{
			con=player[i].getScore1()+player[i].getScore2()+player[i].getScore3();
			
			if(con>sum)
			{
				
				player2=player[i];
				sum=con;
			}

		}
		return player2;
	}
}
class Player{
	private int playerId;
	private String playerName;
	private int score1;
	private int score2;
	private int score3;


	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	public int getScore3() {
		return score3;
	}
	public void setScore3(int score3) {
		this.score3 = score3;
	}


	public Player(int playerId, String playerName, int score1, int score2, int score3) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
}