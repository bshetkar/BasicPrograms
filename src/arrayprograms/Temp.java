package arrayprograms;

public class Temp {
	public static void main(String[] args) {

		int[] a = { 1111, 2222, 3333, 4444 };
		int[] b = { 2222, 3333, 4444, 5555 };
		int[] temp = new int[b.length];
		int[] uncommon = new int[b.length];
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					temp[i] = b[j];
					System.out.println("Duplicate : " + temp[i]);
					// break;
				} else {
					uncommon[i] = b[j];

				}
				if (flag == false) {
					uncommon[i] = a[i];
				}

			}

		}
		for (int i : uncommon) {
			System.out.println(i);
		}
	}
}
