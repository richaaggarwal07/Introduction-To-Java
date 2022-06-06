package Lecture10;

public class StringUse {

	public static void print(String s) {
		for(int i =0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefgh";
		System.out.println(str.charAt(5));
		System.out.println(str.substring(8));
		System.out.println(str);
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
//		System.out.println(str.substring(str.length()+1));  // it will throw error
		System.out.println(str.contains("abc")); 
//		print(str);
//		str.charAt(4) = "k";
		System.out.println(str.charAt(4));
		str = "abcdef";
		System.out.println(str+"ghi");
		System.out.println(str);
	    str = str+"ghi";
	    System.out.println(str);
	    System.out.println(str.concat(str)); //it returns the new string after concatenating
	    int [] arr1 = {1,2};
	    int[] arr2 = {1,2};
	    if(arr1 == arr2) {   //not equal b/c here it is comparing its addresses in case non pimitives 
	    	System.out.println("equal");
	    }else {
	    	System.out.println("not equal");
	    }
	    
		
		
	}

}
