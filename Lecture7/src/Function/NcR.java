package Function;

public class NcR {
	
	public static boolean isPrime(int n) {
		int d = 2;
		while(d<n) {
			if(n%d == 0) {
			return false;	
		}
		d++;
	}
	return true;
}
	
	public static void printTillN(int n) {
		if(n<0) {
			return;
		}
		for(int i =1;i<=n;i++) {
			System.out.println(i);
		}
	}


	public static void main(String[] args) {
		
		
  boolean a = isPrime(5);
  System.out.println(a);
  System.out.println(isPrime(6));
  printTillN(5);
  
}
}
