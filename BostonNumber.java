import java.util.Scanner;

public class BostonNumber {

	public BostonNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To declare a object for scanner class
		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int targetNumber = sc.nextInt();

		// Initialize ans variable which will calculate the sum of the digits 1.e for
		// 378 the sum is 3+7+8
		int ans = digitSum(targetNumber);
		// Initialize the printSum. This function will add all the numbers and the
		// reminder will be passed to digitSum function
		int primeSum = primeFactorization(targetNumber);
		// If ans variable equals to primeSum then its a Boston number else its not a
		// Boston number
		if (ans == primeSum) {
			System.out.println("Yes it is a Boston Number");
		} else {
			System.out.println("No it is not a Boston Number");
		}
	}

	// This function to calculate the primeFactorization sum value
	private static int primeFactorization(int targetNumber) {
		// TODO Auto-generated method stub
		// Initialize i as 2 as it is the minimum number to start with
		int i = 2;
		// Initialize ans variable to 0
		int ans = 0;
		// Loop until i value less than or equal to target number
		while (i <= targetNumber) {
			// Loop until targetNumber mod i equals 0
			while (targetNumber % i == 0) {
				// update ans variable with digitSum of reminder
				ans = ans + digitSum(i);
				// update the targetNumber to move to the next calculation
				targetNumber = targetNumber / i;
			}
			// increment the i value for loop
			i++;
		}
		System.out.println("primeFactorization:" + ans);
		// return the primeFactorization ans value
		return ans;
	}

	// This function helps to sum the digits
	private static int digitSum(int targetNumber) {
		// TODO Auto-generated method stub
		// Initialize the ans variable to 0
		int ans = 0;
		// Initialize the reminder variable to 0
		int reminder;
		// Loop until targetNumber greater than 0
		while (targetNumber > 0) {
			// Calculate the reminder by mod 10 the targetNumber
			reminder = targetNumber % 10;
			// update the ans by adding reminder value
			ans = ans + reminder;
			// update the target number by dividing 10 to get the next digit value
			targetNumber = targetNumber / 10;
		}
		System.out.println("ans:" + ans);
		// return the final ans which holds the sum of all digits
		return ans;
	}

}
