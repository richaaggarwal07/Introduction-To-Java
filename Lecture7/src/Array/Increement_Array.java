package Array;

public class Increement_Array {

	public static void print(int[] input) {
		int size = input.length;
		for(int i =0;i<size;i++) {
			System.out.print(input[i] + " ");
		}
	}
	public static void  increementArray(int input[]) {
		for(int i =0;i<input.length;i++) {
			input[i]++;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		increementArray(arr);
		print(arr);
	}

}
