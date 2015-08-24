package ChapterTwo;

import java.util.LinkedList;

public class TreeTraversal {
	
	static class Tree{
		Tree left;
		Tree right;
		int val;
		public Tree(int val){
			this.val=val;
		}
	}
	
	public void preOrder(Tree tree){
		System.out.println(tree.val);
		if(tree.left!=null)
			preOrder(tree.left);
		if(tree.right!=null)
			preOrder(tree.right);
	}
	
	public void inOrder(Tree tree){
		if(tree.left!=null)
			inOrder(tree.left);
		System.out.println(tree.val);
		if(tree.right!=null)
			inOrder(tree.right);
	}
	
	public void postOrder(Tree tree){
		if(tree.left!=null)
			postOrder(tree.left);
		if(tree.right!=null)
			postOrder(tree.right);
		System.out.println(tree.val);
	}
	
	public void hierarchicalOrder(Tree tree){
		LinkedList list=new LinkedList();
		list.add(tree);
		while(!list.isEmpty()){
			
			Tree t=(Tree)list.poll();
			System.out.println(t.val);
		
			if(t.left!=null){
				list.add(t.left);
			}
			if(t.right!=null){
				list.add(t.right);
			}
		}		
	}
	
	public static void main(String[] args){
		Tree head=new Tree(2);
		Tree A=new Tree(3);
		Tree B=new Tree(5);
		Tree C=new Tree(7);
		
		head.left=A;
		head.right=B;
		A.left=C;
		
		TreeTraversal tt=new TreeTraversal();
		tt.hierarchicalOrder(head);
	}

}
