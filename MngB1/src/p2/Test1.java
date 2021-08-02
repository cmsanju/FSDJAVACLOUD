package p2;

public class Test1 {
	
	static int smallestDivisor(int n)
	{
	    // if divisible by 2
	    if (n % 2 == 0)
	        return 1;
	 
	    // iterate from 3 to sqrt(n)
	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0)
	            return i;
	    }
	 
	    return n;
	}
	 
	// Driver Code
	     
	    public static void main (String[] args) {
	     
	        int n = 31;
	        System.out.println (smallestDivisor(n));
	    	
	    	double d = 10.0/-0;
	    	
	    	if(d == Double.POSITIVE_INFINITY)
	    	System.out.println("pi");
	    	else
	    	System.out.println("ni");
	         
	    }

}
