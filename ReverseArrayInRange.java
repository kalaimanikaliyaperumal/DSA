import java.util.*;

public class ReverseArrayInRange {
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
		// take an input of starting range
		int startingIndex = sc.nextInt();
		// take an input of ending range
		int endingIndex = sc.nextInt();

		// just call the better appraoch method for reverse an array.
		betterApproachReverseArray(arr, startingIndex, endingIndex);
		// printing the whole array
		for (int obj : arr) // for each loop
		{
			System.out.print(obj + " ");
		}
	}

	// Two pointer approach
	public static void betterApproachReverseArray(int[] arr, int startingIndex, int endingIndex) {
		// just create a first pointer and give it as starting range of the array
		int first = startingIndex;
		// just create a second pointer and give it as ending range of the array
		int last = endingIndex;
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

}