import java.util.Scanner;

public class InsertionSort {

	public static void InsertionSort(int[] num) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i < num.length; i++) {
			int j = i - 1;
			int temp = num[i];
			while (j >= 0 && num[j] > temp) {
				//System.out.println("num[j]" + num[j]);
				//System.out.println("temp" + temp);
				num[j + 1] = num[j];
				j--;
			}
			j++;
			num[j] = temp;
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

		InsertionSort(arr);
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		sc.close();
	}

}
