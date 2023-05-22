import java.util.*;

public class BasicRotateArrayWithKElement {
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
		// call the rotate function to do a operation
		rotate(arr, k);
		// just print the whole array after rotate task
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static void rotate(int[] arr, int k) {
		// create or declare an array of k element size to store the rotated elements
		int[] subarr = new int[k];

		// we just store the rotate element from the original array to the subarray
		for (int i = 0; i < k; i++) {
			subarr[i] = arr[arr.length - k + i];
		}
		// we just print the subarray for confirmation
		for (int ele : subarr) {
			System.out.print(ele + " ");
		}
		System.out.println();

		// just push all element one by one
		// tempK = 0;
		// while(tempK < k)
		// {
		// for(int i=arr.length-1;i>0;i--)
		// {
		// arr[i]=arr[i-1];
		// }
		// }

		// push all rest of the element to the end
		for (int i = arr.length - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}
		// now we have to place the rotate to its original array from the subarray
		for (int i = 0; i < k; i++) {
			arr[i] = subarr[i];
		}

	}
}