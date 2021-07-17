import java.util.Scanner;

class AreaException
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            int breadth = scanner.nextInt();

            if (length < 0 || breadth < 0)
            {
                throw new ArithmeticException("Length and breadth must be positive");
            }

            System.out.println("Area is: " + String.valueOf(length*breadth));   
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}