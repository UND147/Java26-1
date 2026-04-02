
public class Triangle {
	// 면적 구하기 Class Area로 변경
	final static double PI = 3.14;
	public static double getAreaTriangle(double dWidth, double dHeight) {
		double dArea = (dWidth * dHeight) / 2;
		return dArea;
	}
	// 각 도형별 메서드
	public static void main(String[] args) {
		double dWidth, dHeight, dArea;
		
		dWidth = 3;
		dHeight = 5;
		dArea = Triangle.getAreaTriangle(dWidth, dHeight);
		
		System.out.println("제작 : 정주호");
		System.out.println("주제 : 면적 구하기 \n");
		System.out.println("삼각형의 면적 : " + dArea);
		System.out.println("삼각형의 면적 : " + Triangle.getAreaTriangle(dWidth, dHeight));
		System.out.println("원의 면적 : " + (dWidth * dWidth * PI));
	}
}
