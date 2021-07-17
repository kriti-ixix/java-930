class Methods
{

	void addNumbers(int x, int y)
	{
		System.out.println("Two");
	}

	void addNumbers(int x, int y, int z)
	{
		System.out.println("Three");
	}

	public static void main(String[] args)
	{
		Methods example = new Methods();
		example.addNumbers(5, 10);
		example.addNumbers(5, 10, 15);
	}
}

