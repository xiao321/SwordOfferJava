package ChapterTwo;

public class NumberOf1 {
	
	public int numberOf1(int n){
		int count=0;
		int flag=1;
		for(int i=0;i<32;i++){
			if((n&flag)==flag) count=count+1;
			flag=flag<<1;
		}
		
		return count;
	}
	
	
	public int numberOf2(int n){
		int count=0;
		while(n!=0){
			count++;
			n=(n-1)&n;			
		}
		
		return count;
	}
	/***负数位移 是以补码的形式***/
	public static void main(String[] args){
		NumberOf1 no=new NumberOf1();
		System.out.println(no.numberOf1(1));
		System.out.println(no.numberOf2(1));
		System.out.println((1.0/3)-0.33);
	}

}
