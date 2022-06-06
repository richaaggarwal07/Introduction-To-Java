package String;

public class StringBufferUse {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
//		StringBuffer s = "hello";
		str.setCharAt(0, 's');
		str.append("false");
		System.out.println(str);
//		System.out.println(s);
		
		int arr[] = {1,2,3};
		char c = 'a';
		arr[c-97] = 10;
		System.out.println(arr[0]);
	}

}
