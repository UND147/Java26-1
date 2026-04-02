import java.util.Scanner;
public class GradePrgSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int iScore, iCase;
		char cGrade = ' ';
		boolean bScholar = false;
		
		System.out.print("성적을 입력: ");
		iScore = scan.nextInt();
		
		iCase = iScore / 10;
		
		switch(iCase) {
		case 10:
			bScholar = true;
		case 9:
			cGrade = 'A';
			break;
		case 8:
			cGrade = 'B';
			break;
		case 7:
			cGrade = 'C';
			break;
		case 6:
			cGrade = 'D';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			cGrade = 'F';
			break;
		}
		System.out.println("당신의 점수: " + iScore + ", 학점: " + cGrade);
		if(bScholar) {
			System.out.println("장학금 100만원 대상자입니다.");
		}
		scan.close();
	}
}
