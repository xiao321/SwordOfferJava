package ChapterTwo;

import java.util.LinkedList;

public class PrintNode {
	static class Node{
		int val;
		Node next;
		public Node(int val){
			this.val=val;
		}
	}
	public void stackNode(Node head){
       LinkedList<Integer> list=new LinkedList<Integer>();
       
       if(head==null) System.out.println("空");
       
       Node node=head;
       
       while(node!=null){
    	   list.push(node.val);
    	   node=node.next;
       }
       
       while(!list.isEmpty()){
    	   System.out.println(list.pop());
       }

	}
	
	public void recursiveNode(Node head){
		if(head!=null){
            if(head.next!=null)
			    recursiveNode(head.next);
		}
		System.out.println(head.val);
	}
	
	public static void main(String[] args){
		Node head=new Node(1);
		Node A=new Node(2);
		Node B=new Node(3);
		Node C=new Node(4);
		head.next=A;
		A.next=B;
		B.next=C;
		PrintNode pn=new PrintNode();
		//pn.stackNode(head);
		System.out.println("*****");
		pn.recursiveNode(head);
	}

}
