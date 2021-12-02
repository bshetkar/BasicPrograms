package allpatternprograms;

public class Pattern11 {
	public static void main(String[] args) {
		int rows = 5;
		int count = 1;
		int i;
		for (i = 1; i <= rows - 1; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (i == 1 || i == 2) {
					System.out.print("* ");
				} else {
					if (k == 1 || k == i) {
						System.out.print("* ");
					} else {
						System.out.print(count++ + " ");
					}
				}
			}
			System.out.println();
		}
		for (int m = 1; m <= i; m++) {
			System.out.print(" *");
		}
	}
}
