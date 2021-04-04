import java.awt.Graphics;

public class Shotgun extends Gun {
	private double firerate;
	public Shotgun()
	{
		firerate = 4;
	}
	public void myDraw(Graphics g) {
		
	}
	public double firerate() {
		return firerate;
	}
	public void tick() {}
	public boolean isShotgun() {
		return true;
	}
	public boolean isAuto()
	{
		return false;
	}
}
