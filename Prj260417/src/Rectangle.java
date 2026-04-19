import org.w3c.dom.css.Rect;

public class Rectangle {
	int width;
	int height;
	int area;
	int x = 0, y = 0; // 위치 x, y
	String color;

	public Rectangle() {
		this.width = 0;
		this.height = 0;
		this.x = x;
		this.y = y;
	}

	// overloading
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	void println() {
		System.out.println("x: " + x + " y: " + y);
		System.out.println("w: " + width + " h: " + height);
		System.out.println("color: " + color);
		System.out.println("===========");
	}

	int getArea() {
		area = width * height;
		return area;
	}

	int getArea(int width, int height) {
		area = width * height;
		return area;

	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.width = 4;
		rect.height = 5;
		rect.println();
		Rectangle rect2 = new Rectangle(20, 30);
		rect.println();
		Rectangle rect3 = new Rectangle(10, 4, "Red");
		rect3.x = 100;
		rect3.y = 250;
		rect.println();
	}
}