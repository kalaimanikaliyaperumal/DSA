
public class TransposeMatrix {

	public TransposeMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		matrix = transpose(matrix);

		// //printing the matrix after transpose operation
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + "  "); // print the 2D array element
			}
			System.out.println(); // goes to the nextLine
		}

	}

	public static int[][] transpose(int[][] matrix) {
		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = row + 1; col < matrix.length; col++) {
				int temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}
		return matrix;
	}

}
