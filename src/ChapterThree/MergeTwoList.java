package ChapterThree;

public class MergeTwoList {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	
	public void merge(ListNode A,ListNode B){
		ListNode C=null;
		ListNode res=null;
		//A为空，则直接输出B
		//B为空，则直接输出A
		//A B都为空，则输出null
		
		//现在处理A B不为空的情况
		
		while(A!=null&&B!=null){
			if(A.val<=B.val){
				if(C==null){
					C=A;
					res=C;
					A=A.next;
				}else{
					C.next=A;
					C=A;
					A=A.next;
				}
			}else{
				if(C==null){
					C=B;
					res=C;
					B=B.next;
				}else{
					C.next=B;
					C=B;
					B=B.next;
				}
			}
		}
		
		if(A!=null) C.next=A;
		if(B!=null) C.next=B;
		
		while(res!=null){
			System.out.println(res.val);
			res=res.next;
		}
	}
	
	public ListNode recursiveMerge(ListNode A,ListNode B){
		
		ListNode C=null;
		
		if(A==null){
			return B;
		}
		if(B==null){
			return A;
		}
		
		//判断特殊情况
		if(A.val>=B.val){
			C=B;
			C.next=recursiveMerge(A,B.next);
		}else{
			C=A;
			C.next=recursiveMerge(A.next,B);
		}
		
		return C;
	}
	
	public static void main(String[] args){
		MergeTwoList mtl=new MergeTwoList();
		ListNode one=new ListNode(1);
		ListNode three=new ListNode(3);
		ListNode five=new ListNode(5);
		ListNode seven=new ListNode(7);
		
		one.next=three;three.next=five;five.next=seven;
		
	    ListNode two=new ListNode(2);
	    ListNode four=new ListNode(4);
	    ListNode six=new ListNode(6);
	    ListNode eight=new ListNode(8);
	    
	    two.next=four;four.next=six;six.next=eight;
	    
	    mtl.merge(one, two);
//	    ListNode m=mtl.recursiveMerge(one, two);
//	    while(m!=null){
//	    	System.out.println(m.val);
//	    	m=m.next;
//	    }
	    
	}

}
