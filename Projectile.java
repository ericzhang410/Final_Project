/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Huang
 * This program creates the projectile class
 */
import java.awt.*;

public class Projectile {
	//initialize the variables
	int x,y, radius ,velx,vely;
	long duration;
	//constructor
	public Projectile(int mouseX , int mouseY , int x , int y) {
		this.x = x;
		this.y = y;
		velx = 20;
		vely = 20;
		double newX = mouseX-x;
		double newY = mouseY-y;
		double angle = Math.atan2(newY,newX);
		double diagonal =Math.sqrt(velx*velx+vely*vely);
		double newDX = Math.cos(angle)*diagonal;
		double newDY = Math.sin(angle)*diagonal;
		velx=((int)Math.round(newDX));
		vely=((int)Math.round(newDY));
		duration = System.currentTimeMillis();
	}
	public void myDraw(Graphics g) {}
	public void tick(){
		x+=velx;
		y+=vely;
	}
	public long duration()
	{
		return duration;
	}
}
