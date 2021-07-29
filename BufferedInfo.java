import java.io.*;
import java.util.Scanner;

class BufferedInfo
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("buffered output.txt");
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String info = scanner.nextLine();

            int x = 5;
            String xStr = String.valueOf(x);

            bufferedWriter.write(info);
            bufferedWriter.newLine();
            bufferedWriter.write(info);
            bufferedWriter.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}