import java.util.Scanner;

public class VerticalArrayPrinting {

	public VerticalArrayPrinting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To declare a object for scanner class
		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int rowsize = sc.nextInt();

		// To take a input for array size
		int colsize = sc.nextInt();

		// Initialize a array with size
		int[][] arr = new int[rowsize][colsize];

		// Take a input of an array with for loop
		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < colsize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// call the sort function by passing array as input
		verticalArrayPrinting(arr, rowsize, colsize);

		// print the final sorted array
		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < colsize; j++) {
				// arr[i][j] = sc.nextInt();
				System.out.println(arr[i][j]);
			}
		}
	}

	private static void verticalArrayPrinting(int[][] arr, int rowSize, int colSize) {
		int minR = 0;
		int maxR = arr.length - 1;
		int minC = 0;
		int maxC = arr[0].length - 1;

		// just declare while loop to iterate whole matrix one by one
		while (minR <= maxR && minC <= maxC) {
			for (int i = minR; i <= maxR; i++) {
				System.out.println(arr[i][minC]);
			}
			minC++;

			for (int i = maxR; i >= minR; i--) {
				System.out.print(arr[i][minC] + " ");
			}
			minC++;

//            // for loop for top row 
//            for(int i=minC; i<=maxC; i++)
//            {
//                System.out.print(arr[minR][i]+" ");
//            }
//            // After printing all the elements of the first row then increase the pointer of the minR
//            minR++;
//            System.out.println();
//
//            // for loop for end col
//            for(int i=minR; i<=maxR; i++)
//            {
//                System.out.print(arr[i][maxC]+" ");
//            }
//            maxC--;
//            System.out.println();
//
//            //This condition occur when you do not need to iterate further
//            if(minR>=maxR  || minC>=maxC)
//                break;
//
//            //  for loop for bottom row
//            for(int i=maxC; i>=minC; i--)
//            {
//                System.out.print(arr[maxR][i]+" ");
//            }
//            maxR--;
//            System.out.println();
//            
//            //  for loop for first col
//            for(int i=maxR; i>=minR; i--)
//            {
//                System.out.print(arr[i][minC]+" ");
//            }
//            minC++;
			System.out.println();
		}

	}

}
