import java.util.Scanner;

public class CircularMaximumSubarray {

	public CircularMaximumSubarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
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

		// Call circularMaximumSubArray method by passing arr as input and store the
		// value in finalMaximumSub
		int finalMaximumSub = circularMaximumSubArray(arr);
		System.out.println("finalMaximumSub: " + finalMaximumSub);
		sc.close();

	}

	private static int circularMaximumSubArray(int[] arr) {
		// TODO Auto-generated method stub
		// Initialize the total_sum which will sum each element in the array
		int total_sum = 0;

		// Iterate the array and sum each element and store in total_sum
		for (int i = 0; i < arr.length; i++) {
			total_sum = total_sum + arr[i];
		}
		// Call the method which will find Linear Max sub array using Kadane's algorithm
		// and store in linearMaximumSum variable
		int linearMaximumSum = linearMaximumSub(arr);
		// Call the method which will multiply -1 against each element of the array and
		// store in negativeSum variable
		int negativeSum = negativeSumSub(arr);
		// Calculate circularMaximumSub value by subtracting the negative sum from total
		// sum
		int circularMaximumSub = total_sum - (-negativeSum);
		// Return the Max value between linearMaximumSum and circularMaximumSub
		return Math.max(linearMaximumSum, circularMaximumSub);

	}

	// Method to calculate linearMaximumSub
	private static int linearMaximumSub(int[] arr) {
		// TODO Auto-generated method stub
		// Initialize ans with INTERGER.MIN_VALUE
		int ans = Integer.MIN_VALUE;
		// Initialize prev_sum as 0
		int prev_sum = 0;
		// Iterate the for loop
		for (int i = 0; i < arr.length; i++) {
			// Calculate prev_sum by adding current index
			prev_sum += arr[i];
			// Use kadanes algorithm. If prev_sum greater than ans then assign ans with
			// prev_sum value
			if (prev_sum > ans) {
				ans = prev_sum;
			}
			// Use Kadanes algorithm. If prev_sum value is negative them assign prev_sum
			// value as 0
			if (prev_sum < 0) {
				prev_sum = 0;
			}
		}
		System.out.println("Linear :" + ans);
		// return the ans value which holds the linear maximum sub array value
		return ans;

	}

	// Method to calculate negativeSumSub
	private static int negativeSumSub(int[] arr) {
		// TODO Auto-generated method stub
		// Iterate the for loop
		for (int j = 0; j < arr.length; j++) {
			// Multiply each indexy by -1
			arr[j] = arr[j] * -1;
		}
		// Get the invertedMaximum value by passing the negativeSubArray as input to
		// linearMaximumSub function
		int invertedMaximum = linearMaximumSub(arr);
		System.out.println("negativeSumSub :" + invertedMaximum);
		// return the invertedMaximum value which holds the invertedMaximum Subarray
		// total
		return invertedMaximum;
	}

}

//total = 11
//max sub array = 9
//negative max sub array = 4
//total-negative max sub array = 15