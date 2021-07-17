import java.util.Scanner;

class Name
{
	void printName(String first, String last)
	{
		System.out.println("Welcome " + first + " " + last + "!");
	}

	void printName(String first, String middle, String last)
	{
		System.out.println("Welcome " + first + " " + middle + " " + last + "!");
	}

	public static void main(String[] args)
	{
		Name name = new Name();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = sc.next();

		System.out.println("Enter middle name (Enter - if no middle name): ");
		String middleName = sc.next();

		System.out.println("Enter last name: ");
		String lastName = sc.next();

		if (middleName.equals("-"))
		{
			name.printName(firstName, lastName);
		}
		else
		{
			name.printName(firstName, middleName, lastName);
		}

	}
}