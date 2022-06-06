package Lecture10;

public class ReverseString {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int j  =0;
        String reverse = "";
        for(int i=str.length() -1;i>=0;i--){
            reverse = reverse+ str.charAt(i);
            j++;            
        }
        System.out.println(reverse);
        return reverse.contains(str);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "hello";
        boolean a =isPalindrome(s);
        System.out.println(a);
	}

}
