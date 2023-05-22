import java.util.Scanner;

public class BubbleSort {

	public static void BubbleSort(int[] num) {
		// TODO Auto-generated constructor stub
		for (int pass = 0; pass < num.length - 1; pass++) {
			for (int j = 0; j < num.length - 1-pass; j++) {

				if (num[j] > num[j + 1]) {
					int temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;
				}

			}
			
		}
		for (int ele : num) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a Scanner class object
		Scanner sc = new Scanner(System.in);
		// now take a input of size of an array
		int size = sc.nextInt();
		// declare or creating an array with size
		int[] arr = new int[size];
		// we are initializing an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		BubbleSort(arr);

	}

}
