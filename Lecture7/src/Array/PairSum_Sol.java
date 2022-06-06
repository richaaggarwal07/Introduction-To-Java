package Array;

public class PairSum_Sol {

	public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if((arr[i]+arr[j] == x)&&(i!=j)){
                    count++;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 3 ,6 ,2 ,5 ,4 ,3 ,2 ,4};
		int b = pairSum(arr1, 7);
		System.out.println(b);
//		int [] arr1 = {2, 6 ,1 ,2};
		}
	}


