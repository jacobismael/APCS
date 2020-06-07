public class Runner {
	public static void main(String[] args){
		System.out.println("Testing Part A");
		System.out.println("n=5, hailstoneLength=" + Hailstone.hailstoneLength(5));
		System.out.println("n=8, hailstoneLength=" + Hailstone.hailstoneLength(8));
		
		System.out.println("\nTesting Part B");
		System.out.println("n=5, isLongSeq=" + Hailstone.isLongSeq(5));
		System.out.println("n=8, isLongSeq=" + Hailstone.isLongSeq(8));
		
		System.out.println("\nTesting Part C");
		System.out.println("propLong(10)=" + Hailstone.propLong(10));

		
	}

}