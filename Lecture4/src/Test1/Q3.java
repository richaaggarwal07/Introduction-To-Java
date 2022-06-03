package Test1;
import java.util.Scanner;
public class Q3 {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n,rem,temp;
        int count=0;
        n=temp = num;
        int sum  =0;
        while(n != 0){
            n = n/10;   // for counting the no. of digits in a number.
            count++;
        }
//        System.out.println(count);
        while(num!=0){
            rem = num%10;
            int prod = 1;
            for(int i =1;i<=count;i++){
                prod= prod*rem;
                
            }
//            System.out.println(prod);
            sum = sum + prod;
            num=num/10;
        }
//        System.out.println(sum); 
        
        if(temp == sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
	}
}
