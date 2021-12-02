package arrayprograms;

public class Task1 {
	public static void main(String[] args) {

		int[] a = { 3, 4, 1, 5, 2 };
		//int count = 0; // 0,0,2,0,3

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) { // 0<3=0, 4>3=0, 1>4=2,5>1=0,2>5=3
					
			     System.out.println(count);
			     count--;
					
				} else {
					count++;
					//System.out.println(count);
				}
				// System.out.println(count);
			}

		}

	}

}
