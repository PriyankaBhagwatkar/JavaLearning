import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		String s = "aaabbaacccc";
		int count =0;
	
		char[] charArr = s.toCharArray();
		for(int i = 0 ; i <=charArr.length;i++) {
			for(int j=0;j<=charArr.length;j++) {
			if(charArr[i] == charArr[j]) {
				count++;
				map.put(charArr[i],count);
				//System.out.println(charArr[i] + count);
			}
			}
		}
		System.out.println(map);
	}

}
