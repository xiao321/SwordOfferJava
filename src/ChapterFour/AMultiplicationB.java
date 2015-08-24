package ChapterFour;

public class AMultiplicationB {
	//a m行 n列  b n行 z列
	public void multiplication(int[][] a,int[][] b,int m,int n,int z){
		int[][] c=new int[m][z];
		for(int i=0;i<m;i++)
			for(int j=0;j<z;j++)
				c[i][j]=0;
		
		
		for(int i=0;i<m;i++)
			for(int j=0;j<z;j++)
				for(int u=0;u<n;u++){
					c[i][j]=c[i][j]+a[i][u]*b[u][j];
				}
		for(int i=0;i<m;i++){
			
			for(int j=0;j<z;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		int[][] a={{1,0,2},{-1,3,1}};
		int[][] b={{3,1},{2,1},{1,0}};
		
		AMultiplicationB ab=new AMultiplicationB();
		ab.multiplication(a, b, 2, 3, 2);

	}

}
