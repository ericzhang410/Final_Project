import java.awt.*;

public class Block {
	private int width,height,x,y;
	public Block(int width, int height, int x, int y)
	{
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	public void myDraw(Graphics g)
	{
	g.setColor(Color.GRAY); 
	g.fillRect(x, y, width, height); 
	g.setColor(Color.GRAY); 
	g.drawRect(x, y, width, height);
	}
	public void ZColl(Zombie Other) 
	{
		if((Other.X()+60 > this.x+10 && Other.X()+60 < this.x+width+50) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height/2) || (Other.Y() > this.y && Other.Y() < this.y+height/2)))
		{
			Other.SetY(this.y-60);

		}
		if((Other.X() > this.x-50 && Other.X()< this.x+width-10) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height) || (Other.Y() > this.y && Other.Y() < this.y+height)))
		{
			Other.SetY(this.y+height);

		}
		if((Other.Y() + 60 > this.y && Other.Y() + 60 < this.y+height+60) && ((Other.X() + 60 > this.x+60 && Other.X()+60 < this.x+width) || (Other.X() > this.x+60 && Other.X() < this.x+width)))
		{
			Other.SetX(this.x+width);

		}
		if ((Other.X()+60 > this.x && Other.X()+60 < this.x+width) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height) || (Other.Y() > this.y && Other.Y() < this.y+height)))
		{
			Other.SetX(this.x-60);

		}
	}
	public void PColl(Player Other) 
	{
		if((Other.X()+60 > this.x+10 && Other.X()+60 < this.x+width+50) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height/2) || (Other.Y() > this.y && Other.Y() < this.y+height/2)))
		{
			Other.SetY(this.y-60);

		}
		if((Other.X() > this.x-50 && Other.X()< this.x+width-10) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height) || (Other.Y() > this.y && Other.Y() < this.y+height)))
		{
			Other.SetY(this.y+height);

		}
		if((Other.Y() + 60 > this.y && Other.Y() + 60 < this.y+height+60) && ((Other.X() + 60 > this.x+60 && Other.X()+60 < this.x+width) || (Other.X() > this.x+60 && Other.X() < this.x+width)))
		{
			Other.SetX(this.x+width);

		}
		if ((Other.X()+60 > this.x && Other.X()+60 < this.x+width) && ((Other.Y() + 60 > this.y && Other.Y()+60 < this.y+height) || (Other.Y() > this.y && Other.Y() < this.y+height)))
		{
			Other.SetX(this.x-60);

		}
	}
	public int X() {
		return x;
	}
	public int Y() {
		return y;
	}
}
