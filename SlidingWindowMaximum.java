import java.util.Scanner;

public class SlidingWindowMaximum {

	public SlidingWindowMaximum() {
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
			//System.out.println(ele + " ");
		}

		findTheMaximumofSubarray(inputArray, subArraySize);
	}

	private static void findTheMaximumofSubarray(int[] inputArray, int size) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if ((inputArray[i]) > max) {
				max = inputArray[i];
			}
		}
		System.out.println("Max value: " + max);

		for (int j = 1; j <= inputArray.length - size; j++) {
			max = Integer.MIN_VALUE;
			for (int k = j; k < j + size; k++) {
				if (inputArray[k] > max) {
					max = inputArray[k];
				}
			}
			System.out.println("Max value: " + max);
		}

	}

}
