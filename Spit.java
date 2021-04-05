import java.awt.Color;
import java.awt.Graphics;

public class Spit extends Projectile {
	public Spit(int mouseX , int mouseY , int x , int y) {
		super( mouseX ,  mouseY ,  x ,  y);
		this.x = x;
		this.y = y;
		velx = 8;
		vely = 8;
		double newX = mouseX-x;
		double newY = mouseY-y;
		double angle = Math.atan2(newY,newX);
		double diagonal =Math.sqrt(velx*velx+vely*vely);
		double newDX = Math.cos(angle)*diagonal;
		double newDY = Math.sin(angle)*diagonal;
		velx=((int)Math.round(newDX));
		vely=((int)Math.round(newDY));
	}
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.green); 
		g.fillRect(x, y, 10, 10); 
		g.setColor(Color.green); 
		g.drawRect(x, y, 10, 10); 
	}

}
