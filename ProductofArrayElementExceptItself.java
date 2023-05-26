import java.util.Scanner;

public class ProductofArrayElementExceptItself {

	public static int[] basicProductofArrayElementExceptItself(int[] num) {
		// TODO Auto-generated constructor stub
		int mul = 1;
		int i;
		for (i = 0; i < num.length; i++) {
			mul = mul * num[i];

		}
		int[] ans = new int[num.length];
		for (int j = 0; j < num.length; j++) {
			ans[j] = mul / num[j];
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// now take a input of size of an array
		int size = sc.nextInt();
		// declare or creating an array with size
		int[] arr = new int[size];
		// we are initializing an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// arr = basicProductofArrayElementExceptItself(arr);
		// arr = betterProductofArrayElementExceptItself(arr);
		arr = bestProductofArrayElementExceptItself(arr);

		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	private static int[] bestProductofArrayElementExceptItself(int[] arr) {
		// TODO Auto-generated method stub
		int[] leftArray = new int[arr.length];
		int[] rightArray = new int[arr.length];
		int[] ansArray = new int[arr.length];
		leftArray[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			leftArray[i] = leftArray[i - 1] * arr[i - 1];
		}
		rightArray[arr.length - 1] = 1;
		for (int j = arr.length - 2; j >= 0; j--) {
			rightArray[j] = rightArray[j + 1] * arr[j + 1];

		}
		for (int k = 0; k < arr.length; k++) {
			ansArray[k] = leftArray[k] * rightArray[k];
		}

		return ansArray;
	}

	private static int[] betterProductofArrayElementExceptItself(int[] num) {
		// TODO Auto-generated method stub
		int[] ans = new int[num.length];

		int total;
		for (int k = 0; k < num.length; k++) {
			int mulafter = 1;
			int mulbefore = 1;
			for (int i = k + 1; i < num.length; i++) {
				mulafter = mulafter * num[i];
			}
			for (int j = k - 1; j >= 0; j--) {
				mulbefore = mulbefore * num[j];
			}
			total = mulafter * mulbefore;
			ans[k] = total;
		}

		return ans;
	}

}
