import java.util.Scanner;
public class ArraySumPrg {
	public static void main(String[] args) {
		//배열 선언, 최대, 최소, 평균
		Scanner scanner = new Scanner(System.in);
		int iNo, iData, iMax, iMin;
		int iSum = 0;
		double dAvg;
		
		System.out.print("몇개의 정수로 배열을 생성 : ");
		iData = scanner.nextInt();
		int iNoArray[] = new int[iData];
		iNo = 0;
		System.out.print("배열에 넣을 정수를 입력 : ");
		for(int i=0; i<iNoArray.length; i++) {
			iNo = scanner.nextInt();
			iNoArray[i] = iNo;
			iSum = iSum + iNoArray[i];
		}
		
		iMax = iNoArray[0];
		iMin = iNoArray[0];
		for(int i=0; i<iNoArray.length; i++) {
			if(iNoArray[i]>iMax) {
				iMax = iNoArray[i];
			} 
			if(iNoArray[i]<iMin) {
				iMin = iNoArray[i];
			}
			
		}
		dAvg=(double)iSum/iNoArray.length;

	System.out.println("배열의 합 : "+iSum+"\n배열의 최댓값 : "+iMax+
					   "\n배열의 최솟값 : "+iMin+"\n배열의 평균 : "+dAvg);
}

}
