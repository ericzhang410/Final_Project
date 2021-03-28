import java.awt.*;

public class Grenade extends Projectile {
	int radius;
	public Grenade(int x, int y)
	{
		super(x,y,x,y);
		radius = 100;
		velx = 0;
		vely = 0;
	}
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.red); 
		g.fillRect(x, y, 40, 40); 
		g.setColor(Color.black); 
		g.drawRect(x, y, 40, 40); 
	}
}
