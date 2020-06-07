public class Hailstone
{
	/** Returns the length of a hailstone sequence that starts with n,
	* as described in part (a).
	* Precondition: n > 0
	*/
	public static int hailstoneLength(int n)
	{ /* to be implemented in part (a) */ 
		
		int length = 0;

		while(true) {
			length++;
			
			if(n == 1) {
				break;
			}
			
			if(n % 2 == 0) {
				// is even
				n = n / 2;
			} else {
				n = 3*n + 1;
			}
		}

		return length;
	}
	
	
	/** Returns true if the hailstone sequence that starts with n isconsidered long
	* and false otherwise, as described in part (b).
	* Precondition: n > 0
	*/
	public static boolean isLongSeq(int n)
	{ /* to be implemented in part (b) */ 
	
		int length = hailstoneLength(n);

		if(n < length) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/** Returns the proportion of the first n hailstone sequencesthat are considered long,
	* as described in part (c).
	* Precondition: n > 0
	*/
	public static double propLong(int n)
	{ /* to be implemented in part (c) */ 
		
		double longs = 0;
		for (int i = 1; i <= n ; i++) {
			if(isLongSeq(i)) {
				longs += 1;
			}
 		}
		 return (longs/(double)n);
	}
	
	
	// There may be instance variables, constructors, and methodsnot shown.
}
