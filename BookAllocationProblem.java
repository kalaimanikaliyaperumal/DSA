//https://hack.codingblocks.com/app/contests/4020/1365/problem

import java.util.Scanner;

public class BookAllocationProblem {

	public BookAllocationProblem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// To take the number of books
		int size = sc.nextInt();

		// Get the input as number of students
		int numberOfStudents = sc.nextInt();

		// Initialize a array with size
		int[] arr = new int[size];

		// Take a input of an array with for loop
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Call the function which will return the longest possible distance
		int largestPossibleDist = bookAllocation(arr, numberOfStudents);
		System.out.println("Largest Possible count:" + largestPossibleDist);

	}

	private static int bookAllocation(int[] arr, int nos) {
		// TODO Auto-generated method stub
		// Initialize low as 1 as the student should read minimum 1 page
		int low = 1;
		// Initialize high value as 0
		int high = 0;
		// Initialize ans as 0
		int ans = 0;
		// Loop until end and update high variable with total
		for (int i = 0; i < arr.length; i++) {
			high += arr[i];
		}
		System.out.println("high:" + high);
		// While low less than or equal high continue the loop
		while (low <= high) {
			// Calculate mid as low+(high-low)/2
			int mid = low + (high - low) / 2;
			System.out.println("low:" + low);
			System.out.println("mid:" + mid);
			System.out.println("high:" + high);
			// Call isItPossible method by passing array, mid and number of cows value
			if (isItPossible(arr, mid, nos)) {
				// If the condition satisfied update distance and low value by incrementing +1
				ans = mid;
				high = mid - 1;
			} else {
				// If the condition not satisfied update high as mid-1
				low = mid + 1;
			}
			// At the end of the loop increment low and decrement high values
			// low++;
			// high--;
		}

		return ans;
	}

	// Function to find the passing mid number satisfy the condition or not
	private static boolean isItPossible(int[] arr, int mid, int nos) {
		// Initialize student value as 1
		int student = 1;
		// Initialize read_page value as 0
		int read_page = 0;
		// Initialize i value as 0
		int i = 0;
		// Loop until i value less than array length
		while (i < arr.length) {
			// Check if read page value and arr[i] total value less than or equal to mid
			if (read_page + arr[i] <= mid) {
				// if this condition satifies update read_page variable
				read_page += arr[i];
				// increment i value
				i++;
			}
			// If the condition falis
			else {
				// increment the student value
				student++;
				// reset the read_page value as 0
				read_page = 0;
			}
			// Check if the student value greater than the total no of students then return
			// false
			if (student > nos) {
				return false;
			}
		}
		// If the flow reached here return true
		System.out.println("mid value before returning true:" + mid);
		return true;
	}

}
