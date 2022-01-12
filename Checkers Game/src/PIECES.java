public abstract class PIECES
{
	public  char colour;
	public  int pos_x;
	public  int pos_y;
	public  int liv_status;
	public  void kill(int x,int y)
	{
		BOARD.square[x][y].liv_status=0;
	}
	public String class_name()
	{
		return this.getClass().getSimpleName();
	}
	public  boolean has_piece(int x,int y)		//to check if there is piece or not
	{
		if(BOARD.square[x][y].liv_status==1)
		return true;
		else
		return false;
	}
	public  boolean check_piece(int x,int y)
	{
		if(BOARD.square[x][y].liv_status==1)
		{
			if(BOARD.square[x][y].colour==colour)
			return false;							//if colour is same you cant kill that pieces hence return false
			else
			return true;
		}
		else
			return true;							//if there is no piece it can move there
		
	}
	public  boolean check_kill(int x,int y)
	{
		int a=x+1,b=y-1;
		if(BOARD.square[x][y].liv_status==0 && BOARD.square[a][b].liv_status==1)
		{
			kill(a,b);
			BOARD.square[a][b]=PLAYER.empty[pos_x][pos_y];
			return true;
		}
		else
			return false;
		
	}
	public  void move(int x,int y, int px, int py)
	{
		BOARD.square[x][y]=BOARD.square[px][py];
		BOARD.square[x][y].liv_status=1;
		BOARD.square[px][py]=PLAYER.empty[pos_x][pos_y];
	}
}