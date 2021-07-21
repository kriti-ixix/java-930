class DivideByZero
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 0;
        float z = x/y;
        System.out.println(z); //Throws an ArithmeticException
    }
}