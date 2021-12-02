package arrayprograms;

import java.util.Scanner;

public class SecondMaxmiumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int first = 0;
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == 0) {
			System.out.println("second maxmium element are not present:");
		} else {
			System.out.println("Second maxmium element are:" + second);
		}
	}

}
