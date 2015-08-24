package ChapterThree;

public class PrintNDigits {
	
	public void printDigits(int n){
		int[] c=new int[n];
		for(int i=0;i<n;i++){
			c[i]=0;
		}		
		boolean isMax=false;//判断是不是最大值
		while(!isMax){			
			int carry=0;//进位
			for(int i=n-1;i>=0;i--){
				int val=c[i]+carry;//先于进位符相加,在自++
				if(i==n-1) val++;
				if(val>=10){
					if(i==0){
						isMax=true;
						break;
					}else{
						carry=1;
						c[i]=val-10;
					}
				}else{
					c[i]=val;
					break;
				}
			}
			if(!isMax){
				for(int i:c)
					System.out.print(i);
				System.out.println();
			}			
		}			
	}
	//全排列
	public void recursive(int[] a,int index ){
		if(index==a.length) {
			for(int i:a)
				System.out.print(i);
			System.out.println();
			return;
		}
		
		for(int i=0;i<10;i++){
			a[index]=i;
			recursive(a,index+1);
		}
	}
	
	public void recursivePrint(int n){
		int index=0;
		int[] a=new int[n];
		for(int i=0;i<10;i++){
			a[index]=i;
			recursive(a,index+1);
		}
	}
	
	public void recursivePrintDigit(int[] a,int index,int n){
		if(index==n){
			for(int i:a)
				System.out.print(i);
			System.out.println();
			return;
		}
		
		for(int i=0;i<10;i++){
			a[index]=i;
			recursivePrintDigit(a,index+1,n);
		}
	}
	
	public static void main(String[] args){
		PrintNDigits pnd=new PrintNDigits();
		//pnd.printDigits(3);
		//pnd.recursivePrint(3);
		int[] a=new int[3];
		pnd.recursivePrintDigit(a, 0,3);
	}

}
