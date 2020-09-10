import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter your Elements: ");
		for(int i = 0 ; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("Please enter the roll number: ");
		int rol = sc.nextInt();
		if(rol < 0 || rol >= n)
		{
			System.out.println("Enter valid Roll number..! ");
		}
		else
		{
			System.out.println(ar[rol]);
		}
	}

}
