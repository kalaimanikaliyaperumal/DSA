import java.util.*;

public class BetterApproachKrotateElement {
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
		// calling the function
		rotate(arr, k);
		// printing the array
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}

	public static void rotate(int[] arr, int k) {

		while (k-- > 0) {
			// just save the last element to the temporary variable
			int temp = arr[arr.length - 1];
			// just shift all the element by one - one index
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			// now just save the temporary variable element to the front index i.e. 0
			arr[0] = temp;

			// k--;
		}
	}
}