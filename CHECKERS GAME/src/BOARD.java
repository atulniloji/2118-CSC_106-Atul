//start game function
import java.util.*;
class BOARD
{
	public static PIECES square[][]=new PIECES[8][8];
	public  int checkm;
	public  PLAYER p1;
	public 	PLAYER p2;
	public char turn='w';
	char chance()
	{
		if(turn=='w')
		return 'b';
		else
		return 'w';
	}
	BOARD(String pname1,String pname2)							//constructor
	{
		this.checkm=0;
		p1=new PLAYER('r', pname1);
		p2=new PLAYER('b', pname2);
	}
	//----------display function---------------
	public void display()
	{
		int i,j,k;
		System.out.println("--------------------------------------------------------------------\n");
		System.out.printf("\t");
		for( k=0;k<8;++k)
			System.out.printf("  %d \t",k);
		System.out.println("\n\n");
		for(i=0;i<8;++i)
		{
			System.out.printf("%d:\t",i);
			for(j=0;j<8;++j)
			{
				String name=square[i][j].class_name();
				switch(name)
				{
					case "PIECE":
						if(square[i][j].colour=='r')
						{
							System.out.printf("RED\t");
						}
						else
						{
						System.out.printf("BLACK\t");
						}
						break;
					case "EMPTY":
						System.out.printf("~~~~\t");
						break;
				}
			}
			System.out.println("\n\n");
		}
		System.out.println("\n----------------------------------------------------------------------");
	}
	//---------------------------------------------------------------------------------------
	//------------------Main Game Start------------------------------------------------------
	public void Start_Game()
	{
		while(checkm==0)
		{
			boolean vm=false;
			int f=1,px=-1,py=-1,nx=-1,ny=-1;
			int i ;
			Scanner scan=new Scanner(System.in);
			display();
			//------------player 1----------------------------
			while(f==1)					//to take correct piece position
			{
				System.out.println("** Turn: "+p1.name+" **\n\nNOTE:- you can only move red pieces only");
				System.out.println("Enter piece's position you want to pick");
				try{
					px=scan.nextInt();
					py=scan.nextInt();
				} catch (Exception e){
					System.out.println("Error!!! you can only give position's index e.g. 0 1");
					System.out.println("Try again\n-------------------------------------------\n");
					scan.nextLine();
					continue;
				}
				if(px<0 || px >7 || py<0 || py>7)
				{
						System.out.println("INVALID!!!! out of bound\n------------------------------------------------\n");
						continue;
				}
				if(square[px][py].has_piece(px, py)==false ||p1.colour != square[px][py].colour)
				{
					System.out.println("\nInvalid positions (There is no piece or not your piece)\n------------------------------------------------\n");
					continue;
				}
				System.out.println("\nEnter position to which you want to place the piece");
				try {
					nx=scan.nextInt();
					ny=scan.nextInt();
				} catch (Exception e){
					System.out.println("Error!!! you can only give position's index e.g. 0 1");
					System.out.println("Try again\n-------------------------------------------\n");
					scan.nextLine();
					continue;
				}
				if(nx<0 || nx >7 || ny<0 || ny>7)
				{
						System.out.println("INVALID!!!! out of bound\n------------------------------------------------\n");
						continue;
				}
				//checking for piece and calling its valid move function
				for(i=0;i<24;i++){
					if(square[px][py]==p1.piece[i]) {
						vm=p1.piece[i].valid_move(nx,ny,px,py);
					}
				}
				if(vm==false)
				{
					System.out.println("Invalid move\n------------------------------------------------\n");
					continue;
				}
				else
					break;
			}
			square[px][py].move(nx,ny,px,py);
			turn=chance();			//chance 2nd
			display();
			//------------------for player 2------------
			while(f==1)					//to take correct piece position
			{
				System.out.println("** Turn: "+p2.name+" **\n\nNOTE:- you can only move black pieces\n");
				System.out.println("Enter piece's position you want to pick");
				try {
					px=scan.nextInt();
					py=scan.nextInt();

				} catch (Exception e){
					System.out.println("Error!!! you can only give position's index e.g. 0 1");
					System.out.println("Try again\n------------------------------------------------\n");
					scan.nextLine();
					continue;
				}
				if(px<0 || px >7 || py<0 || py>7)
				{
						System.out.println("INVALID!!!! out of bound\n------------------------------------------------\n");
						continue;
				}
				if(square[px][py].has_piece(px,py)==false || (p2.colour != square[px][py].colour))
				{
					System.out.println("Invalid positions (There is no piece or not your piece)\n------------------------------------------------\n");
					continue;
				}
				System.out.println("\nEnter position to which you want to place the piece");
				try {
					nx=scan.nextInt();
					ny=scan.nextInt();
				} catch (Exception e){
					System.out.println("Error!!! you can only give position's index e.g. 0 1");
					System.out.println("Try again\n------------------------------------------------\n");
					scan.nextLine();
					continue;
				}
				if(nx<0 || nx >7 || ny>7 || ny<0)
				{
						System.out.println("INVALID!!!! out of bound\n------------------------------------------------\n");
						continue;
				}
				//For Checking Valid Move
				for(i=0;i<24;i++){
					if(square[px][py]==p2.piece[i]) {
						vm=p2.piece[i].valid_move(nx,ny,px,py);
					}
				}
				if(vm==false)
				{
					System.out.println("Invalid move\n------------------------------------------------\n");
					continue;
				}
				else
					break;
			}
			square[px][py].move(nx,ny,px,py);
	}
	//----------------------------------------------------------------------------------------------
	}
}
