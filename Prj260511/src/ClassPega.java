interface 새{
	public long SPEED = 80;
	public void fly();
}
interface 말{
	public void run();
}
class 페가수스 implements 새, 말 {

	@Override
	public void run() {
		System.out.println("대륙을 달린다!");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 난다!");
		
	}
	
}
public class ClassPega {

	public static void main(String[] args) {
		페가수스 pega = new 페가수스();
		pega.fly();
		pega.run();

	}

}
