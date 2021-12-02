package arrayprograms;

public class MultiplicationOfTwoArray {
	public static void main(String[] args) {
		int[] a = {2,4,5};
		int result[] = new int[a.length];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				result[i] = a[i] * a[j];
				//System.out.print(result[i]+ " ");
				if (max < result[i]) {
					max = result[i];
				}
			}
		}
		System.out.println(result[1]);
	}

}
