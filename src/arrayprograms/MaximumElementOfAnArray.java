package arrayprograms;

public class MaximumElementOfAnArray {
	public static void main(String[] args) {
		
		int a[]= { 4, 6, 43, 67, 87, 22 };
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maxmium element:" +max);
		/*
		 * int max = 0; int a[] = { 4, 6, 43, 67, 87, 22 }; for (int i = 0; i <
		 * a.length; i++) { if (a[i] > max) { max = a[i]; } }
		 * System.out.println("max value is:" + max);
		 */
	}

}
