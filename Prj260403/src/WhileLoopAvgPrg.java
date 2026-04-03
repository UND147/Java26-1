import java.util.Scanner;
public class WhileLoopAvgPrg {
// while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력 (0이 입력되면 종료)
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int iNo = 0, iCount = 0, iSum = 0;
		Double dAvg;
		
		System.out.print("평균을 구할 여러 개의 정수를 입력 (0을 입력하면 종료) : ");
		while((iNo = scanner.nextInt()) != 0) {
			iSum = iSum + iNo;
			iCount ++;
		}
		dAvg = (double) iSum / iCount;
	
		System.out.println("평균 : " + dAvg);
	}

}
