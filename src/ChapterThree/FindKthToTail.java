package ChapterThree;

public class FindKthToTail {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	//但是要注意head为空、k大于list的长度、k==0
	public void findKthToTail(ListNode head,int k){
		if(head==null||k==0){
			System.out.println("head为空");
			return;
		}
		//...等等判断条件
		ListNode temp=head;
		while(k>0){
			head=head.next;
			k--;
		}
		
		while(head!=null){
			temp=temp.next;
			head=head.next;
		}
		
		System.out.println(temp.val);
		
	}
	
	public static void main(String[] args){
		ListNode A=new ListNode(1);
		ListNode B=new ListNode(2);
		ListNode C=new ListNode(3);
		ListNode D=new ListNode(4);
		ListNode E=new ListNode(5);
		ListNode F=new ListNode(6);
		
		A.next=B;B.next=C;C.next=D;D.next=E;E.next=F;
		
		FindKthToTail fk=new FindKthToTail();
		fk.findKthToTail(A, 2);
	}

}
