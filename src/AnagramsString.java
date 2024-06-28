import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		boolean anagramstat = false;
		String str1 = "Race";
		String str2 = "Care";
		
		if(str1.length()!=str2.length()) {
			System.out.println(str1 + "and" + str2 + " not anagrams String.");
		}else {
			char[] anagram1 = str1.toLowerCase().toCharArray();
			char[] anagram2 = str2.toLowerCase().toCharArray();
			Arrays.sort(anagram1);
			Arrays.sort(anagram2);
			anagramstat = Arrays.equals(anagram1, anagram2);
		}
		
		if(anagramstat == true) {
			System.out.println("anagrams string");
		}else {
			System.out.println("not anagram string");
		}
	}

}
