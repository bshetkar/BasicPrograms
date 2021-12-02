package arrayprograms;

public class MissingNoOfElement1 {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6, 7, 10 };
		int diff = a[0] - 0;
		for (int i = 0; i < a.length; i++) {
			if (diff != (a[i] - i)) {
				while (diff < a[i] - i) {
					System.out.println(diff + i + " ");
					diff++;
				}
			}
		}

	}
}