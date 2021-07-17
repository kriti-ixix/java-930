class MyStar
{
	public static void main(String[] args)
	{
		//Outer loop
		for (int row=1; row<=5; row++)
		{
			//Inner loop
			for (int col=1; col<=row; col++)
			{
				System.out.print("* ");
			}

			System.out.println("");
		}
	}
}