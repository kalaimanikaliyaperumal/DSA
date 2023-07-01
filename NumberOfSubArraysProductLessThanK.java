import java.util.Scanner;

public class NumberOfSubArraysProductLessThanK {

	public NumberOfSubArraysProductLessThanK() {

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

		while (ei < input.length) {
			p = p * input[ei]; // Window size grow
			System.out.println("product:" + p);
			while (p >= k && si <= ei) {
				p = p / input[si]; // Window Shrink
				si++;
			}
			ans = ans + (ei - si) + 1; // ans calculation
			ei++;
		}
		System.out.println("max sub array size:" + ans);
		sc.close();
	}
}
