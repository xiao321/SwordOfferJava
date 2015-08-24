package ChapterFour;

import java.util.LinkedList;

public class FindPath {
	
	static class Tree{
		int val;
		Tree left;
		Tree right;
		public Tree(int val){
			this.val=val;
		}
	}
	
	public void find(Tree root,LinkedList<Integer> list,int key){
		if(root==null) return;
		list.push(root.val);
		if(root.left==null&&root.right==null){
			int sum=0;
			for(int i=0;i<list.size();i++){
				sum=sum+list.get(i);
			}
			System.out.println("*****"+sum);
			if(sum==key){
				for(int i=0;i<list.size();i++)
					System.out.println(list.get(i));
			}
			//System.out.println("######"+list.pop());
			//return;
		}
				
		if(root.left!=null){			
			find(root.left,list,key);
		}

		if(root.right!=null){
			find(root.right,list,key);
		}
		
		list.pop();
	}
	
	
	public static void main(String[] args){
		Tree t1=new Tree(10);
		Tree t2=new Tree(5);
		Tree t3=new Tree(12);
		Tree t4=new Tree(4);
		Tree t5=new Tree(7);
		
		t1.left=t2;t1.right=t3;
		t2.left=t4;t2.right=t5;
		
		FindPath fp=new FindPath();
		LinkedList<Integer> list=new LinkedList<Integer>();
		fp.find(t1,list,22);		
	}

}
