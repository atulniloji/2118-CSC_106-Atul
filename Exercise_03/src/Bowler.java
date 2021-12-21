
public class Bowler {

	private String name;
	private int noOfGamesPlayed,noOfOvers,noOfFiveWickets,numOfTenWickets,avgRuns;

	public Bowler(String name, int noOfGamesPlayed, int noOfOvers,int noOfFiveWickets, int numOfTenWickets, int avgRuns) {
		this.name = name;
		this.noOfGamesPlayed  = noOfGamesPlayed;
		this.noOfOvers = noOfOvers;
		this.noOfFiveWickets = noOfFiveWickets;
		this.numOfTenWickets = numOfTenWickets;
		this.avgRuns = avgRuns;
		
	}
	public void displayresults() {
		System.out.println("Name : " +name);
		System.out.println("No of Games Played : " +noOfGamesPlayed);
		System.out.println("No of Overs Bowled : " +noOfOvers);
		System.out.println("No of Five Wickets : " +noOfFiveWickets);
		System.out.println("No of Ten Wickets : " +numOfTenWickets);
		System.out.println("Average Runs per wicket : " +avgRuns);
		
	}

}
