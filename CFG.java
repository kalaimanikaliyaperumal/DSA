..package src;

import java.util.Scanner;

class WavePrint {

	public static int R = 5;
	public static int C = 4;

	// Function to print wave
	// Form for a given matrix
	public static void WavePrint(int m, int n, int[][] arr) {

		// Loop to traverse matrix
		for (int j = 0; j < n; j++) {

			// If the current column
			// is even indexed, print
			// it in forward order
			if (j % 2 == 0) {
				for (int i = 0; i < m; i++) {
					//System.out.println("i value:" + i);
					//System.out.println("j value:" + j);
					System.out.print(arr[i][j] + " ");
				}
			}

			// If the current column
			// is odd indexed, print
			// it in reverse order
			else {
				for (int i = m - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

	// Driver Code
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int rowSize = sc.nextInt();

		int colSize = sc.nextInt();

		int[][] arr = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				// System.out.println("i value:" + i);
				// System.out.println("j value:" + j);
				arr[i][j] = sc.nextInt();
				//System.out.print(arr[i][j] + " ");
			}
		}
		
		int R = arr.length;
		int C = arr[0].length;

		WavePrint(R, C, arr);
	}
}
