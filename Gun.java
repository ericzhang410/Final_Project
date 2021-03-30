import java.awt.*;
public class Gun {
	boolean shotgun;
	double firerate;
	boolean automatic;
	public Gun()
	{
		firerate = 1;
		automatic = false;
		shotgun = false;
	}
	public void myDraw(Graphics g) {}
	public void tick() {}
	public boolean isShotgun() {
		return shotgun;
	}
}
