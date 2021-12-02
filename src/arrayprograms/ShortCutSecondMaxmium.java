package arrayprograms;

import java.util.*;

public class ShortCutSecondMaxmium {
	public static void main(String[] args) {

		Integer[] a = { 21, 13, 11, 7, 17, 12, 21, 19, 10, 21 };
		TreeSet<Integer> ts = new TreeSet(Arrays.asList(a));
		System.out.println(ts.lower(ts.last()));

		/*
		 * Integer[] s = { 11, 22, 3, 4, 56, 22, 76 }; TreeSet<Integer> t = new
		 * TreeSet(Arrays.asList(s)); System.out.println(t.lower(t.last()));
		 */
	}

}
