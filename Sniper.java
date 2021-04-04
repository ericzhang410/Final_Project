import java.awt.Graphics;

public class Sniper extends Gun {
	private double firerate;
	public Sniper()
	{
		firerate = 3;
	}
	public void myDraw(Graphics g) {
		
	}
	public double firerate() {
		return firerate;
	}
	public void tick() {}
	public boolean isShotgun() {
		return false;
	}
	public boolean isAuto()
	{
		return false;
	}
}
