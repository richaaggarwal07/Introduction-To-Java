package Array;

public class TripletSum_sol {
	
	public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+2;j<arr.length;j++){
            	if(arr[i]+arr[i+1]+arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1 ,2, 3, 4, 5, 6, 7};
		int b =findTriplet(arr1, 12);
		System.out.println(b);

		
	}

}
