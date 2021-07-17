class Matrix 
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];
        int i = 1;

        for (int row=0; row<3; row++)
        {
            for (int col=0; col<3; col++)
            {
                matrix[row][col] = i;
                i++;
            }
        }

        for (int row=0; row<3; row++)
        {
            for (int col=0; col<3; col++)
            {
                System.out.print(matrix[row][col]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}