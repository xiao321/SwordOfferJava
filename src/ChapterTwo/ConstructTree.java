package ChapterTwo;

import java.util.LinkedList;

import ChapterTwo.TreeTraversal.Tree;

public class ConstructTree {
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	public TreeNode constructTree(int[] a,int starta,int enda,int[] b,int startb,int endb){
		if(a.length==0||b.length==0) return null;
		
		TreeNode root=new TreeNode(a[starta]);
		System.out.println("节点"+a[starta]);
		if(starta==enda){
			if(startb==endb&&a[starta]==b[startb]){
				System.out.println("**************");
				return root;
			}				
		}
		
		int temp=startb;
		
		for(int i=startb;i<=endb;i++){
			if(b[i]==a[starta]) temp=i;
		}
		
		if(temp==endb-startb&&b[temp]!=b[endb]) return null;
		System.out.println("temp"+temp);
		
		int leftlen=temp-startb;
		int rightlen=endb-temp;
		
		if(leftlen>0){
			root.left=constructTree(a,starta+1,starta+leftlen,b,startb,temp-1);
		}			
		if(rightlen>0){
			root.right=constructTree(a,starta+leftlen+1,enda,b,temp+1,endb);
		}
		
		
		return root;
	}
	
	public void hierarchicalOrder(TreeNode tree){
		LinkedList list=new LinkedList();
		list.add(tree);
		while(!list.isEmpty()){
			
			TreeNode t=(TreeNode)list.poll();
			System.out.println(t.val);
		
			if(t.left!=null){
				list.add(t.left);
			}
			if(t.right!=null){
				list.add(t.right);
			}
		}		
	}
	
	public void preOrder(TreeNode tree){
		System.out.println(tree.val);
		if(tree.left!=null)
			preOrder(tree.left);
		if(tree.right!=null)
			preOrder(tree.right);
	}
	
	public static void main(String[] args){
		int a[]={1,2,4,7,3,5,6,8};
		int b[]={4,7,2,1,5,3,8,6};
		
		ConstructTree ct=new ConstructTree();
		TreeNode root=ct.constructTree(a,0,7,b,0,7);
		//ct.hierarchicalOrder(root);
		ct.preOrder(root);
	}

}
