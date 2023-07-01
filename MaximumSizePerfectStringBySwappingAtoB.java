import java.util.Scanner;

public class MaximumSizePerfectStringBySwappingAtoB {

	public MaximumSizePerfectStringBySwappingAtoB() {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Initialize the number of swap possible
		int k = sc.nextInt();
		// Get the input String which needs to be calculated
		String input = sc.next();
		// Initialize the starting index value as 0
		int si = 0;
		// Initialize the ending index value as 0
		int ei = 0;
		// Initialize the ans value as 0
		int ans = 0;
		// Initialize the flip value as 0
		int flip = 0;

		while (ei < input.length()) {
			if (input.charAt(ei) == 'a') { // Window grow
				flip++;
			}
			while (flip > k && si <= ei) { // Window Shrink
				if (input.charAt(si) == 'a') {
					flip--;
				}
				si++;

			}
			ans = Math.max(ans, (ei - si) + 1); // Calculate answer
			ei++;

		}
		// Return the final ans value
		System.out.println("max possible perfect string length:" + ans);
		sc.close();
	}
}
