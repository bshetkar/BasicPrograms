package packageA;

public class PalidromePratice {

	public static void main(String[] args) {
		int num = 454;
		int pal = num;
		int rev = 0;
		int rem;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}
		if (pal == rev) {
			System.out.println("palidrome number");
		} else {
			System.out.println(" not palidrome number");
		}
	}

}
