package ChapterFive;

import java.util.HashMap;
import java.util.Map;

public class InversePairs {
	
	public void inversePairs(int[] a,int index,Map<String,Integer> map){
		
		if(index==a.length){
			System.out.println(map.get("num"));
			return;
		}
		
		for(int i=index+1;i<a.length;i++){
			if(a[index]>a[i]){
				System.out.println("("+a[index]+","+a[i]+")");
				map.put("num",map.get("num")+1);
			}
		}
		
		inversePairs(a,index+1,map);
		
	}
	
	public static void main(String[] args){
		int[] a={7,5,6,4};
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("num", 0);
		InversePairs ip=new InversePairs();
		ip.inversePairs(a, 0, map);
		
	}

}
