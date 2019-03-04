package Example;

class Point {
	private int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {
	private String color;
	
	ColorPoint (int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setPoint(int x, int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void show() {
		System.out.println(getColor() + "색으로" + "(" + getX() + "," + getY() + ")");
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
	}
}
