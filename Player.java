/*
 * if(x < 0) {
			velx = 0;
			x = 0;
		}
		if (x > 650) {
			velx = 0;
			x = 649;
		}
		if (y < 0) {
			vely = 0;
			y = 0;
		}
		if (y > 650) {
			vely = 0;
			y = 649;
		}
		implement later
 */
import java.awt.*;

public class Player {
	private int x,y,velx,vely,health;
	private double speed;
	public Player() 
	{
		x = 350;
		y = 350;
		velx = 0;
		vely = 0;
		health = 100;
		speed = 5;
	}
	public void myDraw(Graphics g) 
	{
		g.setColor(Color.red); 
		g.fillOval(x, y, 60, 60); 
		g.setColor(Color.black); 
		g.drawOval(x, y, 60, 60); 
	}
	public void tick(){

		x+=velx;
		y+=vely;
	}
	public int Health()
	{
		return health;
	}
	public int X()
	{
		return x;
	}
	public int Y()
	{
		return y;
	}
	public double Speed()
	{
		return speed;
	}
	public void SetVx(int x)
	{
		velx = x;
	}
	public void SetVy(int x)
	{
		vely = x;
	}
	public void SetH(int x)
	{
		health = x;
	}
	public void SetS(double x)
	{
		if(x<=11){
			speed = x;
		}


	}
	
}
