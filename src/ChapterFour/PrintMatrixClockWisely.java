package ChapterFour;

public class PrintMatrixClockWisely {
	//分为4步，从左到右，从上到下，从下到上，从右到左
	public void printMatrix(int[][] a,int columns,int rows,int start){
		
		for(int i=start;i<columns-start;i++){
			System.out.print(a[start][i]+" ");
		}
		
		if(start+1<rows-start){
			for(int i=start+1;i<rows-start;i++){
				System.out.print(a[i][columns-start-1]+" ");
			}
		}
		
		if(start+1<rows-start&&columns-1-1-start>=start){
			for(int i=columns-1-1-start;i>=start;i--){
				System.out.print(a[rows-1-start][i]+" ");
			}
		}
		
		if(start+1<rows-start&&rows-1-1-start>start){
			for(int i=rows-1-1-start;i>start;i--){
				System.out.print(a[i][start]+" ");
			}
		}		
	}
	
	public static void main(String[] args){
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] b={{1,2,3,4}};
		PrintMatrixClockWisely pmcw=new PrintMatrixClockWisely();
		int start=0;
		while(4>2*start&&4>2*start){
			pmcw.printMatrix(a, 4, 4, start);
			start++;
		}
		
		//pmcw.printMatrix(b, 4, 1, 0);
	}

}
