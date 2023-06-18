// https://codeskiller.codingblocks.com/problems/165

import java.util.Scanner;

public class CBNumber {

	public CBNumber() {

	}

	public static void main(String[] args) {
		// Initialize the Scanner to get the input
		Scanner sc = new Scanner(System.in);
		// Initialize the input to find the CB number count
		String input = sc.next();
		// Initialize the count attribute
		int count = 0;
		// Initialize the visitedSubArray which holds the boolean value for each number  
		boolean[] visitedSubArray = new boolean[input.length()];

		// Loop to get the vertical sub arrays based on Length. Here the sub array will be retrieved based on the Length
		for (int len = 1; len <= input.length(); len++) {
			// Loop the sub array until the string length from starting index
			for (int si = 0; si <= input.length() - len; si++) {
				// Get the sub string from starting index to starting index+length
				String s = input.substring(si, si + len);
				// call isCBNumber function and check is it return value true and call isVisited function to confirm is the number is already vissted or not
				if (isCBNumber(s) == true && isVisited(visitedSubArray, si, si + len - 1) == false) {
					// Again loop from starting index to starting index + length -1
					for (int k = si; k <= si + len - 1; k++) {
						// update visitedSubArray to true for particular index
						visitedSubArray[k] = true;
					}
					// increment the count value as it is a valid scenario
					count++;
				}
			}
		}
		// Print the count value which holds the final count value
		System.out.println("Count val:" + count);
	}

	// This function created to check the value is vistied already or not
	private static boolean isVisited(boolean[] visitedSubArray, int si, int ei) {
        // Loop from starting index to ending index and check is it visited or not and return the value based on that
		for (int i = si; i <= ei; i++) {
			if (visitedSubArray[i] == true) {
				return true;
			}
		}
		// return false as it is not a satisfied scenario
		return false;
	}

	// This function created to check it is a CB number or not
	private static boolean isCBNumber(String str) {
		// Initialize the input based on the Question description
		String[] input = { "2", "3", "5", "7", "11", "13", "17", "19", "23", "29" };
		// Check the first condition as per the description the value is equal to 0 or 1
		if (str.equals("0") || str.equals("1")) {
			return false;
		}
		// Loop until input length
		for (int i = 0; i < input.length; i++) {
			// Check the string value equals to current input index
			if (str.equals(input[i])) {
				// return true
				return true;
			}
		}
		// Loop until input length
		for (int j = 0; j < input.length; j++) {
			// Convert the String value to integer and check is it possible to divide by input array index values
			if (Integer.parseInt(str) % Integer.parseInt(input[j]) == 0) {
				// return false
				return false;
			}
		}
		//return true
		return true;
	}
}
