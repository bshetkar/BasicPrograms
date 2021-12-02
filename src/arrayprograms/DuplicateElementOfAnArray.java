package arrayprograms;

public class DuplicateElementOfAnArray {
	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 2, 6, 3, 2, 7, 8 ,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println("print duplicate element: " + a[i]);
				}
			}
		}
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) { if(a[i]==a[j]
		 * && (i!=j)) { System.out.println("Duplicate element is:"+a[i]); }
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
