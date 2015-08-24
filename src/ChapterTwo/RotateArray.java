package ChapterTwo;

public class RotateArray {
	
	public void rotateArray(int[] a,int low,int high){
		int mid=(low+high)/2;
		if(low==high) System.out.println(a[mid]);
		if(low<high){
			if(a[mid]<a[mid+1]&&a[mid]<a[mid-1]){
				System.out.println(a[mid]);
			}else{
				if(a[mid]>a[high]){
					rotateArray(a,mid+1,high);
				}
				if(a[mid]<a[high]){
					rotateArray(a,low,mid-1);
				}
			}			
		}		
	}
	
	public static void main(String[] args){
		int[] a={8,9,10,11,14,3,4,5,6};
		RotateArray ra=new RotateArray();
		ra.rotateArray(a, 0, a.length-1);
	}

}
