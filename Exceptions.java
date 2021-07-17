class Exceptions
{
    public static void main(String[] args)
    {
        try
        {
            //Normal execution
            int[] myArr = {1, 2, 3, 4, 5};
            System.out.println(myArr[1]);
            System.out.println(myArr[10]);
        }

        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("The index is invalid");
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}