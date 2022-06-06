package twoD_Array;

public class largestColumnSum {

	public static int largestColSum(int[][] input){
		int rows = input.length;
		int cols = input[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j = 0;j<cols;j++) {
			int sum = 0;
			for(int i =0;i<rows;i++) {
				sum += input[i][j];
			}
			if(sum>largest) {
				largest = sum;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{5,2,4}};
		System.out.println(largestColSum(arr));
	
	}

}
