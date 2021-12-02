package packageA;

public class Pratice {
	static int i = 10;

	static {
		System.out.println("im static block");
	}

	public static void a1() {
		System.out.println("a1 method");
	}

	public static void main(String[] args) {
		System.out.println(i);
		Pratice.a1();

		/*
		 * String a = "Love"; String b = "You"; System.out.println("Before swap: " + a +
		 * " " + b); a = a + b; System.out.println(a); b = a.substring(0, a.length() -
		 * b.length()); a = a.substring(b.length()); System.out.println("After : " + a +
		 * " " + b);
		 */
	}
}
