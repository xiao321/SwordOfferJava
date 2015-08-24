package ChapterThree;

public class HasSubTree {
	static class Tree{
		int val;
		Tree left;
		Tree right;
		public Tree(int val){
			this.val=val;
		}
	}
	public boolean hasSubTree(Tree ta,Tree tb){
		boolean subtree=false;
		if(ta!=null&&tb!=null){
			if(ta.val==tb.val){
				subtree=judgeSameTree(ta,tb);
			}
			if(!subtree){
				subtree=hasSubTree(ta.left,tb);
			}
			if(!subtree){
				subtree=hasSubTree(ta.right,tb);
			}
		}		
		return subtree;
	}
	
	public boolean judgeSameTree(Tree ta,Tree tb){
		if(tb==null) return true;
		if(ta==null) return false;
		
		if(ta.val!=tb.val) return false;
		
		return judgeSameTree(ta.left,tb.left) && judgeSameTree(ta.right,tb.right);
		
	}
	
	public static void main(String[] args){
		Tree t1=new Tree(8);
		Tree t2=new Tree(8);
		Tree t3=new Tree(7);
		Tree t4=new Tree(9);
		Tree t5=new Tree(2);
		Tree t6=new Tree(4);
		Tree t7=new Tree(7);
		
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t5.left=t6;
		t5.right=t7;
		
		Tree t8=new Tree(8);
		Tree t9=new Tree(9);
		Tree t10=new Tree(2);
		
		t8.left=t9;
		t8.right=t10;
		
		HasSubTree hst=new HasSubTree();
		System.out.println(hst.hasSubTree(t1, t8));
		
		
	}

}
