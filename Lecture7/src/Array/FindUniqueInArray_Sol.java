package Array;

public class FindUniqueInArray_Sol {

//	public static int findUnique(int[] arr){
//		//Your code goes here
//        int unique;
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;i<arr.length;j++){
//               if(i==j){
//                   continue;
//               }
//               if(arr[i] == arr[j]){
//                   break;
//               }
//                
//            }
//            unique = arr[i];
//            return unique;
//        }
//      return 0;  
//    }
	
	
	
//	public static int findUnique(int[] arr){
//		//Your code goes here
//        int counter=0;
//        int unique = 0;
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;i<arr.length;j++){
//               if(i==j){
//                   continue;
//               }
//               if(arr[i] == arr[j]){
//                   counter++;
//               }
//            }
//            if(counter == 0) {
//            	unique = arr[i];
//            }
//        }
//        return unique;
//    }
	
	
	public static int findUnique(int[] arr){

		int count;
		int unique=0;
		for(int i=0;i<arr.length;i++)
		{
		count=0;
		    for(int j=0;j<arr.length;j++)
		    {
		        if(i==j){
		            continue;
		        }
		        if(arr[i] == arr[j]){
		            count=1;
		        }
		    }
		    if(count==0){
		       unique = arr[i];
		    }
		 }
		return unique;
	}
	
	
//	 public static int findUnique(int[] arr){
//			//Your code goes here
//	        int unique = 0;
//	        int counter;
//	        for(int i =0;i<arr.length;i++){
//	            counter =0;
//	            for(int j =0;i<arr.length;j++){
//	               if(i==j){
//	                   continue;
//	               }
//	               if(arr[i] == arr[j]){
//	                   counter++;
//	               } 
//	            }
//	            if(counter == 0){
//	                unique = arr[i];
//	            }
//	        } 
//	        return unique;
//	    }
	
	public static void main(String[] args) {
	
		int arr[] = {2, 4 ,7 ,2 ,4};
		int a = findUnique(arr);
		System.out.println(a); 	
	}
}
