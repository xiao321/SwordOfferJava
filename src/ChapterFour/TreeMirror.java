package ChapterFour;

public class TreeMirror {
	static class Tree{
		int val;
		Tree left;
		Tree right;
		public Tree(int val){
			this.val=val;
		}
	}
	public void traversalTree(Tree tree){
		System.out.println(tree.val);
		if(tree.left!=null){
			traversalTree(tree.left);
		}
		if(tree.right!=null){
			traversalTree(tree.right);
		}		
	}
	
	public void treeMirror(Tree tree){
		//或者tree==null return; 
		//tree.left==null&&tree.right==null return;
		if(tree!=null){
			Tree temp=tree.left;
			tree.left=tree.right;
			tree.right=temp;
		}
		if(tree.left!=null){
			treeMirror(tree.left);
		}
		if(tree.right!=null){
			treeMirror(tree.right);
		}		
	}
	
	public static void main(String[] args){
		Tree t1=new Tree(8);
		Tree t2=new Tree(6);
		Tree t3=new Tree(10);
		Tree t4=new Tree(5);
		Tree t5=new Tree(7);
		Tree t6=new Tree(9);
		Tree t7=new Tree(11);
		
		t1.left=t2;t1.right=t3;
		t2.left=t4;t2.right=t5;
		t3.left=t6;t3.right=t7;
		
		TreeMirror tm=new TreeMirror();
		tm.traversalTree(t1);
		System.out.println("********");
		tm.treeMirror(t1);
		tm.traversalTree(t1);
	}

}
