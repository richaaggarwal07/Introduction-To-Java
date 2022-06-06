package Function;

public class Increement {
	
	public static void increement(int n) {
		n = n+1;
	}

	public static void main(String[] args) {
		int n = 10;
		increement(n);  ## pass by value
        System.out.println(n);  
	}

}
