package ChapterThree;

import java.util.LinkedList;

import ChapterThree.FindKthToTail.ListNode;

public class ReverseList {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	//是否為空，是否只有一個節點等情況
	public void reverseList(ListNode head){
		LinkedList<ListNode> list=new LinkedList<ListNode>();
		
		while(head!=null){
			list.push(head);
			head=head.next;
		}
		
		ListNode pre=list.pop();
		ListNode res=pre;
		while(!list.isEmpty()){
			ListNode temp=list.pop();
			pre.next=temp;
			pre=temp;
		}
		pre.next=null;//小心出現環
		
		ListNode temp=res;
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	//鏈錶長度
	public void reverseList1(ListNode head){
		ListNode current=head;
		ListNode pre=null;
		
		while(current!=null){			
			ListNode next=current.next;
			//if(next==null) break;
			
			current.next=pre;
			pre=current;
			current=next;
		}
		
		
		while(pre!=null){
			System.out.println(pre.val);
			pre=pre.next;
		}
	}
	
	public void recursiveReverseList(ListNode head){
		if(head==null){
			return;
		}
		recursiveReverseList(head.next);
		System.out.println(head.val);
	}
	
	public static void main(String[] args){
		ListNode A=new ListNode(1);
		ListNode B=new ListNode(2);
		ListNode C=new ListNode(3);
		ListNode D=new ListNode(4);
		ListNode E=new ListNode(5);
		ListNode F=new ListNode(6);
		
		A.next=B;B.next=C;C.next=D;D.next=E;E.next=F;
		
		ReverseList rl=new ReverseList();
		//rl.reverseList(A);
		rl.reverseList1(A);
	}

}
