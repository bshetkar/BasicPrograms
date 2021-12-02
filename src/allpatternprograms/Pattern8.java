package allpatternprograms;

public class Pattern8 {
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 1; i <= 4; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(sum + " ");
				sum++;
			}
			System.out.println();
		}
	}

}
