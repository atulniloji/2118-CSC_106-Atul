import java.util.Scanner;
class CLIENT
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("THIS IS A CHECKERS GAME:\n\nEnter your names:: Player 1 (Red Pieces):  ");
		String p1 = scan.nextLine();
		System.out.print("\n\t\t Player 2 (Black Pieces):  ");
		String p2 = scan.nextLine();
		System.out.println();
		BOARD board = new BOARD(p1,p2);
		board.Start_Game();
		scan.close();
	}
}
