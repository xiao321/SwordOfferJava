package ChapterFive;

public class FindMinKs {
	
	public int partition(int[] a,int low,int high){
		int key=a[low];
		
		while(low<high){
			while(low<high&&a[high]>=key){
				high--;
			}
			if(a[high]<key){
				int temp=a[high];
				a[high]=a[low];
				a[low]=temp;
			}
			while(low<high&&a[low]<key){
				low++;
			}
			if(a[low]>key){
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
			}
		}
		
		return low;
	}
	
	public void find(int[] a,int k,int low,int high){
		if(a.length<k){
			System.out.println("invalid");
			return;
		}
		else if(a.length==k){
			System.out.println("array a");
			return;
		}
		else{
			int partition=partition(a,low,high);
			if(partition==k-1){
				for(int i=0;i<k;i++)
					System.out.println(a[i]+" ");
				return;
			}
			else if(partition<k-1){
				find(a,k,partition+1,high);
			}
			else{
				find(a,k,low,partition-1);
			}
		}
		
	}
	
	public static void main(String[] args){
		FindMinKs fmk=new FindMinKs();
		int [] a={4,5,1,6,2,7,3,8};
		
		fmk.find(a, 5, 0, a.length-1);
	}

}
