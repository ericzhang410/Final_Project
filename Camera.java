
public class Camera {
	private float x,y;
	public Camera(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float X() {
		return x;
	}
	public float Y() {
		return y;
	}
	public void tick(Player player) {
	}
}
