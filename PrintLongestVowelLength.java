
public class PrintLongestVowelLength {

	public PrintLongestVowelLength() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "bcccdhhhh";
		int countVal = 0;
		int maxCount = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length() + 1; j++) {
				countVal = getCountForLongestVowel(input.substring(i, j));
			}
			if (countVal > maxCount) {
				maxCount = countVal;
			}
		}

		System.out.println("count val:" + maxCount);

	}

	private static int getCountForLongestVowel(String str) {
		// TODO Auto-generated method stub
		int max = 0;
		int count = 0;
		for (int k = 0; k < str.length(); k++) {
			if (str.charAt(k) == 'a' || str.charAt(k) == 'e' || str.charAt(k) == 'i' || str.charAt(k) == 'o'
					|| str.charAt(k) == 'u') {
				// System.out.println(str.charAt(k));
				count = count + 1;
			} else {
				max = Math.max(max, count);
				count = 0;
			}

		}
		return max;
	}

}
