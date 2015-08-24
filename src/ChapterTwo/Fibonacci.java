package ChapterTwo;

public class Fibonacci {
	
	public void fibonacci(int n){
		int a0=0;
		int a1=1;
		if(n==0) System.out.println(a0);
		else if(n==1) System.out.println(a1);
		else{
			int c=0;
			int b=a1;
			int a=a0;
			for(int i=2;i<=n;i++){
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			//System.out.println(c);
		}		
	}
	
	public int recursiveFibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
	
	public int Factorial(int n){
		if(n==0) return 1;
		
		return 2*Factorial(n-1);
	}
	public static void main(String[] args){
		Fibonacci fi=new Fibonacci();
		//fi.fibonacci(10);
		//System.out.println(fi.recursiveFibonacci(9));
		System.out.println(fi.Factorial(4));
	}

}
