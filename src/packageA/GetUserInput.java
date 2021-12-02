package packageA;

import java.util.Scanner;

public class GetUserInput {
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int sum = 0;
			sum = sum + i;
			System.out.println(sum);
		}

	}

}
