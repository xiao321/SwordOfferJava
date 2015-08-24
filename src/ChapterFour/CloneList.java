package ChapterFour;

public class CloneList {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	
	public ListNode cloneListNode(ListNode head){
		if(head==null) return null;
		
		ListNode newhead=new ListNode(head.val);
		ListNode res=newhead;
		while(head!=null){
			ListNode temp=null;
			if(head.next!=null){
				temp=new ListNode(head.next.val);
			}
			
			newhead.next=temp;
			newhead=temp;
			head=head.next;
		}
		
		return res;
	}
	
	public static void main(String[] args){
		ListNode list=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(4);
		
		list.next=n1;n1.next=n2;n2.next=n3;
		
		CloneList cl=new CloneList();
		ListNode node=cl.cloneListNode(list);
		
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
		
		
	}

}
