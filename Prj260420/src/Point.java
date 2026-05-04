
public class Point {
	int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void show() {
		System.out.println("("+x+","+y+")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.show();
		Point p2 = new Point(5, 10);
		p2.show();
		
	}

}
