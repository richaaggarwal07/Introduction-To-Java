package Function;

public class farheniteToCelcius {
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        int cels,far;
        
        for(far = start;far<=end;far=far+step){
           cels = (5*(far - 32))/9;
           System.out.println(far+"\t"+cels);
 
        }
		
	}


public static void main(String [] args) {
//	printFahrenheitTable(10, 100, 20);
	
	
//	int start = 10;int end = 100;int step = 20;int cels;
//	
//	for(int far = start;far<=end;far=far+step){
//        cels = (5/9)*(far - 32);
//        System.out.println(far+"\t"+cels);
//
//     }
//	int x = 5/9;
//	float y = 5;
//	System.out.println(y);
//	System.out.println((5/9)*(10 - 32));
	
	

}
}