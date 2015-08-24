package ChapterTwo;

import java.util.LinkedList;

/**
 * 
 *
 * 类名称：SQueue
 * 类描述：用两个栈实现队列
 * 创建人：肖丙贤
 * 修改人：
 * 修改时间：2015-8-16 下午6:32:19
 * 修改备注：
 * @version 1.0.0
 *
 */
public class SQueue {
	
	static LinkedList<Integer> A=new LinkedList<Integer>();
	static LinkedList<Integer> B=new LinkedList<Integer>();
	
	public void add(int val){
		A.push(val);
	}
	
	public boolean delete(){
		if(!B.isEmpty()){
			System.out.println(B.pop());
			return true;
		}else{
			if(A.isEmpty()) return false;
			else{
				while(!A.isEmpty()){
					B.push(A.pop());
				}
				System.out.println(B.pop());
				return true;
			}
		}
	}
	
	public static void main(String[] args){
		SQueue sq=new SQueue();
		A.push(2);
		A.push(3);
		System.out.println(sq.delete());
		System.out.println(sq.delete());
		System.out.println(sq.delete());
		
	}

}
