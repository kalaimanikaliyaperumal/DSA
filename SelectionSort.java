import java.util.Scanner;

public class SelectionSort {

	public static void SelectionSort(int[] num) {
		// TODO Auto-generated constructor stub

		for (int i = 0; i < num.length - 1; i++) {
			int min_element_index = i;
			for (int j = i + 1; j <= num.length - 1; j++) {
				if (num[min_element_index] > num[j]) {
					min_element_index = j;
				}
			}
			int temp = num[min_element_index];
			num[min_element_index] = num[i];
			num[i] = temp;
		}
		for (int ele : num) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// now take a input of size of an array
		int size = sc.nextInt();
		// declare or creating an array with size
		int[] arr = new int[size];
		// we are initializing an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		SelectionSort(arr);
		sc.close();

	}

}
