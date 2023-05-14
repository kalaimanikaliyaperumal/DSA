
public class Spiral2DSearch {

	public Spiral2DSearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] inputMatrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int inputTarget = 31;
		searchMatrix(inputMatrix, inputTarget);
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int minRow = 0;
		int minCol = 0;
		int finalRow = matrix.length - 1;
		int finalCol = matrix[0].length - 1;
		while (minRow <= finalRow && minCol <= finalCol) {
			if (target == matrix[minRow][finalCol]) {
				System.out.println("Target found:" + target);
				return true;
			} else if (target > matrix[minRow][finalCol]) {
				minRow++;
			} else {
				finalCol--;
			}

		}
		System.out.println("Target not found. Returning Flase");
		return false;
	}
}
