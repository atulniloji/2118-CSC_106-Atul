class PLAYER
{
	public char colour;
	public String name;
	PIECE piece[]=new PIECE[24];
	static EMPTY empty[][]=new EMPTY[8][8];
	PLAYER(char c, String name)
	{
		this.name = name;
		int i;
		this.colour=c;
		if(this.colour=='b')
		{
			for(i=0;i<3;i++) {
				for(int j=0;j<8;j++) {
					if((i+j)%2==0) {
						piece[i]=new PIECE(i,j,'b');
					}
					else
						empty[i][j]=new EMPTY(i,j,'n');
				}
			}
			for(i=0;i<3;i++) {
				for(int j=0;j<8;j++) {
					if((i+j)%2==0) {
						BOARD.square[i][j]=piece[i];
					}
					else
						BOARD.square[i][j]=empty[i][j];
				}
			}
			//FOR DECLARING EMPTY SPACES (ROW 3 & 4)
			int j;
			for(i=0;i<8;++i)
			{
				for(j=0;j<8;++j)
					empty[i][j]=new EMPTY(i,j,'n');
			}
			for(i=3;i<5;++i)
			{
				for(j=0;j<8;++j)
				{
					BOARD.square[i][j]=empty[i][j];
				}
			}
		}
		else
		{//for red pieces
			for(i=5;i<8;i++) {
				for(int j=0;j<8;j++) {
					if((i+j)%2==0) {
						piece[i]=new PIECE(i,j,'r');
					}
					else
						empty[i][j]=new EMPTY(i,j,'n');
				}
			}
			for(i=5;i<8;i++) {
				for(int j=0;j<8;j++) {
					if((i+j)%2==0) {
						BOARD.square[i][j]=piece[i];
					}
					else
						BOARD.square[i][j]=empty[i][j];
				}
			}
		}
	}
}
