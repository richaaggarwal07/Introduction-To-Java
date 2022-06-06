package Array;

public class Sort_0and1_sol {

	
//	 public static void sortZeroesAndOne(int[] arr) {
//	    	//Your code goes here
//	        for(int i =0;i<arr.length;i++){
//	            if(arr[i] == 0){
//	                System.out.print(arr[i]+" ");
//	            }
//	        }
//	        for(int i =0;i<arr.length;i++){
//	            if(arr[i] == 1){
//	                System.out.print(arr[i] + " ");
//	            }
//	        }
//	    }
	
	
	
//	public static void sortZeroesAndOne(int[] arr) {
//    	//Your code goes here
//        int zero_count = 0;
//        int one_count = 0;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i] == 0){
//                zero_count++;
//            }
//            else{
//                one_count++;
//            }
//        }
//        for(int i =0;i<one_count;i++){
//            arr[i] = 0;
//        }
//        for(int i = one_count;i<one_count+zero_count;i++){
//            arr[i] = 1;
//        }
//        
//        for(int i=0;i<arr.length;i++) {
//        	System.out.print(arr[i] +" ");
//        }
//    }
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                for(int j =arr.length-1;j>=0;j--){
                    while(i<j){
                       if(arr[i] == 0){
                           int temp;
                           temp = arr[i];
                           arr[i] = arr[j];
                           arr[j] = temp;
                       } 
                    }  
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i] +" ");
        }
    }
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {0, 1, 1, 0, 1 ,0 ,1};
		sortZeroesAndOne(arr);
	}

}
