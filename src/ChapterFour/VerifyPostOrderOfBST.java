package ChapterFour;

public class VerifyPostOrderOfBST {
	
	public boolean verify(int[] a,int start,int end){
		int root=a[end];
		
		if(start==end){
			return true;
		}
		
		int left=start;
		//左子树
		for(int i=start;i<=end-1;i++){
			if(a[i]<root) left++;
		}
		
		int right=left;
		
		//右子树
		for(int i=right;i<=end-1;i++){
			if(a[i]<root){			
				return false;
			}else{
				right++;
			}
		}
		
		boolean isLeft=true;
		if(left>start){
			isLeft=verify(a,start,left-1);
		}
		
		boolean isRight=true;
		if(left<end-1){
			isRight=verify(a,right,end-1);
		}
		
		return isLeft&&isRight;
	}
	
	public static void main(String[] args){
		int [] a={5,7,6,9,11,10,8};
		int[] b={7,4,6,5};
		VerifyPostOrderOfBST vpoob=new VerifyPostOrderOfBST();
		//System.out.println(vpoob.verify(a, 0, a.length-1));
		System.out.println(vpoob.verify(b, 0, b.length-1)); 
	}

}
