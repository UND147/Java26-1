import java.util.*;
public class ProfileInOutPrg2 {
	private int iAge;
	private String sName, sLocal;
	private boolean bIsStudent;
	public ProfileInOutPrg2() {
		Scanner scInfo = new Scanner(System.in);
	
		System.out.println("이름 거주지 나이 학생(true/false) 입력하시오");
		System.out.println("(단, 거주지는 시 구 동 까지 입력하시오");
		
		sName = scInfo.nextLine();
		sLocal = scInfo.nextLine();
		iAge = scInfo.nextInt();
		bIsStudent = scInfo.nextBoolean();
		
		scInfo.close();
	}
	public void getStudentInfo() {
		System.out.println(sName + ", " + sLocal + ", " 
						+ iAge + ", 학생 " + bIsStudent + "입니다");
	}
	public static void main(String[] args) {
		ProfileInOutPrg2 student = new ProfileInOutPrg2();
		student.getStudentInfo();
	}
}	
