package Lecture_9;

public class SelectionSort {

	public static void selectionSort(int [] input) {
		for(int i =0;i<input.length-1;i++) {		
			int min = input[i];
			int minIndex = i;
			for(int j = i+1;j<input.length;j++) {
			    if(input[j]<min) {
			    	min = input[j];
			    	minIndex = j;
			    }
			}
			if(minIndex != i) {
				input[minIndex]= input[i];
				input[i] = min;
			}		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,7,1,2,3,4};
		selectionSort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
