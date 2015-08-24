package ChapterThree;

public class ReorderOddEven {
//odd奇数 even偶数
	public void reorder(int[] a){
		int low=0;
		int high=a.length-1;
		while(low<high){
			while(low<=high&&(a[high]&1)==1){
				high--;
			}
			if((a[high]&1)==0){
				int temp=a[high];
				a[high]=a[low];
				a[low]=temp;
			}
			while(low<=high&&(a[low]&1)==0){
				low++;
			}
			if((a[low]&1)==1){
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
			}
		}
				
		for(int i:a)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args){
		int [] a={1,2,3,4,5,6,7,8,9,0};
		ReorderOddEven roe=new ReorderOddEven();
		roe.reorder(a);
	}
}
