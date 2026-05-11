import java.util.Arrays;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract int sum(int[] a);
	public abstract double average(int sum, int[] a);
}
public class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int sum, int[] a) {
		return (double)sum/a.length;
	}
	@Override
	public int sum(int[] a) {
		int sum = 0;;
		for(int n:a) {
			sum += n;
		}
		return sum;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		int[] arr = {2,4,6};
		System.out.println("합: " + c.add(2, 3));
		System.out.println("차: " + c.subtract(2, 3));
		System.out.println(Arrays.toString(arr)+"의 합: " + c.sum(arr));
		System.out.println(Arrays.toString(arr)+"의 평균: " +c.average(c.sum(arr),arr));
	}
}