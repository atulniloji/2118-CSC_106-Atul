
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bastman bastman[] = {new Bastman("Max",10),new Bastman("clif", 0)};
		Bowler bowler[] = {new Bowler("Wen",3),new Bowler("Hif",2)};
		PrintAll(bastman,bowler);
	}
	static void PrintAll(Bastman bastman[],Bowler bowler[]) {
		for(int i=0;i<bastman.length;i++) {
			bastman[i].displayresults();
		}
	}
}
