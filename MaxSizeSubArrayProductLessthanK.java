import java.util.Scanner;

public class MaxSizeSubArrayProductLessthanK {

	public MaxSizeSubArrayProductLessthanK() {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Get the Size of the array
		int size = sc.nextInt();
		// Get the Product value to be checked
		int k = sc.nextInt();
		// Initialize the input array
		int[] input = new int[size];
		// Loop until the size value less than i and get the input
		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		// Initialize starting index as 0
		int si = 0;
		// Initialize ending index as 0
		int ei = 0;
		// Initialize product value as 1
		int p = 1;
		// Initialize ans variable as 0 which will return the final result
		int ans = 0;

		while (ei < input.length) { // Window Grow
			p = p * input[ei];
			while (p > k && si <= ei) { // Window Shrink
				p = p / input[si];
				si++;
			}
			ans = Math.max(ans, (ei - si) + 1); // Calculate the answer
			ei++;

		}
		// Return the final ans
		System.out.println("max sub array size:" + ans);
		// Close the scanner object
		sc.close();
	}
}
