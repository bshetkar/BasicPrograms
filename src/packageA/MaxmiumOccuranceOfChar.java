package packageA;

public class MaxmiumOccuranceOfChar {
	public void maxOccuranceOfGivenChar(String s) {
		for (int i = 0; i < s.length();) {
			char c = s.charAt(i);
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (c == s.charAt(j)) {
					count++;
				}
			} // s=s.replaceAll(s.charAt(i)+"","");
			if (count > 1) {
				System.out.println(c + "=" + count);
			}
		}
	}

	public static void main(String[] args) {
		MaxmiumOccuranceOfChar m = new MaxmiumOccuranceOfChar();
		m.maxOccuranceOfGivenChar("hagyasgreexx");
	}

}
