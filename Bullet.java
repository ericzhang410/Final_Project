/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the bullet
 */
import java.awt.*;

public class Bullet extends Projectile{
	//Constructor
	public Bullet(int mouseX , int mouseY , int x , int y)
	{
		super(mouseX, mouseY,x,y);
	}
	//draws the bullet
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.black); 
		g.fillOval(x, y, 5, 5); 
		g.setColor(Color.black); 
		g.drawOval(x, y, 5, 5); 
	}

	
}

