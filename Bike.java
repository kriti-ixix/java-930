class Bike
{
	int speed, gear;

	Bike(int s)
	{
		speed = s;
		gear = 1;
	}

	public static void main(String[] args)
	{
		Bike bike = new Bike(100);
		System.out.println(bike.speed);
		System.out.println(bike.gear);

		Bike bike2 = new Bike(200);
		System.out.println(bike2.speed);
		System.out.println(bike2.gear);
	}
}