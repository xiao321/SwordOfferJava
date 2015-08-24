package ChapterFour;

import java.util.LinkedList;

public class TreeToTwoWayLinkedList {
	
	static class Tree{
		int val;
		Tree left;
		Tree right;
		public Tree(int val){
			this.val=val;
		}
	}
	//中序遍历
	public void convert(Tree root,LinkedList<Tree> last){
		if(root==null) return;
		if(root.left!=null){
			convert(root.left,last);
		}
		
		if(last.isEmpty()){
			root.left=null;
		}else{
			root.left=last.getLast();
		}
		
		if(!last.isEmpty()){
			last.getLast().right=root;
		}
		last.add(root);
		//System.out.println("****"+last.val);
		if(root.right!=null){
			convert(root.right,last);
		}
		
	}
	
	public void inOrder(Tree root){
		if(root==null) return;
		if(root.left!=null){
			inOrder(root.left);
		}
		System.out.println(root.val);
		if(root.right!=null){
			inOrder(root.right);
		}
	}
	
	//
	public void output(Tree root){
		LinkedList<Tree> last=new LinkedList<Tree>();
		convert(root,last);
		//last指向双向列表尾
		Tree head=last.getFirst();
		while(head!=null){
			System.out.println(head.val);
			head=head.right;
		}
	}
	
	public void test(Tree root,Tree temp){
		temp=root;
	}
	
	public static void main(String[] args){
		Tree t1=new Tree(10);
		Tree t2=new Tree(6);
		Tree t3=new Tree(14);
		Tree t4=new Tree(4);
		Tree t5=new Tree(8);
		Tree t6=new Tree(12);
		Tree t7=new Tree(16);
		
		t1.left=t2;t1.right=t3;
		t2.left=t4;t2.right=t5;
		t3.left=t6;t3.right=t7;
		
		TreeToTwoWayLinkedList con=new TreeToTwoWayLinkedList();
		//con.inOrder(t1);

		con.output(t1);
		
	}

}
