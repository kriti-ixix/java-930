import java.util.Scanner;

class MyChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();	
		System.out.println(name);

		char ch = name.charAt(1);	

		System.out.println(ch);
	}
}
