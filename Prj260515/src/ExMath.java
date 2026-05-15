import java.lang.Math;
import java.util.Scanner;
import java.io.BufferedReader;
class Lotto {
	int[] lo = new int[6];
	int cnt = 0;
	
	void getLotto() {
		cnt++;
		for(int i=0; i<lo.length; ++i) {
			lo[i] = (int)(Math.random()*45+1); // 0~45까지
		}
	}

	void print() {
		System.out.println("<<당첨을 축하합니다>>");
		for (int j = 0; j < lo.length; j++) {
			System.out.print(lo[j] + " ");
		}
		System.out.println();
	}
	
}
public class ExMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("이름을 입력하세요");
		name = sc.next();
		Lotto lo = new Lotto();
		lo.getLotto();
		lo.print();
	
	}

}
