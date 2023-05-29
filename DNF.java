import java.util.Scanner;

//Leet code question Sort Color in Linear time
// Dutch National Flag problem
public class DNF {

	public DNF() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		// call the sort function by passing array as input
		sort(arr);

		// print the final sorted array
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		// Initialize left variable
		int left = 0;
		// Initialize mid variable
		int mid = 0;
		// Initialize right variable
		int right = arr.length - 1;
		// Iterate the while loop until mid less than equal to right
		while (mid <= right) {
			// if arr[mid] equals 0, then swap both mid and left index values
			if (arr[mid] == 0) {
				// call the swap function by passing array, mid and left index
				swap(arr, mid, left);
				// increase left index variable ++
				left++;
				// increase mid index variable ++
				mid++;
			}
			// if arr[mid] equals 2 then swap both mid and right indexes
			else if (arr[mid] == 2) {
				// call the swap function by passing array, mid and right index
				swap(arr, mid, right);
				// decrease right index variable --;
				right--;
			}
			// if arr[mid] equals 1 then increase mid variable ++
			else if (arr[mid] == 1) {
				// increase mid index variable
				mid++;
			}
		}

	}

	// Function which gets array, source and target index
	private static void swap(int[] num, int mid, int left) {
		// TODO Auto-generated method stub
		// Initialize temp variable with num[mid] value
		int temp = num[mid];
		// Relace num[mid] with num[left]
		num[mid] = num[left];
		// Relace num[left] with temp
		num[left] = temp;
	}

}
