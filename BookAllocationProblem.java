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

		// Initiaze a array with size
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
		int low = 1;
		int high = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			high += arr[i];
		}
		System.out.println("high:" + high);
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

	private static boolean isItPossible(int[] arr, int mid, int nos) {
		int student = 1;
		int read_page = 0;
		int i = 0;

		while (i < arr.length) {
			if (read_page + arr[i] <= mid) {
				read_page += arr[i];
				i++;
			} else {
				student++;
				read_page = 0;
			}
			if (student > nos) {
				return false;
			}
		}

		System.out.println("mid value before returning true:" + mid);
		return true;
	}

}
