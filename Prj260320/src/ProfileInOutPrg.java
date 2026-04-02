import java.util.Scanner;
public class ProfileInOutPrg {

	public static void main(String[] args) {
		String sName, sLocal;
		int iAge;
		boolean bIsStudent;
		
		Scanner sInfo = new Scanner(System.in);
		
		System.out.println("이름 거주지 나이 학생(true/false) 입력하시오");
		System.out.println("(단, 거주지는 시 구 동 까지 입력하시오");
		
		sName = sInfo.nextLine();
		sLocal = sInfo.nextLine();
		iAge = sInfo.nextInt();
		bIsStudent = sInfo.nextBoolean();
		
		System.out.println(sName + ", " + sLocal + ", " 
						+ iAge + ", 학생 " + bIsStudent + "입니다");
		sInfo.close();
	}
}
