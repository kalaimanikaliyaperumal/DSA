import java.util.Scanner;

public class TrapWater {

	public TrapWater() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// now take a input of size of an array
		int size = sc.nextInt();
		// declare or creating an array with size
		int[] arr = new int[size];
		// we are initializing an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Calling trapWater method by passing building Height values in a array as
		// input
		System.out.println("Final water value:" + trapWater(arr));
		sc.close();

	}

	private static int trapWater(int[] arr) {
		// TODO Auto-generated method stub
		// Create and Declare leftArray
		int[] leftArray = new int[arr.length];
		// Create and Declare rightArray
		int[] rightArray = new int[arr.length];
		// Initialize the 0th index of left array with first building height value
		leftArray[0] = arr[0];
		// Iterate the array and find the max value between the current height and left
		// side building and store it in leftArray
		for (int i = 1; i < arr.length; i++) {
			leftArray[i] = Math.max(leftArray[i - 1], arr[i]);
		}
		// Initialize the last index of rightArray with last building height value
		rightArray[arr.length - 1] = arr[arr.length - 1];
		// Iterate the array and find the max value between the current height and right
		// side building and store in rightArray
		for (int j = arr.length - 2; j >= 0; j--) {
			rightArray[j] = Math.max(rightArray[j + 1], arr[j]);

		}
		// Initialize the totalWater which will have the sum of final value
		int totalWater = 0;
		// Iterate the array and find the Minimum value between leftArray and rightArray
		// for the current index and
		// subtract the current building Height value and store the answer in totalWater
		for (int k = 0; k < arr.length; k++) {
			totalWater = totalWater + Math.min(leftArray[k], rightArray[k]) - arr[k];
		}
		// Return the totalWater value
		return totalWater;
	}
}
