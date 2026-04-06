import java.util.Scanner;

public class Loop2 {
	
	//구구단 : void gugudan(){}
	static void gugudan() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("\n"+dan+"단 >");
			for(int j=1; j<=9; j++) {
				System.out.print(dan+"x"+j+"="+(dan*j)+"\t");
			}
		}
		System.out.println();
	}
	
	 //구구단 2 : void gugudan(int dan){}
	static void gugudan(int dan){
		for(int j=1; j<=9; j++) {
			System.out.print(dan+"x"+j+"="+(dan*j)+"\t");
		}
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		gugudan(); //구구단 2~9단 출력
		
		// 단(dan)을 입력 받아서 해당하는 단의 구구단 출력하기
		System.out.print("정수(2~9) 단을 입력 : ");
		int dan = sc.nextInt();
		gugudan(dan);
		
	}
}


