package packageA;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int result;
		for (int i = 0; i <= 10; i++) {
			result = a + b;
			System.out.println("result:" + result);
			a = b;
			b = result;
		}
		 System.out.println(b);
	}

}
