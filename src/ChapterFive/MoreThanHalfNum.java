package ChapterFive;

public class MoreThanHalfNum {
	
	//分区方法 k/2
	public int partition(int[] a,int low,int high){
		int k=a[low];
		
		while(low<high){
			while(low<high&&a[high]>=k){
				high--;
			}
			if(a[high]<k){
				int temp=a[high];
				a[high]=a[low];
				a[low]=temp;
			}
			
			while(low<high&&a[low]<k){
				low++;
			}
			if(a[low]>k){
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
			}
		}
		
		return low;

	}
	
	public void quickSort(int[] a,int low,int high){	
		if(low<high){
			int partition=partition(a,low,high);
//			if(partition==a.length/2){
//				System.out.println(a[partition]);
//				return;
//			}else{
//				quickSort(a,low,partition-1);
//				quickSort(a,partition+1,high);
//			}
			
			if(partition==a.length/2){
				System.out.println(a[partition]);
				return;
			}else if(partition<a.length/2){
				quickSort(a,partition+1,high);
				
			}else{
				quickSort(a,low,partition-1);
			}
		}
	}
	
	
	//第二种方法 如果相同则加1，不同则减1，第一个为1的数即为所求
	//时间复杂度为O(n)
	public int findk(int[] a){
		int find=0;
		int k=0;
		int res=0;
		for(int i=0;i<a.length;i++){
			if(find==0){
				k=a[i];
				res=k;
				find++;
			}else{
				if(k==a[i]) find++;
				else find--;
			}
		}
		//res对结果进行检查是否超过了一半
		return res;
	}
	
	
	
	public static void main(String[] args){
		int[] a={1,3,3,3,3,3,5,4,2};
		MoreThanHalfNum mthn=new MoreThanHalfNum();
		mthn.quickSort(a, 0, a.length-1);
	    System.out.println(mthn.findk(a));
	}

}
