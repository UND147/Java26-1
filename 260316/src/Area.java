import java.util.*;
public class Area { // 도형의 면적
	static double dArea;
	final static double PI = 3.14;
	public static double getAreaTriangle(int iWidth, int iHeight) {
		dArea = ((double) iWidth * (double) iHeight) / 2;
		return dArea;
	}
	public static double getAreaCircum(double dRadius) {
		dArea = dRadius * dRadius * PI;
		return dArea;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Area triangle = new Area();
//		triangle.iTest = scanner.nextInt();
//		System.out.println(triangle.iTest);
//		iWidth = 3;
//		iHeight = 8;
//		dRadius = 4.0; // 4 > casting 
		System.out.println("가로, 높이, 반지름 입력");
//		System.out.println("가로길이 입력");
		int iWidth = scanner.nextInt();
//		System.out.println("높이 입력");
		int iHeight = scanner.nextInt();
//		System.out.println("원 반지름 입력");
		double dRadius = scanner.nextDouble();
		System.out.println("삼각형의 면적 : " + Area.getAreaTriangle(iWidth, iHeight));
		System.out.println("원의 면적 : " + Area.getAreaCircum(dRadius));
		scanner.close();
	}
}
