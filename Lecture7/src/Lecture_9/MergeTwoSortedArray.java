package Lecture_9;

public class MergeTwoSortedArray {
	
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int[] arr = new int[arr1.length+arr2.length];
        int i=0;
        int j =0;
        int k=0;
        
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        
         while(i<arr1.length){
                arr[k] = arr1[i];
                i++;
                k++;
            }
       
         while(j<arr2.length){
                arr[k] = arr2[j];
                j++;
                k++;
            }         
         
        return arr;  
    }
	public static void main(String[] args) {
		int arr1[] = {1,3,5,6};
		int arr2[] = {2,4,7,9};
		int arr[] = merge(arr1, arr2);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
