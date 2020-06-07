public class Mountain
{
    /** @param array an array of positive integer values
    * @param stop the last index to check
    * Precondition: 0 <= stop < array.length
    * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
    * false otherwise
    */
    public static boolean isIncreasing(int[] array, int stop)
    {
        for(int i=0; i < stop; i++)
        {
            if( array[i] > array[i+1] )
                return false;
        }
        return true;   
    }
     
 
    /** @param array an array of positive integer values
    * @param start the first index to check
    *Precondition: 0 <= start < array.length - 1
    *@return true if for each j such that start <= j < array.length - 1,
    *array[j] > array[j + 1];
    *false otherwise
    */
    public static boolean isDecreasing(int[] array, int start)
    {
        for(int i=start; i < array.length-1; i++)
        {
            if( array[i] < array[i+1] )
                return false;
        }
        return true;   
 
    }
     
 
    /** @param array an array of positive integer values
    *Precondition: array.length > 0
    * @return the index of the first peak (local maximum) in the array, if it exists;
    *-1 otherwise
    */
    public static int getPeakIndex(int[] array)
    {
        /* to be implemented in part (a) */

        // loop through the array, start at location 1 and end at the i < array.length-1
        for(int i = 1; i < array.length-1; i++) {
            if(array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
            // find the peak
            // check the number before i array[i - 1] and check the number after i array[i + 1]
            // if they are less than i, i is a peak
                // return peak's location
        
        // default
        return -1;
    }
     
     
    /** @param array an array of positive integer values
    *Precondition: array.length > 0
    * @return true if array contains values ordered as a mountain;
    *false otherwise
    */
    public static boolean isMountain(int[] array)
    {
        /* to be implemented in part (b) */
        if(getPeakIndex(array) != -1) {
            if(isIncreasing(array, getPeakIndex(array)) && isDecreasing(array, getPeakIndex(array))) {
                return true;
            }
        }

        return false;
    }
     
    // There may be instance variables, constructors, and methods that are not shown.
}