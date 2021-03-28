import java.awt.*;

public class Bullet extends Projectile{
	//Constructor
	public Bullet(int mouseX , int mouseY , int x , int y)
	{
		super(mouseX, mouseY,x,y);
	}
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.black); 
		g.fillRect(x, y, 10, 10); 
		g.setColor(Color.black); 
		g.drawRect(x, y, 10, 10); 
	}

	
}

