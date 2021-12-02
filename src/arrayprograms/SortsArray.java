package arrayprograms;

import java.util.Arrays;

public class SortsArray {
	public void sortArray() {
		int[] a = { 4, 7, 8, 9, 0 };
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.print(a[i]+ " ");
		}
		
	}
	public static void main(String[] args) {
		SortsArray s= new SortsArray();
		s.sortArray();
	
	}
}
