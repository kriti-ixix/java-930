class OddOrEven
{
	void printOutput(String result)
	{
		System.out.println("Number is " + result);
	}

	public static void main(String[] args)
	{
		OddOrEven oddEven = new OddOrEven();
		int x = 10;

		if (x%2 == 0)	
		{
			//Number is even
			oddEven.printOutput("even");	
		}

		else
		{
			//Number is odd	
			oddEven.printOutput("odd");	
		}
	}

}