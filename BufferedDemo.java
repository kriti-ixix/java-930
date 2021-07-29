import java.io.*;

class BufferedDemo
{
    public static void main(String[] args)
    {
        try
        {
            File input = new File("input.txt");
            FileReader reader = new FileReader(input);
            BufferedReader br = new BufferedReader(reader);

            String x = "";

            while ((x=br.readLine()) != null)
            {
                System.out.println(x);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}