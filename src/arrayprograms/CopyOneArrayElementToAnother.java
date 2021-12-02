package arrayprograms;

public class CopyOneArrayElementToAnother {
	public static void main(String[] args) {
		int temp = 0;
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int b[] = new int[6];
		for (int i = 0; i < a.length; i++) {
			b[temp] = a[i];
			System.out.println(b[temp]);
		}
	}
}
