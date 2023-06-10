import java.util.Scanner;

public class SubArraySumsDivisibleByK {

	public SubArraySumsDivisibleByK() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int size = sc.nextInt();

		// Initiaze a array with size
		int[] arr = new int[size];

		// Take a input of an array with for loop
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// Take an input for the divisible number
		int k = sc.nextInt();
		// Call the function which will find the sub array count which will divisible by
		// K
		// int ans = subarraysDivByK(arr, k);

		int ans = subarraysDivByKBestApproach(arr, k);

		System.out.println(" ");
		// Print the final answer
		System.out.println("Final Sub Array Count:" + ans);

	}

	private static int subarraysDivByKBestApproach(int[] arr, int k) {
		// TODO Auto-generated method stub
		// Initialize the cumulative array
		int[] cumulativeArray = new int[arr.length + 1];
		// Follow prefix approach to get the cumulative count
		// Initialize the 0 index value
		cumulativeArray[0] = 0;
		// Loop the array and get the cumulative count
		// Prefix[i] = prefix[i-1]+arr[i-1]
		for (int i = 1; i < cumulativeArray.length; i++) {
			// cumulativeArray[i] = (cumulativeArray[i - 1] + arr[i]) % k;
			cumulativeArray[i] = (cumulativeArray[i - 1] + arr[i - 1]) % k;
		}
		System.out.println("cumulativeArray");
		for (int ele : cumulativeArray) {
			System.out.print(ele + " ");
		}
		System.out.println(" ");
		// Initialize frequency array
		int[] frequencyArray = new int[k];
		// Loop the cumulative array and find how many times the value occurs from 0 to
		// K-1
		for (int j = 0; j < cumulativeArray.length; j++) {
			frequencyArray[cumulativeArray[j]] = frequencyArray[cumulativeArray[j]] + 1;
		}
		System.out.println("FrequencyArray");
		for (int ele : frequencyArray) {
			System.out.print(ele + " ");
		}
		// Initialize answer variable
		int ans = 0;
		// Loop the frequency array and get the count using nCr formula [n*(n-1)/2]
		for (int m = 0; m < frequencyArray.length; m++) {
			if (frequencyArray[m] >= 2) {
				ans += (frequencyArray[m] * (frequencyArray[m] - 1)) / 2;
			}
		}
		// Return the final ans value
		return ans;
	}

//	public static int subarraysDivByKBestApproach(int[] nums, int k) {
//		// generate prefix sum
//		int[] pref = new int[nums.length];
//		pref[0] = nums[0];
//		for (int i = 1; i < nums.length; i++) {
//			pref[i] = pref[i - 1] + nums[i];
//		}
//		// store the modular cnt
//		int[] m = new int[k];
//		// base value
//		m[0] = 1;
//		// init ans
//		int ans = 0;
//		// iterate each sum
//		for (int x : pref) {
//			// if x is negative, turn it to positive modular equivalent
//			if (x < 0) {
//				x = (x % k + k) % k;
//			}
//			// we need to find pairs such that (pref[j] - pref[i]) % k == 0
//			// hence, we look for pref[j] % k == pref[i] % k
//			// why ..?
//			// pref[j] = a * k + x
//			// pref[i] = b * k + y
//			// pref[j] - pref[i] = (a * k + x) - (b * k + y)
//			// pref[j] - pref[i] = k * (a - b) + (x - y)
//			// -> (pref[j] - pref[i]) % k == 0 if & only if (x - y) == 0
//			m[x % k]++;
//		}
//		// n choose 2
//		for (int x : m) {
//			ans += x * (x - 1) / 2;
//		}
//		return ans;
//	}

	// Function to find the sub array count which is divisible by K
	public static int subarraysDivByK(int[] nums, int k) {
		// Initialize sum variable
		int sum = 0;
		// Initialize sub array count
		int subArrayCount = 0;
		// Iterate the loop until the length of the array
		for (int i = 0; i < nums.length; i++) {
			// Calculate the Sum of the array
			sum = nums[i];
			// System.out.println("Sum:" + sum);
			// Check the sum is divisible by k, then increment the sub array count value
			if (Math.abs(sum) % k == 0) {
				subArrayCount = subArrayCount + 1;
			}
			// Iterate the inner loop
			for (int j = i + 1; j < nums.length; j++) {
				// Calculate the sum
				sum = sum + nums[j];
				// Check the sum is divisible by k, then increment the sub array count value
				if (Math.abs(sum) % k == 0) {
					subArrayCount = subArrayCount + 1;
				}
			}
		}
		// Return the subArrayCOunt which holds the total count value
		return subArrayCount;
	}
}
