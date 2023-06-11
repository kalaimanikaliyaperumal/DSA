import java.util.Scanner;

public class AgressiveCow {

	public AgressiveCow() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// To declare a object for scanner class
		Scanner sc = new Scanner(System.in);

		// To take a input for array size
		int size = sc.nextInt();

		// Initiaze a array with size
		int[] arr = new int[size];

		// Take a input of an array with for loop
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int NOC = sc.nextInt();

		int largestPossibleDist = agressiveCow(arr, NOC);
		System.out.println("Largest POssible count:"+largestPossibleDist);
	}

	private static int agressiveCow(int[] arr, int noc) {
		// TODO Auto-generated method stub
		int distance = 0;
		int low = 0;
		int high = arr[arr.length - 1] - arr[0];

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isItPossible(arr, mid, noc)) {
				distance = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			low++;
			high--;
		}
		return distance;
	}

	private static boolean isItPossible(int stall[], int mid, int noc) {
		// TODO Auto-generated method stub
		int cow = 1;
		int position = stall[0];
		for(int i=1;i<stall.length;i++) {
			int distance = stall[i]-position;
			if(distance>=mid) {
				cow++;
				position = stall[i];
			}
			if(cow==noc) {
				return true;
			}
		}
		return false;
	}

}
