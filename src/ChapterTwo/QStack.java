package ChapterTwo;

import java.util.LinkedList;

/**
 * 
 *
 * 类名称：QStack
 * 类描述：用两个队列实现栈
 * 创建人：肖丙贤
 * 修改人：
 * 修改时间：2015-8-16 下午6:53:41
 * 修改备注：
 * @version 1.0.0
 *
 */
public class QStack {
	
	static LinkedList<Integer> A=new LinkedList<Integer>();
	static LinkedList<Integer> B=new LinkedList<Integer>();
	
	public void add(int val){
		A.add(val);
	}
	
	public boolean delete(){
		if(A.isEmpty()&&B.isEmpty()) return false;
		else if(!A.isEmpty()&&!B.isEmpty()){
			while(!A.isEmpty()){
				int val=A.poll();
				if(A.isEmpty()){
					System.out.println(val);
					return true;
				}else{
					B.add(val);
				}
			}
		}
		else if(!A.isEmpty()&&B.isEmpty()){
			while(!A.isEmpty()){
				int val=A.poll();
				if(A.isEmpty()){
					System.out.println(val);
					return true;
				}else{
					B.add(val);
				}
			}
		}
		else{
			while(!B.isEmpty()){
				int val=B.poll();
				if(B.isEmpty()){
					System.out.println(val);
					return true;
				}else{
					A.add(val);
				}
			}
		}
		return false;
		
	}
	
	public static void main(String[] args){
		QStack qs=new QStack();
		qs.add(2);
		qs.add(4);
		System.out.println(qs.delete());
		qs.add(5);
		System.out.println(qs.delete());
		System.out.println(qs.delete());
	}

}
