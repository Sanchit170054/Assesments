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
		
		if(ar.length <= 3)
		{
			System.out.println("Invalid");
		}
		else
		{
			Arrays.sort(ar);
			System.out.println(ar.length-2);
		}
	}

}
