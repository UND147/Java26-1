import testpack.tools;

interface 자동차{
	void run();
}
interface 배 {
	void navigation();
}
interface 수륙양용 extends 자동차, 배{
	void floating();
}
class InterfaceExam implements 수륙양용{
	@Override
	public void run() {
		System.out.println("육지를 달리는 능력");
	}
	@Override
	public void navigation() {
		System.out.println("바다를 항해하는 능력");
	}
	@Override
	public void floating() {
		System.out.println("공중에 떠있는 능력");
	}
}
public class InterfaceExe  {
	public static void main(String[] args) {
		InterfaceExam obj = new InterfaceExam();
		obj.run();
		obj.navigation();
		obj.floating();

	}
	
}
