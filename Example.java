import java.util.Scanner;

class Example
{
	int total = 50;

	void calculatePercent(int m)
	{
		double percentage = (m*100) /50;
		System.out.println("You got " + String.valueOf(percentage) + "!");
	}

	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Example example = new Example();
		System.out.print("Enter your name: ");
		String name = scanner.next();
		
		System.out.print("Enter your marks: ");
		int marks = scanner.nextInt();

		System.out.println("Hello " + name + "!");
		System.out.println("You got " + String.valueOf(marks) + "!"); 
		example.calculatePercent(marks);
	}
}
