import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ar[] = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			ar[i] = sc.nextInt();
		}
		getDuplicates(ar);
	}
	
	static void getDuplicates(int[] ar)
	{
		Set<Integer> duplicates = new HashSet<Integer>();
		for(int i = 0; i < ar.length; i++) 
		{  
            for(int j = i + 1; j < ar.length; j++) 
            {  
                if(ar[i] == ar[j])  
                {
                	duplicates.add(ar[j]);
                }

            }  
        }  
		for(Integer s : duplicates)
		{
			System.out.println(s);
		}
	}

}
