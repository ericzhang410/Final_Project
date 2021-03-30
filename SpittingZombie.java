import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

public class SpittingZombie extends Zombie {
	int Sx,Sy,Svelx,Svely;
	long current;
	ArrayList<Projectile> spits;
	public SpittingZombie()
	{
		super();
		health = 4;
		Svelx = 8;
		Svely = 8;
		Sx = x;
		Sy = y;
		spits = new ArrayList<Projectile>();
		current = (long)0;
	}
	public void myDraw(Graphics g) {
		g.setColor(Color.black); 
		g.fillOval(x, y, 60, 60); 
		g.setColor(Color.black); 
		g.drawOval(x, y, 60, 60);
		for(int i = 0; i < spits.size();i++) {
			spits.get(i).myDraw(g);
		}
		
	}
	public void tick(int mouseX , int mouseY) {
		double newX = mouseX-x;
		double newY = mouseY-y;
		double angle = Math.atan2(newY,newX);
		double diagonal = Math.sqrt(velx*velx+vely*vely);
		double newDX = Math.cos(angle)*diagonal;
		double newDY = Math.sin(angle)*diagonal;
		velx=((int)Math.round(newDX));
		vely=((int)Math.round(newDY));
		x+=velx;
		y+=vely;
		if(System.currentTimeMillis() - current > 5000)
		{
			spits.add(new Spit(mouseX,mouseY,x,y));
			current = System.currentTimeMillis();
		}
		for(int i = 0; i < spits.size();i++) {
			spits.get(i).tick();
		}
		
	}
	public void spitColl(int x, int y) {
		spithit = false;
		for(int i= 0; i < spits.size(); i++){
			if (spits.get(i).x <= x+50  && spits.get(i).x >= x && spits.get(i).y <= y+50 && spits.get(i).y >= y) {
				spithit = true;
				spits.remove(i);
			}
			else if(System.currentTimeMillis() - spits.get(i).duration() > 10000)
			{
				spits.remove(i);
			}
		}
	}
}
