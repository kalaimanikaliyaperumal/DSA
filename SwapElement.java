import java.util.*;

public class SwapElement {
	public static void main(String args[]) {
		// Creating an object for scanner
		Scanner sc = new Scanner(System.in);
		// taking a input for a size of array
		int size = sc.nextInt();
		// creating or declaring a array with size
		int[] arr = new int[size];
		// now initialize the array with its elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// take input of first index of array which we want to swap
		int first_index = sc.nextInt();
		// take input of second index of array which we want to swap
		int second_index = sc.nextInt();

		// now we need to call the function to swap the array elements
		swap(arr, first_index, second_index);

		// finally we need to print the whole array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// swapp function which do an operation
	public static void swap(int[] arr, int i, int j) {
		// swapping will done with the help of the extra variable named as temp
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}