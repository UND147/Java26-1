import java.util.Scanner;

public class ArraySumPrg2 {
	static int getArraySum(int iNoArray[]) {
		int iSum = 0;
		for(int i=0; i<iNoArray.length; i++) {
			iSum = iSum + iNoArray[i];
		}
		return iSum;
	}
	static int getArrayMax(int iNoArray[], int iMax) 
	{
		for(int i=0; i<iNoArray.length; i++) {
			if(iNoArray[i]>iMax) {
				iMax = iNoArray[i];
			}
		}
		return iMax;
	}
	static int getArrayMin(int iNoArray[], int iMin) 
	{
		for(int i=0; i<iNoArray.length; i++) {
			if(iNoArray[i]<iMin) {
				iMin = iNoArray[i];
			}
		}
		return iMin;
	}

	public static void main(String[] args) {
		//배열 선언, 최대, 최소, 평균
		Scanner scanner = new Scanner(System.in);
		int iNo, iData, iMax, iMin, iSum;
		double dAvg;
		
		System.out.print("몇개의 정수로 배열을 생성 : ");
		iData = scanner.nextInt();
		int iNoArray[] = new int[iData];
		
		iNo = 0;
		System.out.print("배열에 넣을 정수를 입력 : ");
		for(int i=0; i<iNoArray.length; i++) {
			iNo = scanner.nextInt();
			iNoArray[i] = iNo;
		}
		iSum = getArraySum(iNoArray);
		iMax = iNoArray[0];
		iMin = iNoArray[0];
		iMax = getArrayMax(iNoArray, iMax);
		iMin = getArrayMin(iNoArray, iMax);
		dAvg=(double)iSum/iNoArray.length;

	System.out.println("배열의 합 : "+iSum+"\n배열의 최댓값 : "+iMax+
					   "\n배열의 최솟값 : "+iMin+"\n배열의 평균 : "+dAvg);
}

}
