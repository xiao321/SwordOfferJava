package ChapterTwo;

public class Find {
	
	public boolean find(int[][] a,int n,int m,int k){
	
		for(int j=m-1,i=0;j>=0&&i<n;){
			if(a[i][j]==k) return true;
			else if(a[i][j]>k){
				j=j-1;
			}
			else{
				i=i+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(new Find().find(a, 4, 4, 2));
	}

}
