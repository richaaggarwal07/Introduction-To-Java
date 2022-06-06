package Lecture10;

public class NoOfWords {


	public static int countWords(String str) {	
		//Your code goes here
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
      return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s ="hello friends";
        int a = countWords(s);
        System.out.println(a); 
        
	}

}
