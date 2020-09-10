import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of array: ");
		int ar[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			ar[i] = sc.nextInt();
			
		}
		FizzBuzz(ar);
		
		
	}
	 static void FizzBuzz(int[] ar)
	{
		 String result = "";
		 for(int i = 0 ; i < ar.length; i++)
		 {
			if(ar[i] % 3 == 0)
			{
				result = result + "Fizz" +" ";
			}
			else if(ar[i] % 5 == 0)
			{
				result = result + "Buzz" +" ";	
			}
			else if(ar[i] % 15 == 0) 
			{
				result = result + "FizzBuzz" +" ";
			}
			else
			{
				result = result + String.valueOf(ar[i])+" ";
			}
		 }
		 System.out.println(result);
	}

}
