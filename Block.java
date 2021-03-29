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
	g.fillRect(x, y, 60, 60); 
	g.setColor(Color.GRAY); 
	g.drawRect(x, y, 60, 60);
	}
	public void ZColl(Zombie Other) 
	{
		//if(x))
	}
}
