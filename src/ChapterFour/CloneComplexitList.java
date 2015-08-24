package ChapterFour;

import java.util.HashMap;
import java.util.Map;

public class CloneComplexitList {
	
	static class ComplexitList{
		String val;
		ComplexitList next;
		ComplexitList sibling;
		public ComplexitList(String val){
			this.val=val;
		}
	}
	
	public ComplexitList clone(ComplexitList list){
		Map<ComplexitList,ComplexitList> map=new HashMap<ComplexitList,ComplexitList>();
		
		if(list==null) return null;
		ComplexitList newlist=new ComplexitList(list.val);
		ComplexitList com=newlist;
		ComplexitList old=list;
		map.put(list,newlist);
		while(list.next!=null){
			ComplexitList temp=new ComplexitList(list.next.val);
			map.put(list.next,temp);
			com.next=temp;
			com=temp;
			list=list.next;
		}
		
		while(old!=null){
			if(old.sibling!=null){
				ComplexitList temp=map.get(old);
				temp.sibling=map.get(old.sibling);
			}
			old=old.next;
		}
		
		return newlist;
	}
	
	
	public ComplexitList clone1(ComplexitList list){
		
		if(list==null) return null;
		ComplexitList com=list;
		
		//第一步插入新节点
		while(list!=null){
			ComplexitList temp=new ComplexitList(list.val);
			temp.next=list.next;
			list.next=temp;
			list=temp.next;
		}
		
		//第二步设置sibling
		ComplexitList temp=com;
		while(temp!=null){
			if(temp.sibling!=null){
				temp.next.sibling=temp.sibling.next;
			}
			temp=temp.next.next;
		}
		
		
		//第三步分离
		ComplexitList res=com.next;
		ComplexitList finalres=res;
		while(res!=null){
			if(res.next!=null){
				res.next=res.next.next;
				res=res.next;
			}else{
				break;
			}
		}
		
		
		return finalres;
	}
	
	public static void main(String[] args){
		ComplexitList A=new ComplexitList("A");
		ComplexitList B=new ComplexitList("B");
		ComplexitList C=new ComplexitList("C");
		ComplexitList D=new ComplexitList("D");
		ComplexitList E=new ComplexitList("E");
		
		A.next=B;B.next=C;C.next=D;D.next=E;
		A.sibling=C;B.sibling=E;D.sibling=B;
		
		CloneComplexitList ccl=new CloneComplexitList();
		//ComplexitList com=ccl.clone(A);
		ComplexitList com=ccl.clone1(A);
		
		while(com!=null){
			System.out.println("val="+com.val);
			if(com.sibling!=null){
				System.out.println("sibling"+com.sibling.val);
			}
			com=com.next;
		}
		
		int a;int b;
		a=b=3;
		System.out.println(a+" "+b);
	}

}
