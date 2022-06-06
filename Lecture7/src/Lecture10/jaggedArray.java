package Lecture10;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr2[][] = new int[4][];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = new int[i+2];
		}
		for(int i =0;i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
