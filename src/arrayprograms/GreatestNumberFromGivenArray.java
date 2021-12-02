package arrayprograms;

public class GreatestNumberFromGivenArray {
	public static void main(String[] args) {
		String[] s = { "2", "34", "3", "97", "9", "76", "45", "4" };
		String temp = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				String firstloop = s[i] + s[j];
				String scecondloop = s[j] + s[i];
				int comparator = firstloop.compareTo(scecondloop);
				if (comparator < 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
}
