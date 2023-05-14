
// Problem Name: MaximumSubArray
// Problem Link: https://leetcode.com/problems/maximum-subarray/
import java.util.*;

public class MaximumSubArray {

	public static void main(String args[]) {
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

		// Just call the maximum subarray function and print its returned value
		System.out.println(MaximumSubArray(arr)); // O(n^2)
		System.out.println(MaximumSubArrayKadaneApproach(arr)); // O(n)

	}

	public static int MaximumSubArrayKadaneApproach(int[] arr) {
		// intialize two variables ans and sum
		int ans = Integer.MIN_VALUE;
		int sum = 0;

		// iterate the for loop and its time complexity become O(n).
		for (int i = 0; i < arr.length; i++) // O(n)
		{
			// first step we need to add the element to the sum variable
			sum += arr[i];

			// we need to update the ans variable if sum variable greater the ans
			// ans = Math.max(sum,ans);
			if (sum > ans) {
				ans = sum;
			}

			// last step if the sum is become negative then we need to be 0
			if (sum < 0) {
				sum = 0;
			}
		}

		// finally we need to return the ans variable.
		return ans;
	}

	public static int MaximumSubArray(int[] arr) {
		// Just declare the integer minimum value
		int ans = Integer.MIN_VALUE;

		// just iterate the loop with initial from 0
		for (int i = 0; i < arr.length; i++) // O(n)
		{
			// we need to declare a sum variable to sum all the values
			int sum = 0;

			// now we need to iterate starting from i
			for (int j = i; j < arr.length; j++) // O(n)
			{
				// update sum value
				sum += arr[j];

				// If sum is greater the final result then we need to update the ans.
				// if(sum>ans)
				// {
				// ans=sum;
				// }
				ans = Math.max(ans, sum);

			}
		}
		// Final step is to return the ans value.
		return ans;
	}

}