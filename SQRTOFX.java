import java.util.Scanner;

public class SQRTOFX {

	public SQRTOFX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Get the input for the target variable
		int target = sc.nextInt();
		// Store the ans
		int ans = mySqrt(target);
		System.out.println("SQRT value: " + ans);

	}

	// This method is to calculate the SQRT based on Target value passed as argument
	public static int mySqrt(int x) {
		// Initialize low value to 0
		long low = 0;
		// Initialize high value to target value
		long high = x;
		// Initialize ans variable to 0 which will have final answer
		long ans = 0;
		// Loop until low value less than or equal to high
		while (low <= high) {
			// Calculate the mid value
			long mid = low + (high - low) / 2;
			// If the mid*mid value less than or equal to target value then assign mid value
			// to ans. Also modify low value to mid+1
			if (mid * mid <= x) {
				ans = mid;
				low = mid + 1;
			}
			// If the mid*mid value greater than target value then modify high value with
			// mid-1
			else if (mid * mid > x) {
				high = mid - 1;
			}
		}
		// Return the ans variable which stores the final value set
		return (int) ans;
	}

}
