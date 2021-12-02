package arrayprograms;

import java.util.Arrays;
import java.util.*;

public class ShortDuplicateElement {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 1, 3, 4, 2, 5, 6, 5 };
		HashSet s = new HashSet(Arrays.asList(a));
		System.out.println(s);
	}
	/*
	 * Integer[] x = { 12, 23, 13, 12, 17, 23, 89 }; // List<Integer>elements=
	 * Arrays.asList(x);
	 * 
	 * HashSet hs = new HashSet<>(Arrays.asList(x)); System.out.println(hs);
	 * 
	 * }
	 */

}