import java.util.ArrayList;

public class SpiralIO {

	public SpiralIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//int[][] matrix = { { 1, 2 }, { 3, 4 } };
		printSpiral(matrix);
	}

	public static void printSpiral(int[][] arr) {
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		ArrayList<Integer> outPut = new ArrayList<>();

		while ((minRow <= maxRow) && (minCol <= maxCol)) {

			System.out.println("min column to max column");
			for (int i = minCol; i <= maxCol; i++) {
				System.out.println(arr[minRow][i]);
				outPut.add(arr[minRow][i]);
				// System.out.println(outPut.toString());
			}
			minRow++;

			System.out.println("min row to max row");
			for (int j = minRow; j <= maxRow; j++) {
				System.out.println(arr[j][maxCol]);
				outPut.add(arr[j][maxCol]);
				// System.out.println(outPut.toString());
			}
			maxCol--;

			if (minRow > maxRow || minCol > maxCol)
				break;

			System.out.println("max column to min column");
			for (int k = maxCol; k >= minCol; k--) {
				System.out.println(arr[maxRow][k]);
				outPut.add(arr[maxRow][k]);
				// System.out.println(outPut.toString());
			}
			maxRow--;

			System.out.println("max row to min row");
			for (int l = maxRow; l >= minRow; l--) {
				System.out.println(arr[l][minCol]);
				outPut.add(arr[l][minCol]);
				// System.out.println(outPut.toString());
			}
			minCol++;

		}
		System.out.println(outPut.toString());

	}

}
