package allpatternprograms;

public class Pattern12 {
	public static void main(String[] args) {
		int rows = 4;
		int count = 1;
		int i;
		for (i = 1; i<=4; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k =1; k <=i; k++) {
				if (i == 1 || i == 2) {
					System.out.print(" " + count++ + "");
				} else {
					if (k == 1 || k == i) {
						System.out.print(" " + count++ + " ");
					} else {
						System.out.print("* ");
					}

				}
			}
			System.out.println();
		}
		for (i = 1; i <=rows; i++) {
			System.out.print("" + count++ + " ");
		}
	}

}
