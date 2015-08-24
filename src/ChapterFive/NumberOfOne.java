package ChapterFive;

public class NumberOfOne {
	
	public void numberOf1(int n){
		int count=0;
		
		for(int i=1;i<=n;i++){
			int temp=i;
			while(temp!=0){
				if(temp%10==1) count++;
				temp=temp/10;				
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		NumberOfOne moo=new NumberOfOne();
		moo.numberOf1(12);
	}

}
