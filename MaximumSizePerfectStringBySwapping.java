import java.util.Scanner;

public class MaximumSizePerfectStringBySwapping {

	public MaximumSizePerfectStringBySwapping() {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Initialize the number of swap possible
		int k = sc.nextInt();
		// Get the input String which needs to be calculated
		String input = sc.next();

		// Initialize the Character a
		char a = 'a';
		// Initialize the Character b
		char b = 'b';
		// Call the method and store the return value in aFlip variable
		int aFlip = findMaximumSizePerfectString(a, input, k);
		// Call the method and store the return value in bFlip variable
		int bFlip = findMaximumSizePerfectString(b, input, k);
		// Find the maximum between aFlip and bFlip and store in maxSizePerfectString
		int maxSizePerfectString = Math.max(aFlip, bFlip);
		// Return the maxSizePerfectString value
		System.out.println("maxSizePerfectString: " + maxSizePerfectString);
		sc.close();
	}

	private static int findMaximumSizePerfectString(char ch, String input, int k) {

		// Initialize the starting index value as 0
		int si = 0;
		// Initialize the ending index value as 0
		int ei = 0;
		// Initialize the ans value as 0
		int ans = 0;
		// Initialize the flip value as 0
		int flip = 0;

		while (ei < input.length()) {
			if (input.charAt(ei) == ch) { // Window grow
				flip++;
			}
			while (flip > k && si <= ei) { // Window Shrink
				if (input.charAt(si) == ch) {
					flip--;
				}
				si++;

			}
			ans = Math.max(ans, (ei - si) + 1); // Calculate answer
			ei++;

		}
		// Return the final ans value
		System.out.println("max possible perfect string length: " + ans);
		return ans;
	}
}
