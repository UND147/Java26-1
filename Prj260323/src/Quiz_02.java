import java.util.Scanner;
public class Quiz_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iHeight;
		String sResult = "";
		
		System.out.println("키 입력");
		iHeight = sc.nextInt();
		
		sResult = (iHeight >= 120) ? "가능" : "불가능";
		
		System.out.println("키가 " + iHeight + "cm 이므로 탑승 " + sResult + "합니다");
	
	}
}
