package ChapterTwo;

import java.util.ArrayList;

public class MergeArray {
	
	public void mergeArray(int[] a,int[] b){
		int[] c=new int[a.length+b.length];
		int alen=a.length-1;
		int blen=b.length-1;
		int i=c.length-1;
		for(;i>=0&&blen>=0&&alen>=0;i--){
			if(b[blen]>=a[alen]){
				c[i]=b[blen--];
			}else{
				c[i]=a[alen--];
			}
		}
		if(alen>=0){
			while(i>=0&&alen>=0)
			c[i--]=a[alen--];
		}
		if(blen>=0){
			while(i>=0&&blen>=0){
				c[i--]=b[blen--];
			}
		}
		
		for(int n:c)
			System.out.println(n);
	}
	
	public static void main(String[] args){
		MergeArray ma=new MergeArray();
		int[] a={1,2,3,4};
		int[] b={3,4,8,9,12};
		ma.mergeArray(a, b);
	}

}
