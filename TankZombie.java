import java.awt.Color;
import java.awt.Graphics;

public class TankZombie extends Zombie {
	public TankZombie() {
		super();
		health = 10;
	}
	public void myDraw(Graphics g) {
		g.setColor(Color.blue); 
		g.fillOval(x, y, 60, 60); 
		g.setColor(Color.black); 
		g.drawOval(x, y, 60, 60); 
	}
	public void hit(Graphics g)
	{
		g.setColor(Color.red); 
		g.fillOval(x, y, 60, 60); 
		g.setColor(Color.red); 
		g.drawOval(x, y, 60, 60); 
		health--;
	}
}
