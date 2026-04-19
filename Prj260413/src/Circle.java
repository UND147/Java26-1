import java.util.Scanner;
public class Circle {
	int radius;
	String name;
	
	Circle(){}// 생성자 오버로딩 활용해서 c1 c2 c3 인스턴스 생성하기
	Circle(int radius){
		this.radius = radius;
	}
	Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	public double getArea() {
		double area;
		area = 3.14 * (double) radius * radius;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle pizza = new Circle(); // Circle 클래스의 pizza 인스턴스 생성
		System.out.print("피자의 반지름 입력: ");
		pizza.radius = sc.nextInt();
		System.out.print("피자의 이름 입력: ");
		pizza.name = sc.next();
		
		Circle donut = new Circle(); // Circle 클래스의 donut 인스턴스 생성
		System.out.print("도넛의 반지름 입력: ");
		donut.radius = sc.nextInt();
		System.out.print("도넛의 이름 입력: ");
		donut.name = sc.next();
		System.out.println();
		System.out.println(pizza.name + "의 면적은: " + pizza.getArea());
		System.out.println(donut.name + "의 면적은: " + donut.getArea());
		System.out.println();
		//c1 객체 생성 및 정보 출력
		Circle c1 = new Circle();
		c1.radius = 11;
		c1.name = "C1";
		System.out.println(c1.name + "의 면적은: " + c1.getArea());
		//c2 객체 생성 및 정보 출력
		Circle c2 = new Circle();
		c2.radius = 22;
		c2.name = "C2";
		System.out.println(c2.name + "의 면적은: " + c2.getArea());
	}
}
