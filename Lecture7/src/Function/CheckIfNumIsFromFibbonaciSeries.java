package Function;

public class CheckIfNumIsFromFibbonaciSeries {
	
	public static boolean checkMember(int n){
        int a = 1,b = 1,c = 0;
        while(a<=n) {
            c = a+b;
            a = b;
            b = c;
        if(a == n){
            return true;
        }	
	}
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(checkMember(6));
	}

}
