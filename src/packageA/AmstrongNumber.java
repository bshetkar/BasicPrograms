package packageA;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num = 454;
		int sum = 0;
		int rem;
		while (num != 0) {
			rem = num % 10;
			rem = rem * rem * rem;
			num = num / 10;
			sum = sum + rem;		
			System.out.println(sum);
		}

		/*
		 * int sum=0; int rem; while(num!=0) { rem= num%10; rem=rem*rem*rem; num=
		 * num/10; sum=sum+rem; System.out.println("Amstrong number is:"+sum); }
		 */
	}

}
