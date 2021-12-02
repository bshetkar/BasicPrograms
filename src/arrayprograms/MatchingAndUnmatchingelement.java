package arrayprograms;

public class MatchingAndUnmatchingelement {
	int[] a = { 1, 2, 4, 3, 5 };
	int[] b = { 2, 4, 3, 7, 8 };
	int[] temp = new int[5];

	public void matcing() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
		System.out.println();
	}

	public void unmatch() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {// 0,1,2,3
				if (a[i] != b[j]) {
					temp[i] = a[i];
					System.out.println(temp[i]);
					break;
				}
				if (j == b.length - 1) {// 0==3
					// System.out.println(b[j]);
					System.out.println(a[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		MatchingAndUnmatchingelement m = new MatchingAndUnmatchingelement();
		m.matcing();
		m.unmatch();

	}

}
