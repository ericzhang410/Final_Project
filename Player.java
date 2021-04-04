import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
	private int x,y,velx,vely,health;
	private double speed;
	private BufferedImage sprite;
    ImportImg image = new ImportImg();
	public Player() 
	{
		x = 350;
		y = 350;
		velx = 0;
		vely = 0;
		health = 100;
		speed = 5;
		sprite = image.getImage(8);
	}
	public void myDraw(Graphics g) 
	{
		if(vely > 0) {
				sprite = image.getImage(12);
		       if(velx > 0) {
		    	   sprite = image.getImage(11);
		       }
		       if(vely < 0) {
		    	   sprite = image.getImage(13);
		       }
		}
		if(vely < 0) {
			sprite = image.getImage(8);
			if(velx > 0) {
				sprite = image.getImage(9);
			}
			if(velx < 0) {
				sprite = image.getImage(15);
			}
		}
		if(velx > 0) {
			sprite = image.getImage(10);
			if(vely > 0) {
				sprite = image.getImage(11);
			}
			if(vely < 0) {
				sprite = image.getImage(9);
			}
		}
		if(velx < 0) {
			sprite = image.getImage(14);
			if(vely > 0) {
				sprite = image.getImage(13);
			}
			if(vely < 0) {
				sprite = image.getImage(15);
			}
		}
		g.drawImage(sprite,x,y, null);
	}
	public void tick(){
		if(x < 0) {
			velx = 0;
			x = 0;
		}
		if (x > 650) {
			velx = 0;
			x = 650;
		}
		if (y < 0) {
			vely = 0;
			y = 0;
		}
		if (y > 650) {
			vely = 0;
			y = 650;
		}
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
	public void SetY(int y)
	{
		this.y = y;
	}
	public void SetX(int x)
	{
		this.x = x;
	}
	
}
