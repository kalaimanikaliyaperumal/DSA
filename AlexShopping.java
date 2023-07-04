//https://hack.codingblocks.com/app/contests/4020/1094/problem

import java.util.Scanner;

public class AlexShopping {

	public AlexShopping() {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Initialize the number of items
		int numberOfItems = sc.nextInt();
		// Initialize the items price with the number of items size
		int[] itemsPrice = new int[numberOfItems];
		// Initialize the for loop and update the items price array
		for (int i = 0; i < numberOfItems; i++) {
			itemsPrice[i] = sc.nextInt();
		}
		// Get the input for number of queries
		int numberOfQueries = sc.nextInt();
		// Initialize the total amount array
		int[] totalAmount = new int[numberOfQueries];
		// Initialize the number of options
		int[] numberOfOptions = new int[numberOfQueries];
		// Initialize the response array which holds the boolean values for each query
		boolean[] response = new boolean[numberOfQueries];
		// Loop and update the totalAmount array values, number of options and responses
		for (int j = 0; j < numberOfQueries; j++) {
			totalAmount[j] = sc.nextInt();
			numberOfOptions[j] = sc.nextInt();
			response[j] = isItCorrect(totalAmount[j], numberOfOptions[j], itemsPrice);
		}

		// Loop and print ans for each query as true or false
		for (int m = 0; m < numberOfQueries; m++) {
			System.out.println("Ans:" + response[m]);
		}
		System.out.println("All inputs received");
		// Close the scanner object
		sc.close();
	}

	// Method to identify the option is correct or not
	private static boolean isItCorrect(int amount, int options, int[] price) {
		// Initialize the match variable as 0 which holds the final match count
		int match = 0;
		// Loop the price array and check will it match the price or not
		for (int k = 0; k < price.length; k++) {
			// If the condition satisfies increment the match count
			if (amount % price[k] == 0) {
				match++;
			}
		}
		// If the match count greater than or equal to options value then return true
		if (match >= options) {
			return true;
		}
		// Return false if the condition not match
		return false;
	}
}