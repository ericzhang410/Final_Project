/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Huang
 * This program creates the player class for the final project.
 */
import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
	//initialize the variables
	private int x,y,velx,vely,health;
	private double speed;
	private BufferedImage sprite;
    private ImportImg image = new ImportImg();
    //loads the players position and creates a constructor
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
	//draws the player image depending on the direction he's going
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
	//checks for wall collisions and moves the player
	public void tick(){
		if(x < 0){
			velx = 0;
			x = 0;
		}
		if (x > 600){
			velx = 0;
			x = 600;
		}
		if (y < 0){
			vely = 0;
			y = 0;
		}
		if (y > 600) {
			vely = 0;
			y = 600;
		}
		x+=velx;
		y+=vely;
	}
	//Setters and Getters
	public int Health(){return health;}
	public int X(){return x;}
	public int Y(){return y;}
	public double Speed(){return speed;}
	public void SetVx(int x){velx = x;}
	public void SetVy(int x){vely = x;}
	public void SetH(int x){health = x;}
	public void SetS(double x)
	{
		if(x<=11){
			speed = x;
		}
	}
	public void SetY(int y){this.y = y;}
	public void SetX(int x){this.x = x;}
}
