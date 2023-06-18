
public class PrintAllSubString {

	public PrintAllSubString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "SAMPLE";

		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length() + 1; j++) {
				System.out.println(input.substring(i,j));
			}
		}
	}

}
