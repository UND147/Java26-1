// super()를 이용하여 ColorPoint 클래스의 생성자에서 서브 클래스 Point 의 생성자를 호출
class Point{
	private int x, y;
	Point(){
		this.x = this.y = 0;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}	
}

class ColorPoint extends Point {
	private String color;
	ColorPoint(){
		
	}
	ColorPoint(int x, int y){
		super(x,y);
	}
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

}
public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
		ColorPoint cp2 = new ColorPoint(100,200);
		cp2.showColorPoint();
		ColorPoint cp3 = new ColorPoint(300, 400);
		cp3.showPoint();
		ColorPoint cp4 = new ColorPoint();
		cp4.showColorPoint();
	}

}
