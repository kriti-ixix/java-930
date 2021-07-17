class Addition
{
	void add(int x, int y)
	{
		System.out.println(x + y);
	}

	public static void main(String[] args)
	{
		Addition addition = new Addition();
		addition.add(10, 20);

		Subtraction.subtract(20, 10);
	}
}


class Subtraction
{
	static void subtract(int x, int y)
	{
		System.out.println(x - y);
	}
}