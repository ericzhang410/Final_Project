import java.awt.*;
import java.awt.image.BufferedImage;

public class TankZombie extends Zombie {
	private BufferedImage sprite;
    ImportImg image = new ImportImg();
	public TankZombie() {
		super();
		super.setH(10);
		sprite = image.getImage(32);
	}
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
	public void hit(Graphics g)
	{
		if(super.Vely() > 0) {
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
	super.loseHealth();
	}
}
