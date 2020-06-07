public class Runner
{
	public static void main(String[] args)
	{
		SparseArray sparse = new SparseArray();
		System.out.println("Testing sparse.getValueAt(3, 1): " + sparse.getValueAt(3, 1) );
		System.out.println("Testing sparse.getValueAt(3, 3): " + sparse.getValueAt(3, 3) );
		System.out.println("Testing sparse.getValueAt(1, 4): " + sparse.getValueAt(1, 4) );
		
		
		System.out.println();
		System.out.println("Testing removeColumn(1)");
		sparse.printTable();
		sparse.removeColumn(1);
		System.out.println();
		sparse.printTable();
		System.out.println("Testing sparse.getValueAt(1, 3): " + sparse.getValueAt(1, 3) );
		System.out.println("Testing sparse.getValueAt(2, 0): " + sparse.getValueAt(2, 0) );
		
	}
}
