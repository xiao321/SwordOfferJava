package ChapterThree;

public class DeleteNode {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	
	public void delete(ListNode head,ListNode delnode){
		if(head==delnode&&head.next==null){
			head=null;
			System.out.println("删除成功");
			return;
		}
		
		else if(head!=delnode&&delnode.next==null){
			while(head.next!=delnode){
				head=head.next;
			}
			head.next=null;
			return;
		}
		
		else if(head==delnode&&head.next!=null){
			head.next=head.next.next;
		}
		
		else{
			delnode.val=delnode.next.val;
			delnode.next=delnode.next.next;
		}
	}

}
