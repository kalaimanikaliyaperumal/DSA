import java.util.Scanner;

public class RotateanMatrixBy90Degree {

	public RotateanMatrixBy90Degree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int rowSize = sc.nextInt();

		int colSize = sc.nextInt();

		int[][] inputArray = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				inputArray[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(inputArray[i][j]);;
			}

		}

		int[][] answer = new int[inputArray[0].length][inputArray.length];

		for (int i = 0; i < rowSize; i++) {
			System.out.println("one");
			for (int j = colSize; j < 0; j--) {
				System.out.println("two");
				answer[j][i] = inputArray[i][j];
				System.out.println(answer[j][i]);
			}
		}
		
		for (int row = 0; row < answer.length; row++) {
			for (int col = 0; col < answer[0].length; col++) {
				System.out.print(answer[row][col] + "  "); // print the 2D array element
			}
			System.out.println(); // goes to the nextLine
		}

	}

}
