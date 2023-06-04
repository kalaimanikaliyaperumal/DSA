import java.util.Scanner;

public class ValidPerfectSquare {

	public ValidPerfectSquare() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Get the input for the target variable
		int target = sc.nextInt();
		// Store the ans
		boolean ans = isPerfectSquare(target);
		System.out.println("SQRT value: " + ans);

	}

	public static boolean isPerfectSquare(int num) {
		// Initialize the low variable
		long low = 0;
		// Initialize the high variable
		long high = num;
		// Initialize the answer variable which will hold the final result
		boolean answer = false;
		// Loop until low value less than or equal to high
		while (low <= high) {
			// Initialize the mid value
			long mid = low + (high - low) / 2;
			// If the mid*mid value equal to target then update answer variable to true and
			// exit from the loop
			if (mid * mid == num) {
				answer = true;
				break;
			}
			// If the mid*mid value less than target value then update low as mid+1
			else if (mid * mid < num) {
				low = mid + 1;
			}
			// If the mid*mid greater than target vlue then update high as mid-1
			else if (mid * mid > num) {
				high = mid - 1;
			}
		}
		// return the answer variable
		return answer;
	}
}
