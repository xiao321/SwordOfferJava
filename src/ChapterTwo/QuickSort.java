package ChapterTwo;

public class QuickSort {
	
	public int partition(int[] a,int start,int end){
		if(a.length==0) return -1;
		int key=a[start];//*****
		while(start<end){
			while(a[end]>=key&&end>start){
				System.out.println(end);
				end--;
			}
			if(a[end]<key){
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
				
			while(a[start]<=key&&start<end){
				start++;
			}
			if(a[start]>key){
				int temp=a[end];
				a[end]=a[start];
				a[start]=temp;
			}	
		}
		
		return start;
	}
	
	public void quickSort(int[] a,int start,int end){
		if(start<end){
			int partition=partition(a,start,end);
			quickSort(a,start,partition-1);
			quickSort(a,partition+1,end);
		}
	}
	
	
	
	public static void main(String[] args){
		int[] a={49,38,65,97,76,13,27,49};
		QuickSort qs=new QuickSort();
		qs.quickSort(a, 0, a.length-1);
		for(int i:a)
			System.out.println(i);
	}

}
