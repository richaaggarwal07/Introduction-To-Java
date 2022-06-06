package Lecture_9;

public class SumOfTwoArrays {

	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i = arr1.length -1;
        int j = arr2.length -1;
        int k = output.length-1;
        int n =0;
        while(i>=0&&j>=0){
            int a = arr1[i]+arr2[j]+n;
            n = a/10;
            output[k] = a%10;
            k--;i--;j--;           
        }
        while(i>=0){
            int a = arr1[i]+n;
            n = a/10;
            output[k] = a%10;
            i++;
            k--;
        }
        while(j>=0){
            int a = arr2[j]+n;
            n = a/10;
            output[k] = a%10;
            j++;
            k--;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,2,4};
		int b[] = {7,5,6};
		int c[] = {0,0,0,0};
		sumOfTwoArrays(a, b, c);
		for(int i =0;i<c.length;i++) {
			System.out.println(i);
		}

	}

}
