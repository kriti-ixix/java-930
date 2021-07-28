import java.io.*;
import java.util.Scanner;

class MyFile
{
    public static void main(String[] args)
    {
       try
       {
           File f1 = new File("input.txt"); //File should exist
           File f2 = new File("output.txt"); //File is created/overwritten

           FileInputStream fis = new FileInputStream(f1);
           FileOutputStream fos = new FileOutputStream(f2);

           int x;

           //Information transfer in the form of bytes
           while ( (x = fis.read()) != -1 )
           {
               fos.write(x);
           }
       } 

       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}