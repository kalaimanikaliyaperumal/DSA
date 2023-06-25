import java.util.Scanner;

public class MaximumSumofKSizeWindow {

	public MaximumSumofKSizeWindow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arraySize = sc.nextInt();

		int subArraySize = sc.nextInt();

		int[] inputArray = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			inputArray[i] = sc.nextInt();
		}

		for (int ele : inputArray) {
			// System.out.println(ele + " ");
		}

		findTheMaximumofKsizeWindow(inputArray, subArraySize);
	}

	private static void findTheMaximumofKsizeWindow(int[] inputArray, int subArraySize) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < subArraySize; i++) {
			// max += inputArray[i];
			sum += inputArray[i];
		}
		max = sum;
		for (int j = subArraySize; j < inputArray.length; j++) {
			sum += inputArray[j] - inputArray[j - subArraySize];
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("Max of K Size window: " + max);
	}
}