package packageA;

public class MultiplePalidromeNumber {
	public static void main(String[] args) {
		int num[] = { 454, 123, 323, 657, 876 };
		int p[]= new int[num.length];
		for(int i=0; i<p.length;i++)
		{
			p[i]=num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			int rev = 0;
			int rem=0;
			while (num[i] > 0) {
				rem = num[i] % 10;
				num[i]=num[i]/10;
				rev = rev * 10 + rem;
			}
			if (p[i] == rev) {
				System.out.println("palidrome number"+p[i]);
			}else
			{
				System.out.println("not palidrome:"+p[i]);
			}
		}
	}
}
