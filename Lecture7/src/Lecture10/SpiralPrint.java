package Lecture10;

public class SpiralPrint {

	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int row = matrix.length;
        int columns = matrix[0].length;
        int counter = 0;
        int colStart=0,rowStart =0;
        int colEnd = columns-1;
        int rowEnd = row-1;
        while(counter<=row*columns){
                for(int j=colStart;j<=colEnd;j++){
                    System.out.print(matrix[rowStart][j]+ " ");
                    counter++;
                }
                rowStart++;
            	for(int i=rowStart;i<=rowEnd;i++){
                    System.out.print(matrix[i][colEnd]+" ");
                    counter++;
                }
                colEnd--;
                for(int j = colEnd;j>=colStart;j--){
                	System.out.print(matrix[rowEnd][j]+" ");
					counter++;
        		}
            	rowEnd--;
            	System.out.println("row End"+ rowEnd+" "+rowStart+" " +colStart);
        		for(int i = rowEnd;i>=rowStart;i++){
                    System.out.print(matrix[i][colStart]);
                    counter++;
                }
            	colStart++;
        }
	}
	
	
	
	
//	int r=arr.length;
//    if(r==0)
//       return ;
//   int c=arr[0].length;
//   int left=0,right=c-1;
//   int top=0,bottom=r-1;
//   while(top<=bottom&&left<=right)
//   {
//       for(int i=left;i<=right;i++)
//           System.out.print(arr[top][i]+" ");
//       top++;
//       for(int i=top;i<=bottom;i++)
//           System.out.print(arr[i][right]+" ");
//       right--;
//       if(top<=bottom)
//       {
//           for(int i=right;i>=left;i--)
//               System.out.print(arr[bottom][i]+" ");
//             bottom--;
//           if(left<=right)
//               for(int i=bottom;i>=top;i--)
//                   System.out.print(arr[i][left]+" ");
//               left++;
//       }
//   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2D[][] = {{1, 2, 3},{4, 5 ,6 },{7, 8 ,9}};
		spiralPrint(arr2D);
}
}
