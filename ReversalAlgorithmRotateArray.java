import java.util.*;

public class ReversalAlgorithmRotateArray {
	public static void main(String args[]) {
		// just create an object
		Scanner sc = new Scanner(System.in);
		// take an input of a array size
		int n = sc.nextInt();
		// just declare and create an array
		int[] arr = new int[n];
		// initialize an array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// no of element to be rotated
		int k = sc.nextInt();
		// just add this updation of K value because K is in out of range so we need to
		// be in range
		k = k % arr.length;
		// calling the function
		reverseInRange(arr, 0, n - k - 1); // This calling is for reverse the starting N-k elements
		reverseInRange(arr, n - k, n - 1); // This calling is for reverse the end k elements
		reverseInRange(arr, 0, n - 1); // This calling is for reverse the N elements (whole) array

		// just print the elements of the array
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}

	public static void reverseInRange(int[] arr, int start, int end) {
		// Two pointer appraoch
		while (start < end) {
			// swapping the elements with start and end pointer
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			// just increase the start pointer
			start++;
			// just decrease the end pointer
			end--;
		}
	}
}