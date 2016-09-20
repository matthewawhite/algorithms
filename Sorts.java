import java.util.*;

public class Sorts 
{
    private static ArrayList<Double> a = new ArrayList<Double>(100);

    
    public static void doIt(ArrayList<Double> b) //selection sorts
    {
       for(int n = b.size(); n > 0; n--)
       {
    	   int max = 0;
    	   for(int i = 0; i < n; i++)
    	   {
    		   if(b.get(i) > b.get(max))
    			   max = i;
    	   }
    	   swap(b, n - 1, max);
       }
    }
    
    private static void swap(ArrayList<Double> a, int i, int j)
    {
    	double num = a.get(i);
    	a.set(i, a.get(j));
    	a.set(j, num);
    }
    
	
	public static void main(String[] args) 
	{
		Random gen = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < 100000; i++)
			a.add(gen.nextDouble());
        
		System.out.println(a);
		doIt(a);
		System.out.println(a);
	}
}
