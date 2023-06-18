
public class PrintAllPalindrome {

	public PrintAllPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "NAMAN";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length() + 1; j++) {
				if (isPalindrome(input.substring(i, j))) {
					System.out.println(input.substring(i, j));
				}
			}
		}

	}

	private static boolean isPalindrome(String str) {
		int low = 0;
		int high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

//	private static boolean isPalindrome(String substring) {
//		// TODO Auto-generated method stub
//		int length = substring.length();
//		int low = 0;
//		int high = length;
//		boolean ans = true;
//
//		while (low <= high) {
//			String s1 = substring.substring(low, low+1);
//			String s2 = substring.substring(high-1, high);
//			int output = s1.compareTo(s2);
//			if (output == 0) {
//				ans = true;
//			} else {
//				ans = false;
//				break;
//			}
//			low++;
//			high--;
//		}
//		return ans;
//	}

}
