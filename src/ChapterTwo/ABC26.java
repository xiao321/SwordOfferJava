package ChapterTwo;

import java.util.HashMap;
import java.util.Map;

public class ABC26 {
	
	public String abc26(String str){
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<=26;i++)
			map.put((char)('A'+i), i+1);
		int value=0;
		for(int i=0;i<str.length();i++){
			int val=map.get(str.charAt(i));
			value=value*26+val;
		}
		
		return String.valueOf(value);
	}
	
	public static void main(String[] args){
		ABC26 abc=new ABC26();
		System.out.println(abc.abc26("ABC"));
	}

}
