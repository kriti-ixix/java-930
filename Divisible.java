import java.util.Scanner;

class Divisible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		if (number%3==0 && number%2==0 && number%10==0)
		{
			System.out.println("It is divisible");
		}
		else
		{
			System.out.println("It is not divisible");	
		}
	}
	
}

