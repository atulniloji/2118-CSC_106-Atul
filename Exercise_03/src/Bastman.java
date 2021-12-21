
public class Bastman {

	private String name;
	private int noOfGamesPlayed,noOfCenturies,noOfFifties,avgRuns;

	public Bastman(String name, int noOfGamesPlayed, int noOfCenturies, int noOfFifties, int avgRuns) {
		this.name = name;
		this.noOfGamesPlayed  = noOfGamesPlayed;
		this.noOfCenturies = noOfCenturies;
		this.noOfFifties = noOfFifties;
		this.avgRuns = avgRuns;
		
	}

	public void displayresults() {
		System.out.println("Name : " +name);
		System.out.println("No of Games Played : " +noOfGamesPlayed);
		System.out.println("Centuries : " +noOfCenturies);
		System.out.println("Fiftees : " +noOfFifties);
		System.out.println("Average Runs : " +avgRuns);
		
	}

}
