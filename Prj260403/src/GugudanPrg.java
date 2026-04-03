import java.util.Scanner;

public class GugudanPrg {
	private int iDan, iNum, iRes;

	public void ShowGugu(int iNo) {

		for (iNum = 1; iNum <= 9; iNum++) {
			iRes = iNo * iNum;
			System.out.print(iNo + " * " + iNum + " = " + iRes);
			System.out.print("\t");
		}
	}
	public void ShowGugu() {
		for (iDan = 2; iDan <= 9; iDan++) {
			for (iNum = 1; iNum <= 9; iNum++) {
				iRes = iDan * iNum;
				System.out.print(iDan + " * " + iNum + " = " + iRes);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNo = 1;
		GugudanPrg gugudan = new GugudanPrg();
		gugudan.ShowGugu();
		System.out.print("원하는 구구단 단수를 입력: ");
		iNo = sc.nextInt();
		gugudan.ShowGugu(iNo);
	}
}
