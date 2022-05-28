
public class checking {

	public static String reverseEachWord(String str) {
		//Your code goes here
        String output ="";
        int start = 0;
        int end = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                end = i-1;
                for(int j = start;j<=end;j++){
                    output = str.charAt(j)+output;
                }
                output += " ";
                start = i+1;
            }
        }
        end = str.length()-1;
        for(int j = start;j<=end;j++){
            output = str.charAt(j)+output;
        }
        return output;
	}
	
//	public static boolean isPermutation(String str1, String str2) {
//		//Your code goes here
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        int arr[] = new int[256];
//        for(int i =0;i<str1.length();i++){
//            char c = str1.charAt(i);
//            arr[c]++;
//        }
//        for(int i =0;i<str2.length();i++){
//            char c = str2.charAt(i);
//            arr[c]--;
//        }
//        for(int i =0;i<arr.length;i++){
//            if(arr[i] != 0){
//             return false;   
//            }
//        }
//        return true;
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEachWord("ram is"));
		System.out.println("hello"+7);

	}

}
