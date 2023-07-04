import java.util.Scanner;

public class PairOfRoses {

	public PairOfRoses() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		while (testCaseCount-- > 0) {
			int numberOfRoses = sc.nextInt();
			int[] rosePrices = new int[numberOfRoses];
			for (int i = 0; i < numberOfRoses; i++) {
				rosePrices[i] = sc.nextInt();
			}
			int totalAmount = sc.nextInt();
			pairOfRosesPrice(rosePrices, totalAmount);
		}
	}

	private static void pairOfRosesPrice(int[] price, int amount) {
		// TODO Auto-generated method stub
		int p1 = 0;
		int p2 = 0;
		int max_diff = Integer.MAX_VALUE;
		int sum = 0;
		for (int j = 0; j < price.length; j++) {
			for (int k = j + 1; k < price.length; k++) {

				if ((price[j] + price[k]) == amount && max_diff > Math.abs(price[j] - price[k])) {
					p1 = price[j];
					p2 = price[k];
					max_diff = Math.abs(p1 - p2);

				}
			}
		}
		System.out.println(" ");
		System.out.println("Rose1: " + p1 + " Rose2: " + p2 + " Max diff: " + max_diff);

	}
}