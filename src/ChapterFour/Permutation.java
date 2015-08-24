package ChapterFour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
	//排列
	public void permutation(char[] a,String str,int index){
		if(index==str.length()){
			System.out.println(new String(a));
			return;
		}
		for(int i=0;i<str.length();i++){
			a[index]=str.charAt(i);
			permutation(a,str,index+1);
		}
		
	}
	
	//全排列
	public void fullPermutation(char[] a,int index){
		if(index==a.length){
        	System.out.println(new String(a));
        	return;
        }      
		for(int i=index;i<a.length;i++){
			char temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			fullPermutation(a,index+1);	
			//为了还原数组，为了下一次交换
			temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
	    
	}
	
	//求组合
	public void combination(char[] a,int index,int end,LinkedList<Character> list){
		
		if(list.size()==end){
			for(Character c:list)
				System.out.print(c);
			System.out.println();
			return;
		}
		//不能放到首行
		if(index==a.length) return;
		
		list.push(a[index]);
		combination(a,index+1,end,list);
		list.pop();
		combination(a,index+1,end,list);
		
	}
	
	//正方体八个顶点  三组相对的面上的4个顶点的和相等
	public void vertexSum(int[] a,int index){
		if(index==a.length){
			if(a[0]+a[1]+a[2]+a[3]==a[4]+a[5]+a[6]+a[7]&&
					a[0]+a[2]+a[4]+a[6]==a[2]+a[4]+a[6]+a[7]&&
					a[0]+a[1]+a[4]+a[5]==a[2]+a[3]+a[6]+a[7]){
				for(int i:a)
					System.out.print(i);
				System.out.println();
				return;
			}else
			   return;
		}
		for(int i=index;i<a.length;i++){
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			
			vertexSum(a,index+1);
			
			temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		//return false;
	}
	
	//八皇后问题  全排列 对角线
	public void queen(int[]a,int index){
		if(index==a.length){
			boolean flag=true;
			for(int i=0;i<a.length;i++)
				for(int j=i+1;j<a.length;j++)
					if(i-j==a[i]-a[j]||j-i==a[i]-a[j]) flag=false;
			if(flag){
				for(int i=0;i<a.length;i++)
					System.out.print(a[i]);
				System.out.println();
			}
			return;
		}
		
		for(int i=index;i<a.length;i++){
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			queen(a,index+1);
			temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
	}
	
	public static void main(String[] args){
		Permutation per=new Permutation();
		String str="abcd";
		char[] a=new char[]{'a','b','c','d'};
		
		//per.permutation(a, str, 0);
		//per.fullPermutation(a,  0);
		
		//LinkedList<Character> list=new LinkedList<Character>();
		//for(int i=1;i<=a.length;i++)
		    //per.combination(a, 0, 2,list);
//		int[] b={1,2,3,5,6,7,8,9};
//		per.vertexSum(b, 0);
		
		int[] c={0,1,2,3,4,5,6,7};
		per.queen(c, 0);
	
	}

}
