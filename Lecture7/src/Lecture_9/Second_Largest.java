package Lecture_9;

public class Second_Largest {

	
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else{
                if(arr[i]>secondLargest && arr[i]!=largest){
                    secondLargest = arr[i];
                }
            }
        }
      return secondLargest;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,5,6};

	}

}
