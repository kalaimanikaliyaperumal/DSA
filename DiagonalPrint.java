import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiagonalPrint {

	public DiagonalPrint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// To take a input for Row size
		int rowSize = sc.nextInt();

		// To take a input for Column size
		int colSize = sc.nextInt();

		// Initialize a array with size
		int[][] arr = new int[rowSize][colSize];

		// Take a input of an array with for loop
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//System.out.println("one");

		// Initialize the ans array by multiplying both 
		int[] ans = new int[rowSize * colSize];
		ans = findDiagonal(arr);
		//System.out.println("two");

		for (int ele : ans) {
			System.out.print(ele + " ");
		}

//		for(int k=0; k<rowSize; k++) {
//			for(int z=k;z<colSize;z++) {
//				System.out.print(arr[z][k]);
//			}
//		}

	}

	private static int[] findDiagonal(int[][] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int m = arr[0].length;
		int diagonalLength = n + m - 1;
		int[] ans = new int[m * n];
		int i = 0;
		//System.out.println("three");

		for (int d = 0; d < diagonalLength; d++) {
			int r = 0;
			int c = 0;
			if (d < m) {
				r = 0;
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			//System.out.println("four");

			while (r < n && c >= 0) {
				//System.out.print(arr[r][c] + " ");
				list.add(arr[r][c]);
				r++;
				c--;
			}

			//System.out.println("five");
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
			for (int ele : list) {
				ans[i] = ele;
				i++;
			}

		}
		//System.out.println("six");
		return ans;
	}
}
