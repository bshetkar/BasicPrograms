package arrayprograms;

public class SecondLagerstElement {
	public static void main(String[] args) {
		int[] a = { 7, 3, 4, 9, 9 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * System.out.println("second largest element:" + a[1] + ""); }
		 */
		// System.out.println("");

		int i = a.length - 1;
		while (a[i] == a[i - 1]) {
			i--;
		}
		System.out.println("second max element:" + a[i - 1]);

	}

}
