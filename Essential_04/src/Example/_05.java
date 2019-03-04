package Example;

public class _05 {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza,waffle);
		if(res==true)
			System.out.println("pizza와 waffle크기 같음");
		else
			System.out.println("pizza와 waffle크기 다름");
		
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza,waffle);
		if(res==true)
			System.out.println("pizza와 waffle크기 같음");
		else
			System.out.println("pizza와 waffle크기 다름");
		
	}
}

class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return this.radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class CircleManager {
	static void copy(Circle scr, Circle dest) {
		dest.setRadius(scr.getRadius());
	}
	static boolean equals(Circle a, Circle b) {
		if(a.getRadius()==b.getRadius()){
			return true;
		} else
			return false;
	}
}
