import java.awt.Graphics;

public class Rifle extends Gun {
	private double firerate;
	public Rifle()
	{
		firerate = 10;
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
