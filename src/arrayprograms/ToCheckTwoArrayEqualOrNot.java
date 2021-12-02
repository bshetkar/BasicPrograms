package arrayprograms;

import java.util.Arrays;

public class ToCheckTwoArrayEqualOrNot {
	public static void main(String[] args) {
		int[] a= {2,3,4};
		int[] a1= {1,3,2};
		System.out.println(Arrays.equals(a1, a));
		
		int[] a2= {1,3,2};
		System.out.println(Arrays.equals(a1, a2));
		
		
		System.out.println(a.equals(a1));
		System.out.println(a1.equals(a2));
	}

}
