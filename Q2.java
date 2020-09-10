import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		
		for(int i = 0 ; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		if(ar.length <= 3 || AreAllSame(ar))
		{
			System.out.println("Invalid");
		}
		else
		{
			Arrays.sort(ar);
			System.out.println(ar[ar.length-3]);
		}
	}
	public static boolean AreAllSame(int[] array)
	{
	    boolean isFirstElementNull = String.valueOf(array[0]) == null;
	    for(int i = 1; i < array.length; i++)
	    {
	        if(isFirstElementNull)
		{
	            if(String.valueOf(array[i]) != null) return false;
		}
		else
		{
	   	  if(!String.valueOf(array[0]).equals(String.valueOf(array[i]))) return false;
		}
	   }

	    return true;
	}

}
