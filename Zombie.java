
import java.awt.*;


public class Zombie {
	//Variables
	int x,y, health , increments,spawn;
	double velx,vely;
	boolean playerhit;
	//Constructor
	public Zombie()
	{
		spawn = (int)(Math.random()*4)+1;
		if(spawn == 1) {
			x = (int)(Math.random()*600)+1;
			y = (int)(Math.random()*5)+591;
		}
		else if (spawn == 2) {
			x = (int)(Math.random()*5)+591;
			y = (int)(Math.random()*600)+1;
		}
		else if  (spawn == 3) {
			x = (int)(Math.random()*600)+1;
			y = (int)(Math.random()*5)+1;
		}
		else {
			x = (int)(Math.random()*5)+1;
			y = (int)(Math.random()*600)+1;
		}
		velx = 1;
		vely = 1;

		health = 2 ;
		
		playerhit = false;
	}
	public void tick(int mouseX, int mouseY){
		double newX = mouseX-x;
		double newY = mouseY-y;
		double angle = Math.atan2(newY,newX);
		double diagonal =Math.sqrt(velx*velx+vely*vely);
		double newDX = Math.cos(angle)*diagonal;
		double newDY = Math.sin(angle)*diagonal;
		velx=((int)Math.round(newDX));
		vely=((int)Math.round(newDY));
		x+=velx;
		y+=vely;
	}
	public void myDraw(Graphics g) {
		g.setColor(Color.green); 
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
	public void spitColl(int x, int y){}
	public void ZColl(Zombie Other)
	{
		if(this.y >= Other.y-10 && this.y <= Other.y+60 && ((this.x+50 >= Other.x && this.x+50 <= Other.x+50 ) || (this.x >= Other.x && this.x <= Other.x+50 )))
		{
			this.y = Other.y+60;
		}
		if(this.y+50 >= Other.y-10 &&this.y+50 <= Other.y+60 && ((this.x+50 >= Other.x && this.x+50 <= Other.x+50 ) || (this.x >= Other.x && this.x <= Other.x +50 )))
		{
			this.y = Other.y-60;

		}
		if(this.x+50 >= Other.x-10 && this.x+50 <= Other.x+60 && ((this.y+50 >= Other.y && this.y+50 <= Other.y+50 ) || (this.y >= Other.y && this.y <= Other.y+50 )))
		{
			this.x = Other.x-60;
		}
		if(this.x <= Other.x+60 && this.x >= Other.x-10 && ((this.y+50 >= Other.y && this.y+50 <= Other.y +50 ) || (this.y >= Other.y && this.y <= Other.y +50 )))
		{
			this.x = Other.x+60;
		}
	}
	public void PColl(Player Other)
	{
		playerhit = false;
		if((this.y >= Other.Y()-10 && this.y <= Other.Y()+60) && ((this.x+50 >= Other.X() && this.x+50 <= Other.X()+50 ) || (this.x >= Other.X() && this.x <= Other.X()+50 )))
		{
			this.y = Other.Y()+60;
			playerhit = true;

		}
		if((this.y+50 >= Other.Y()-10 && this.y+50 <= Other.Y()+60) && ((this.x+50 >= Other.X() && this.x+50 <= Other.X()+50 ) || (this.x >= Other.X() && this.x <= Other.X()+50 )))
		{
			this.y = Other.Y()-60;
			playerhit = true;
		}
		if((this.x+50 >= Other.X()-10 && this.x+50 <= Other.X()+60) && ((this.y+50 >= Other.Y() && this.y+50 <= Other.Y()+50 ) || (this.y >= Other.Y() && this.y <= Other.Y()+50 )))
		{
			this.x =Other.X()-60;
			playerhit = true;
		}
		if((this.x <= Other.X()+60 && this.x >= Other.X()-10) &&((this.y+50 >= Other.Y() && this.y+50 <= Other.Y()+50 ) || (this.y >= Other.Y() && this.y <= Other.Y() +50 )))
		{
			this.x = Other.X()+60;
			playerhit = true;
		}
	}
	public boolean PHit() {
		return playerhit;
	}
	public int X()
	{
		return x;
	}
	public int Y()
	{
		return y;
	}
	public void SetX(int x)
	{
		this.x = x;
	}
	public void SetY(int y)
	{
		this.y = y;
	}
}

