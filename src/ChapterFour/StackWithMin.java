package ChapterFour;

import java.util.LinkedList;

public class StackWithMin {
	
	LinkedList<Integer> list=new LinkedList<Integer>();
	LinkedList<Integer> assit=new LinkedList<Integer>();
	
	public void push(int val){
		list.push(val);
		if(assit.isEmpty()){
			assit.push(val);
		}else{
			int min=assit.peek();
			if(val>min){
				assit.push(min);
			}else{
				assit.push(val);
			}
		}
	}
	
	public void pop(){
		if(!list.isEmpty()&&!assit.isEmpty()){
			list.pop();
			assit.pop();
		}
	}
	
	public void min(){
		if(!assit.isEmpty()){
			System.out.println(assit.peek());
		}else{
			System.out.println("空");
		}
		
	}
	
	public static void main(String[] args){
		StackWithMin swm=new StackWithMin();
		swm.min();
		swm.push(8);
		swm.push(9);
		swm.push(10);
		swm.min();
		swm.push(6);
		swm.push(3);
		swm.min();
		swm.pop();
		swm.min();
	}

}
