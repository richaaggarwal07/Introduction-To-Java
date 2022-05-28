
public class functionOverloading {


	public static int sum(int a,int b)
	{
	    System.out.print("int sum ");
	    return a+b;
	}
	public static long sum(long a,long b)
	{
	    System.out.print("long sum ");
	    return a+b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(19,656));
		System.out.println(sum(112522215455L,5515452153521534563L));

	}

}
