
public class SelectionSort
{
  // Sorts a[0], ..., a[size-1] in ascending order
  //   using Selection Sort.
  public static void sort(int[] a)
  {
    for (int n = a.length; n > a.length - 3; n--)
    {
      // Find the index iMax of the largest element
      //   among a[0], ..., a[n-1]:

      int iMax = 0;
      for (int i = 1; i < n; i++)
      {
        
      }

      // Swap a[iMax] with a[n-1]:

      int aTemp = a[iMax];
      a[iMax] = a[n-1];
      a[n-1] = aTemp;

      // Decrement n (accomplished by n-- in the for loop).
    }
  }
  public static void main(String[] args)
  {
	  
  }
}
  
