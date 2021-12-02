package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ConvertArrayToTreeSet {
	public static void main(String[] args) {

		Integer[] arr = { 3, 5, 6, 78, 9 };
		ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
		TreeSet<Integer> t = new TreeSet(list);
		for (Integer integer : t) {
			System.out.println(integer);
		}
	}
}
