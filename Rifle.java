/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the rifle class
 */
import java.awt.Graphics;

public class Rifle extends Gun {
	//initialize the variables
	private double firerate;
	//constructor
	public Rifle(){firerate = 10;}
	public void myDraw(Graphics g){}
	public void tick(){}
	public double firerate(){return firerate;}
	public boolean isShotgun() {return false;}
	public boolean isAuto(){return true;}
}
