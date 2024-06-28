
public class CalculateNumberOfVowels {

	public static void main(String[] args) {
		String str = "Hello";
		int vowels =0;
		int consonants=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c== 'u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowel count is "+vowels);
		System.out.println("consonants count is "+consonants);
	}

}
