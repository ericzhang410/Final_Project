import java.awt.Graphics;

public class Pistol extends Gun {
	private double firerate;
	public Pistol()
	{
		firerate = 1;
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
