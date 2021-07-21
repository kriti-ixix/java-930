class Indexes
{
    public static void main(String[] args)
    {
        try
        {
            int[] marks = {1, 2, 3, 4, 5};
            System.out.println(marks[1]);
            System.out.println(marks[10]);
        }

        catch (Exception e)
        {
            System.out.println("The index was invalid");
        }
    }
}