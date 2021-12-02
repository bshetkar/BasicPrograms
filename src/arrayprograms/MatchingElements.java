package arrayprograms;

public class MatchingElements {
	public static void main(String[] args) {
		int[] a = { 1111, 2222, 3333, 4444 };
		int[] b = { 2222, 3333, 4444, 5555 };
		int[] uncommon = new int[4];


		// O/P= {2222,4444,3333};
		// {1111};
		// {5555};
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					System.out.println("common" + a[i]);
				}
			}
			if(flag==false)
			{
				uncommon[i]=a[i];
				System.out.println("uncommon:" +uncommon[i]);
			}
			{

			}
		}
	}

}
