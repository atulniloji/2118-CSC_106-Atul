
public class Client {

	public static void main(String[] args) {
		Bastman bastman[] = {new Bastman("Max",10,5, 3, 4),new Bastman("clif", 0,3, 6, 5)};
		Bowler bowler[] = {new Bowler("Wen",3,4, 2, 3, 2),new Bowler("Hif",2,9, 5, 2, 3)};
		PrintAll(bastman,bowler);
	}
	static void PrintAll(Bastman bastman[],Bowler bowler[]) {
		System.out.println("BASTMAN DATA : ");
		for(int i=0;i<bastman.length;i++) {
			int j=i+1;
			System.out.println("Player No :"+j);
			bastman[i].displayresults();
			System.out.println();
		}
		
		System.out.println("BOWLER DATA : ");
		for(int i=0;i<bastman.length;i++) {
			int j=i+1;
			System.out.println("Player No :"+j);
			bowler[i].displayresults();
			System.out.println();
		}
	}
}
