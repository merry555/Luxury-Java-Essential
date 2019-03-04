package 실습;


class Point {
	int x,y;
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

public class _5_1 extends Point {
	String color;
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() {
		System.out.println(color);
		showPoint();
		}
	public static void main(String[] args) {
		_5_1 cp = new _5_1();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}

