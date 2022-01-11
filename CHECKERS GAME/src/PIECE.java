class PIECE extends PIECES
{
	//------------------------------------------------------------------------------------------------------
	public boolean valid_move(int x,int y, int px, int py)
	{
		//int cnsnt,i,j;
		if(y==py+1 || y==py-1) {
			if(check_piece(x,y)==true) {
				return true;
				}
			return false;
			}
		else if(y==py+2 || y==py-2) {
			if(check_kill(x,y)==true) {
				return true;
				}
			return false;
		}
		return false;
	}
	//------------------------------------------------------------------------------------------------------------
	public PIECE(int x,int y,char c)
	{
		this.pos_x=x;
		this.pos_y=y;
		this.colour=c;
		this.liv_status=1;
	}
	
}