import java.util.Scanner;

public class BinarySearch {

	public BinarySearch() {
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

		// Get the input for the target variable
		int target = sc.nextInt();
		// Call the binarySearch method by passing both arr and target variable
		binarySearch(arr, target);

	}

	// Binary serach always work on Sorted array only
	// In case if the array is not sorted it should be sorted first
	private static void binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		// Initialize low variable to 0
		int low = 0;
		// Initialize the High variable to last index
		int high = arr.length - 1;

		// Loop the array until low <= high
		while (low <= high) {
			// Calculate the mid by calculating (low+high)/2
			int mid = (low + high) / 2;
			// If mid index is equal to target Print the message and return
			if (arr[mid] == target) {
				System.out.println("Target Found" + " " + mid);
				return;
			}
			// if the mid index value less than target then update low variable as mid+1
			else if (arr[mid] < target) {
				low = mid + 1;
			}
			// if the mid index value greater than target then update high variable as mid-1
			else if (arr[mid] > target) {
				high = mid - 1;
			}
		}
		System.out.println("Target not Found");
	}

}
