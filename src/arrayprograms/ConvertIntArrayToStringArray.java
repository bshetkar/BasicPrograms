package arrayprograms;

import java.util.Arrays;

public class ConvertIntArrayToStringArray {
	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 55 };
		// convert int to string array
		String[] s = new String[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			s[i] = String.valueOf(a[i]);
		}
		for (String string : s) {
			System.out.println(string);
		}
	}
}
