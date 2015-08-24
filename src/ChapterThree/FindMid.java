package ChapterThree;

import ChapterThree.FindKthToTail.ListNode;

public class FindMid {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	//记着判断链表是不是为空、长度等情况
	public void findMid(ListNode head){
		ListNode slow=head;//走一步
		ListNode quick=head;//走两步
		
		while(quick.next!=null){
			if(quick.next.next!=null){
				quick=quick.next.next;
				slow=slow.next;
			}else{
				System.out.println("偶数ge"+slow.val);
				return;
			}
		}		
			System.out.println("奇数"+slow.val);
	}
	
	//延伸判断是否包含环
	//判断链表是否为空等情况
	public void judgeCircle(ListNode head){
		ListNode slow=head;
		ListNode quick=head;
		
		while(quick.next!=null){
			if(quick.next.next!=null){
				quick=quick.next.next;
				slow=slow.next;
				if(quick==slow){
					System.out.println("有环");
					return;
				}
			}else{
				System.out.println("无环");
			}
		}
		System.out.println("无环");
	}
	
	public static void main(String[] args){
		ListNode A=new ListNode(1);
		ListNode B=new ListNode(2);
		ListNode C=new ListNode(3);
		ListNode D=new ListNode(4);
		ListNode E=new ListNode(5);
		ListNode F=new ListNode(6);
		
		A.next=B;B.next=C;C.next=D;D.next=E;
		E.next=F;F.next=A;
		
		FindMid fm=new FindMid();
		//fm.findMid(A);
		fm.judgeCircle(A);
	}

}
