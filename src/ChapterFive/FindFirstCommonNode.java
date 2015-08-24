package ChapterFive;

public class FindFirstCommonNode {
	
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
		}
	}
	
	public void find(ListNode one,ListNode two){
		//特例判断
		int len1=0;
		int len2=0;
		ListNode temp1=one;
		ListNode temp2=two;
		while(one!=null){
			len1++;
			one=one.next;
		}
		
		while(two!=null){
			len2++;
			two=two.next;
		}
		
		ListNode longlist=null;
		ListNode shortlist=null;
		int k=0;
		if(len1>=len2){
			longlist=temp1;
			shortlist=temp2;
			k=len1-len2;
		}else{
			longlist=temp2;
			shortlist=temp1;
			k=len2-len1;
		}
		
		for(int i=0;i<k;i++){
			longlist=longlist.next;
		}
		
		while(longlist!=null&&shortlist!=null){
			if(longlist==shortlist){
				System.out.println("longlist:"+longlist+" val:"+longlist.val);
				System.out.println("shortlist:"+shortlist+" val:"+shortlist.val);
				return;
			}
			longlist=longlist.next;
			shortlist=shortlist.next;
		}
	}
	
	public static void main(String[] args){
		ListNode one=new ListNode(1);
		ListNode two=new ListNode(2);
		ListNode three=new ListNode(3);
		ListNode four=new ListNode(4);
	    ListNode five=new ListNode(5);
	    ListNode six=new ListNode(6);
	    ListNode seven=new ListNode(7);
	    
	    one.next=two;two.next=three;three.next=six;six.next=seven;
	    
	    four.next=five;five.next=six;
	    
	    FindFirstCommonNode ffcn=new FindFirstCommonNode();
	    ffcn.find(one, four);
	}

}
