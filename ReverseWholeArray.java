import java.util.*;

public class ReverseWholeArray {
	public static void main(String args[]) {
		// creating a Scanner class object
		Scanner sc = new Scanner(System.in);
		// now take a input of size of an array
		int size = sc.nextInt();
		// declare or creating an array with size
		int[] arr = new int[size];
		// we are initializing an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// just call the naive approach method for reverse a whole array
		// arr = naiveApproachReverseArray(arr);

		// just call the better appraoch method for reverse an array.
		betterApproachReverseArray(arr);
		// printing the whole array
		for (int obj : arr) // for each loop
		{
			System.out.print(obj + " ");
		}
	}

	// Two pointer approach
	public static void betterApproachReverseArray(int[] arr) {
		// just create a first pointer and give it as 0 index
		int first = 0;
		// just create a second pointer and give it as arr.length-1 index means last
		// index of an array
		int last = arr.length - 1;

		// Two pointer approach with while loop iterating
		while (first < last) {
			// swapping will occur next 3 lines
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			// we just increase the pointer index by ++
			first++;
			// we just decrease the pointer index by --
			last--;
		}
	}

	// Naive Approach way to do a problem in which we require an extra space i.e
	// O(size)
	public static int[] naiveApproachReverseArray(int[] arr) {
		// creating one more array for storing the array element in reverse order.
		int[] rev_arr = new int[arr.length]; // O(size) space complexity.
		for (int i = 0; i < arr.length; i++) {
			// just store the element
			rev_arr[arr.length - 1 - i] = arr[i];
		}
		// return the reverse array
		return rev_arr;

	}
}