import java.util.Scanner;

public class StringBasic {

	public StringBasic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("s1==s2:" + (s1 == s2));
		System.out.println("s1.equalss2:" + s1.equals(s2));

		String s3 = "Hello";
		String s4 = "Hello";
		System.out.println("Start");
		System.out.println("s3==s4:");
		System.out.println(s3 == s4);
		System.out.println("s3.equalss4:" + s3.equals(s4));

		String s5 = "Hello";
		String s6 = s5 + " Bye";
		String s7 = "Hello Bye";
		System.out.println(s6 == s7);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6.equals(s7));

		String inputVal = "VISHU";
		System.out.println("Length:" + inputVal.length());
		System.out.println("4th Index char:" + inputVal.charAt(4));
		System.out.println("Substr:" + inputVal.substring(0, 5));
		System.out.println("Substr:" + inputVal.substring(0));
		System.out.println("Substr:" + inputVal.substring(0, 2));
		System.out.println("concat:" + s5.concat(s6));

		String s8 = "HelloBye";
		String s9 = "Hello";
		String s10 = "Hello" + "Bye";
		System.out.println(s8 == s10);
		String s11 = s9 + "Bye";
		System.out.println(s8 == s11);

		System.out.println((int) '0');
		System.out.println((int) '9');

		// Capital A value is less than small a value
		System.out.println((int) 'a'); // ASCII value 97
		System.out.println((int) 'A'); // ASCII value 65

		String s12 = "a";
		String s13 = "b";
		String s14 = "b";
		String s15 = "c";
		System.out.println(s12.compareTo(s13));
		System.out.println(s13.compareTo(s12));
		System.out.println(s13.compareTo(s14));
		System.out.println(s15.compareTo(s14));

	}
}