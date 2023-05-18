import java.util.*;

public class LinearSearch {
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
		// taking an input of the target element which we search in an array by linear
		// search
		int target = sc.nextInt();
		// we need to call the function to find the index of the target element
		int index = linearSearch(arr, target);
		// just print the index of the target element.
		System.out.print(index);
	}

	public static int linearSearch(int[] arr, int target) {
		// just iterate the whole array
		for (int i = 0; i < arr.length; i++) {
			// if the element is find then return the index value
			if (arr[i] == target) {
				return i;
			}
		}
		// if the target element is not present in an array then return -1
		return -1;
	}
}