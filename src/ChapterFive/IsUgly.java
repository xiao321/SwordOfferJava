package ChapterFive;

import java.util.LinkedList;

public class IsUgly {
	
	public boolean isUgly(int n){
		while(n%2==0){
			n=n/2;
		}
		
		while(n%3==0){
			n=n/3;
		}
		
		while(n%5==0){
			n=n/5;
		}
		
//		if(n==1) return true;
//		else return false;
		
		return n==1?true:false;
	}
	
	public int find(){
		int count=0;
		
		int i=1;
		
		while(count<1500){
			if(isUgly(i)) count++;
			i++;
		}
		
		return i;
	}
	
	//第二个方法
	public void getUgly(){
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(0,1);
		int next=1;
		//2 3 5开始的位置
		int a=0;
		int b=0;
		int c=0;
		
		while(next<1500){
			int min=2*list.get(a)>=3*list.get(b)?3*list.get(b):2*list.get(a);

			min=min>=5*list.get(c)?5*list.get(c):min;

			list.add(next,min);
			
			while(2*list.get(a)<=list.get(next)){
				a++;
			}
			
			while(3*list.get(b)<=list.get(next)){
				b++;
			}
			
			while(5*list.get(c)<=list.get(next)){
				c++;

			}

			next++;
		}
		
		System.out.println(list.size()+":"+list.getLast());
		
	}
	
	public static void main(String [] args){
		IsUgly iu=new IsUgly();
        //System.out.println(iu.find());
        iu.getUgly();
	}

}
