import java.util.Scanner;

public class AgressiveCow {

	public AgressiveCow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// To declare a object for scanner class
		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int size = sc.nextInt();

		// Initiaze a array with size
		int[] arr = new int[size];

		// Take a input of an array with for loop
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Get the input as number of cows
		int NOC = sc.nextInt();

		// Call the function which will return the longest possible distance
		int largestPossibleDist = agressiveCow(arr, NOC);
		System.out.println("Largest POssible count:" + largestPossibleDist);
	}

	// Function to calculate the lrgestpossibledistance for aggressive cows
	private static int agressiveCow(int[] arr, int noc) {
		// TODO Auto-generated method stub
		// Initialize distance variable as 0
		int distance = 0;
		// Initialize low variable as 0
		int low = 0;
		// Initialize high variable as last index value minus fist index value
		int high = arr[arr.length - 1] - arr[0];

		// While low less than or equals to high
		while (low <= high) {
			// Calculate mid as low+(high-low)/2
			int mid = low + (high - low) / 2;
			// Call isItPossible method by passing array, mid and number of cows value
			if (isItPossible(arr, mid, noc)) {
				// If the condition satisfied update distance and low value by incrementing +1
				distance = mid;
				low = mid + 1;
			} else {
				// If the condition not satisfied update high as mid-1
				high = mid - 1;
			}
			// At the end of the loop increment low and decrement high values
			low++;
			high--;
		}
		// return the distance
		return distance;
	}

	// Method to identify the distance is possible option or not
	private static boolean isItPossible(int stall[], int mid, int noc) {
		// TODO Auto-generated method stub
		// Initialize cow value as 1
		int cow = 1;
		// Initialize position as stall[0] as always first cow should be in first
		// available stall
		int position = stall[0];
		// Loop until stall length
		for (int i = 1; i < stall.length; i++) {
			// Calculate the distance
			int distance = stall[i] - position;
			// If the distance grater than or equal to mid
			if (distance >= mid) {
				// increment cow count and update the position value
				cow++;
				position = stall[i];
			}
			// If the cow count equals to number of cows return true
			if (cow == noc) {
				return true;
			}
		}
		// return false if the loop ends and the condition not satisfied
		return false;
	}

}
