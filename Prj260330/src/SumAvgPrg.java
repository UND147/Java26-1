import java.util.Scanner;
public class SumAvgPrg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1~n까지의 합, 평균, n은 정수로 입력
		int iNo, iSum;
		double dAvg;
		
		iNo = 0;
		iSum = 0;
		
		System.out.print("1부터 N까지 더할, 정수 N 입력 : ");
		iNo = scan.nextInt(); //n 입력
		
		for(int i=1; i<=iNo; i++) {
			iSum = iSum + i;
		}
		
		dAvg = (double) iSum / iNo;
		
		System.out.println("합 : " + iSum);
		System.out.println("평균 : " + dAvg);
	}
}
