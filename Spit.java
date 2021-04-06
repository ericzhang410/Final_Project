/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the spit class
 */

import java.awt.Color;
import java.awt.Graphics;

public class Spit extends Projectile {
	//creates the constructor
	public Spit(int mouseX , int mouseY , int x , int y) {
		super( mouseX,mouseY,x,y);
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
	//draws the spit/projectile
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.blue); 
		g.fillOval(x, y, 10, 10); 
		g.setColor(Color.blue); 
		g.drawOval(x, y, 10, 10); 
	}

}
