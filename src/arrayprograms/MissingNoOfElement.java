package arrayprograms;

public class MissingNoOfElement {
	public static void main(String[] args) {
		int[] a = {1,2,4,5};
		int sum = 0;
		// total no of element=4;
		// expected no of element=5;
		int element = a.length + 1;
		int totalsum = element * (element + 1) / 2;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("missing element:" + (totalsum - sum));
	}
}
