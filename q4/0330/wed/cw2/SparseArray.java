import java.util.List;
import java.util.ArrayList;

public class SparseArray
{
	/** The number of rows and columns in the sparse array. */
	private int numRows;
	private int numCols;
	
	/** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
	* list in no particular order. Each non-zero element is represented by exactly one entry in the list.
	*/
	private List<SparseArrayEntry> entries;
	/** Constructs an empty SparseArray. */
	
	public SparseArray()
	{ 
		entries = new ArrayList<SparseArrayEntry>();
		numRows = 6;
		numCols = 5;
		for(int r=0; r<numRows; r++)
		{
			for(int c=0; c<numCols; c++)
			{
				entries.add(new SparseArrayEntry(r,c,0));
			}
		}
		
		entries.set(6, new SparseArrayEntry(1,1,5));
		entries.set(9, new SparseArrayEntry(1,4,4));
		entries.set(10, new SparseArrayEntry(2,0,1));
		entries.set(16, new SparseArrayEntry(3,1,-9));
		
		
		
	}
	
	/** Returns the number of rows in the sparse array. */
	public int getNumRows()
	{ return numRows; }
	
	/** Returns the number of columns in the sparse array. */
	public int getNumCols()
	{ return numCols; }
	
	
	/** Returns the value of the element at row index row and column index col in the sparse array.
	* Precondition: 0 ≤ row < getNumRows()
	*		0 ≤ col < getNumCols()
	*/
	public int getValueAt(int row, int col)
	{ 
		/* to be implemented in part (a) */ 

		return entries.get(row * numCols + col).getValue();
	
	}
	
	
	/** Removes the column col from the sparse array.
	* Precondition: 0 ≤ col < getNumCols()
	*/
	public void removeColumn(int col)
	{ 
		/* to be implemented in part (b) */

		int count = 0;
		
		for(int i = 0; i < entries.size(); i++) {
			if(entries.get(i).getCol() == col) {
				entries.set(i, new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol(), -1));
				count++;
			}
		}

		System.out.println();

		printTable();

		numCols--;

		int limit = entries.size();

		for (int i = 0; i < limit; i++) {
			if(entries.get(i).getValue() == -1) {
				entries.remove(i);
				limit--;
			}
		}

	}
	
	
	public void printTable()
	{
		for(int r=0; r<numRows; r++)
		{
			for(int c=0; c<numCols; c++)
			{
				System.out.print(entries.get(r*(numCols)+c).getValue() + "\t");
			}
			System.out.println();
		}
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
}
