import java.awt.*;
public abstract class Gun {
	public abstract void myDraw(Graphics g);
	public abstract void tick();
	public abstract boolean isShotgun();
	public abstract boolean isAuto();
	public abstract double firerate();
}
