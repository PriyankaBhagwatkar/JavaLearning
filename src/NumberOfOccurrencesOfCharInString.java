import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrencesOfCharInString {

	public static void main(String[] args) {
		Map<Character,Integer> mapOfOccurenceCount = new HashMap<>();
		String str = "level";
		int length = str.length();
		int count = 0;
		char search = 'e';
		for(int i=0;i<length;i++) {
			if(str.charAt(i)==search) {
				count++;
				mapOfOccurenceCount.put(str.charAt(i), count);
			}
		}
		System.out.println(mapOfOccurenceCount);
	}

}
