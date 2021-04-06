/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the tank zombie class
 */

import java.awt.*;
import java.awt.image.BufferedImage;

public class TankZombie extends Zombie {
	//initializes the variables
	private BufferedImage sprite;
	private ImportImg image = new ImportImg();
	//creates the constructor
	public TankZombie() {
		super();
		super.setH(10);
		sprite = image.getImage(32);
	}
	//draws the tank zombie
	public void myDraw(Graphics g) {
		if(super.Velx() > 0) {
			sprite = image.getImage(36);
	       if(super.Velx() > 0) {
	    	   sprite = image.getImage(35);
	       }
	       if(super.Vely() < 0) {
	    	   sprite = image.getImage(37);
	       }
		}
		if(super.Vely() < 0) {
			sprite = image.getImage(32);
			if(super.Velx() > 0) {
				sprite = image.getImage(33);
			}
			if(super.Velx() < 0) {
				sprite = image.getImage(39);
			}
		}
		if(super.Velx() > 0) {
			sprite = image.getImage(34);
			if(super.Vely() > 0) {
				sprite = image.getImage(35);
			}
			if(super.Vely() < 0) {
				sprite = image.getImage(33);
			}
		}
		if(super.Velx() < 0) {
			sprite = image.getImage(38);
			if(super.Vely() > 0) {
				sprite = image.getImage(37);
			}
			if(super.Vely() < 0) {
				sprite = image.getImage(39);
			}
		}
	g.drawImage(sprite,super.X(),super.Y(), null);
	}
	//draws another image if hit(for special zombies has no effect.)
	public void hit(Graphics g){
		this.myDraw(g);
		super.loseHealth();
	}
}
