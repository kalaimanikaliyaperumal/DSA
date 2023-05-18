import java.util.*;

public class MinElementIndex {
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
		// we just call a fuction and store the return value to its min_idx
		int min_idx = minElement(arr);
		// just print the min_ind of an element present in array
		System.out.print(min_idx);
	}

	// function which help us to do a operation for minElement.
	public static int minElement(int[] arr) {
		// Now just assum that min element is present on the 0 index.
		int min_idx = 0;
		// because we are assum the min element present on 0th index that's why we start
		// our for loop from 1th index
		for (int i = 1; i <= arr.length - 1; i++) {
			// now if the curr element is less the previous element then we can update the
			// idx of min_idx variable
			if (arr[i] < arr[i - 1]) {
				min_idx = i;
			}
		}
		// finally we return the min_idx value.
		return min_idx;
	}

}