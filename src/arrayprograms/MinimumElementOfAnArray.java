package arrayprograms;

public class MinimumElementOfAnArray {
	public static void main(String[] args) {
		int a[] = { 23, 45, 67, 87, 65, 11 };
		int min = 0;
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) {
		 * if (a[i] < a[j]) { min = a[i]; a[i] = a[j]; a[j] = min; } } }
		 * System.out.println("minimum element is:" + min);
		 */

		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length-1; j++) {
				if (a[i] < a[j]) {

					min = a[i];
					a[i] = a[j];
					a[j] = min;
				}
			}
		}
		System.out.println("min value of a is:" + min);

	}

}
