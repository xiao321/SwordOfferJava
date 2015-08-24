package ChapterFour;

import java.util.LinkedList;

public class IsPopOrder {
	
	public boolean isPopOrder(LinkedList<Integer> in,LinkedList<Integer> out){
		LinkedList<Integer> stack=new LinkedList<Integer>();
		if(in.size()!=out.size()) return false;
		if(in.isEmpty()&&out.isEmpty()) return false;
		while(!in.isEmpty()){
			if(in.peekFirst()==out.peekFirst()){
				stack.push(in.poll());
				out.poll();
				stack.pop();
			}else{
				if(stack.peek()==out.peekFirst()){
					out.poll();
					stack.pop();
				}else{
					stack.push(in.poll());
				}				
			}
		}
		
		while(!out.isEmpty()){
			if(!stack.isEmpty()){
				if(stack.peek()==out.peekFirst()){
					out.poll();
					stack.pop();
				}else{
					break;
				}
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		LinkedList<Integer> in=new LinkedList<Integer>();
		LinkedList<Integer> out=new LinkedList<Integer>();
		for(int i=1;i<=5;i++){
			in.add(i);
		}
		
//		out.add(4);
//		out.add(5);
//		out.add(3);
//		out.add(2);
//		out.add(1);
		
//		out.add(4);
//		out.add(3);
//		out.add(5);
//		out.add(1);
//		out.add(2);
		
		for(int i=1;i<=5;i++){
			in.add(1);
		}
		
		IsPopOrder ipo=new IsPopOrder();
		System.out.println(ipo.isPopOrder(in, out));
	}

}
