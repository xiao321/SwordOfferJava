package ChapterFive;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
	//或者直接用Map
	public void first(String str){
		if(str.length()==0){
			System.out.println("字符串为空");
			return;
		}
		
		int [] a=new int[256];
		
		for(int i=0;i<str.length();i++){
			a[(int)str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++){
			if(a[(int)str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				return;
			}
		}
	}
	
	public static void main(String[] args){
		
		String str="abaccdeff";
		
		FirstNotRepeatingChar fnrc=new FirstNotRepeatingChar();
		fnrc.first(str);
		

	}

}
