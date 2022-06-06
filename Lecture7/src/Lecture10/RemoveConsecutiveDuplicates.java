package Lecture10;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String s = "";
        s = s+str.charAt(0);
        for(int i =1;i<str.length();i++){
            char ch = str.charAt(i);
            if(!s.contains(ch)){
                s = s+ch;
            }
        }
        return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
