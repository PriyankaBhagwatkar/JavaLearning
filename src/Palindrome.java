
public class Palindrome {

	public static void main(String[] args) {
		String str = "level";
		String reverse ="";
		int length = str.length();
		for(int i =0;i<length;i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println("Reverse of the String = " + reverse);
		if(str.equals(reverse)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}

	}

}
