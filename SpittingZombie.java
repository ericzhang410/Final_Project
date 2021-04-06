/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the spitting zombie class
 */
import java.awt.*;
import java.util.*;
import java.awt.image.BufferedImage;

public class SpittingZombie extends Zombie {
	//initialize the variables
	private int Sx,Sy,Svelx,Svely;
	private long current;
	private ArrayList<Projectile> spits;
	private BufferedImage sprite;
	private ImportImg image = new ImportImg();
	//constructor
	public SpittingZombie()
	{
		super();
		super.setH(4);
		Svelx = 8;
		Svely = 8;
		Sx = super.X();
		Sy = super.Y();
		spits = new ArrayList<Projectile>();
		current = (long)0;
		sprite = image.getImage(41);
	}
	//draws the zombie
	public void myDraw(Graphics g) {
		if(super.Velx() > 0) {
			sprite = image.getImage(44);
	       if(super.Velx()  > 0) {
	    	   sprite = image.getImage(43);
	       }
	       if(super.Vely() < 0) {
	    	   sprite = image.getImage(45);
	       }
		}
		if(super.Vely() < 0) {
			sprite = image.getImage(40);
			if(super.Velx()  > 0) {
				sprite = image.getImage(41);
			}
			if(super.Velx()  < 0) {
				sprite = image.getImage(47);
			}
		}
		if(super.Velx()  > 0) {
			sprite = image.getImage(42);
			if(super.Vely() > 0) {
				sprite = image.getImage(43);
			}
			if(super.Vely() < 0) {
				sprite = image.getImage(41);
			}
		}
		if(super.Velx()  < 0) {
			sprite = image.getImage(46);
			if(super.Vely() > 0) {
				sprite = image.getImage(45);
			}
			if(super.Vely() < 0) {
				sprite = image.getImage(47);
			}
		}
		g.drawImage(sprite,super.X(),super.Y(), null);
		for(int i = 0; i < spits.size();i++) {
			spits.get(i).myDraw(g);
		}
	}
	//draws another image if hit(for special zombies has no effect.)
	public void hit(Graphics g) {
		this.myDraw(g);
		super.loseHealth();
		g.drawImage(sprite,super.X(),super.Y(), null);
		for(int i = 0; i < spits.size();i++) {
			spits.get(i).myDraw(g);
		}
	}
	//updates the zombie
	public void tick(int mouseX , int mouseY) {
		double newX = mouseX-super.X();
		double newY = mouseY-super.Y();
		double angle = Math.atan2(newY,newX);
		double diagonal = Math.sqrt(super.Velx()*super.Velx()+super.Vely()*super.Vely());
		double newDX = Math.cos(angle)*diagonal;
		double newDY = Math.sin(angle)*diagonal;
		super.setVelx((int)Math.round(newDX));
		super.setVely((int)Math.round(newDY));
		super.SetX(super.X()+super.Velx());
		super.SetY(super.Y()+super.Vely());
		if(System.currentTimeMillis() - current > 5000)
		{
			spits.add(new Spit(mouseX,mouseY,super.X(),super.Y()));
			current = System.currentTimeMillis();
		}
		for(int i = 0; i < spits.size();i++) {
			spits.get(i).tick();
		}
		
	}
	//checks for spit collision
	public void spitColl(int x, int y) {
		super.setSpit(false);
		for(int i= 0; i < spits.size(); i++){
			if (spits.get(i).x <= x+50  && spits.get(i).x >= x && spits.get(i).y <= y+50 && spits.get(i).y >= y) {
				super.setSpit(true);
				spits.remove(i);
			}
			else if(System.currentTimeMillis() - spits.get(i).duration() > 10000)
			{
				spits.remove(i);
			}
		}
	}
}
