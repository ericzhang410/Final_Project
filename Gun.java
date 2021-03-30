import java.awt.*;
public class Gun {
	double firerate;
	boolean automatic;
	public Gun(double firerate)
	{
		this.firerate = firerate;
		automatic = true;
	}
	public void SetF(double firerate){
		this.firerate = firerate;
	}
	public double Firerate(){
		return firerate;
	}
	public void myDraw(Graphics g) {}
	public void tick() {}
	
}
