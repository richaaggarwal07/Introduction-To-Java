package Array;

public class testing {
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int duplicate = 0;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
            	
                if(arr[i]==arr[j]){
                    count++;
                }         
            }
            
            if(count>0){
                duplicate = arr[i];
            }
        }
        return duplicate;
    }
    
    public static void main(String[] args) {
		int []arr = {0 ,2 ,1 ,3 ,1,9};
		int a = duplicateNumber(arr);
		System.out.println(a);
	}
}
