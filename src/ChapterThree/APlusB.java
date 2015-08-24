package ChapterThree;

public class APlusB {
	
	public void plus(int a,int b){
		String m=String.valueOf(a);
		String n=String.valueOf(b);
		
		int len=0;
		if(m.length()==n.length()) len=m.length();
		else if(m.length()>n.length()) len=m.length();
		else len=n.length();
		
		int[] res=new int[len];
		int z=len-1;
		int i=0,j=0;
		int carry=0;//进位
		for(i=m.length()-1,j=n.length()-1;i>=0&&j>=0;i--,j--){
			int val=(m.charAt(i)-'0')+(n.charAt(j)-'0')+carry;
			if(val>=10){
				val=val-10;
				carry=1;
				res[z]=val;
			}else{
				res[z]=val;
				carry=0;
			}
			//System.out.println(res[z]);
			z--;
		}
		//System.out.println(z);
		if(i>=0){
			while(i>=0){
				res[z--]=m.charAt(i--)-'0';
			}
		}
		
		if(j>=0){
			while(j>=0){
				res[z--]=n.charAt(j--)-'0';
			}
		}
		
		for(int r:res)
			System.out.print(r);
	}
	
	public static void main(String[] args){
		APlusB p=new APlusB();
		p.plus(12, 123);
	}

}
