package arrayprograms;

public class FindOccuranceOfAnInteger {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3, 1, 5, 6, 5, 5, 7 };
		int visited = -1;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = visited;
				}
			}
			if (b[i] != visited)
				b[i] = count;
		}
		for (int i = 0; i < a.length; i++) {
			if (b[i] != visited)
				System.out.println("  " + a[i] + " " + b[i]);
		}

	}

}
