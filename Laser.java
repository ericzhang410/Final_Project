import java.awt.Graphics;

public class Laser extends Gun {
	private double firerate;
	public Laser()
	{
		firerate = 100;
	}
	public void myDraw(Graphics g) {
		
	}
	public void tick() {}
	public double firerate() {
		return firerate;
	}
	public boolean isShotgun() {
		return false;
	}
	public boolean isAuto()
	{
		return true;
	}
}
