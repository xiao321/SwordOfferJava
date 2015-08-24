package ChapterFive;

public class FindGreatestSumOfSubArray {
	
	//方法一枚举法 子数组之和
	public void maxSum1(int[] a){
		//数组检查不要忘了哈
		int sum=a[0];
		for(int z=0;z<a.length;z++){
			for(int i=1;i<=a.length;i++){
				int temp=0;
				for(int j=i-1;j<i+z&&j<a.length;j++){
					temp=temp+a[j];
					//System.out.println(temp);
				}
				if(temp>=sum){
					sum=temp;
				}
			}
		}
		
		System.out.println("最大值:"+sum);
	}
	
	//方法二 
	public void maxSum2(int[] a){
		//数组检查不要忘了哈
		int sum=0;
		int res=0;
		for(int i=0;i<a.length;i++){
            if(a[i]<0){
				res=sum;
			}
			sum=sum+a[i];
			System.out.println(sum);
			if(sum<a[i]){
				sum=a[i];
			}			
		}
		
		if(sum>res){
			res=sum;
		}
		System.out.println("最大和:"+res);
	}
	
	public static void main(String[] args){
		int[] a={1,-2,3,10,-4,7,2,-5};
		FindGreatestSumOfSubArray f=new FindGreatestSumOfSubArray();
		f.maxSum1(a);
		int[] b={1,2,3,4};
		f.maxSum2(b);
	}

}
