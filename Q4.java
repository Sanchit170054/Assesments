import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		
		for(int i= 0 ; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		mostVotes(ar);
	}
	
	static void mostVotes(int[] ar)
	{
			int max = ar[0], count = 0;
			for(int i = 0 ; i < ar.length; i++)
			{
				if(max < ar[i])
				{
					max = ar[i];
					count = i;
				}
			}
			System.out.println(count+ 1);
		
	}
}
