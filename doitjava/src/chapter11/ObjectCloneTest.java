package chapter11;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return " = " + x +"," + "y = " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "������ " + point + "�̰�, " + "�������� " + radius + "�Դϴ�";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}