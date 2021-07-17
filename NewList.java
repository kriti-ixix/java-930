import java.util.*;

class NewList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            int number = scanner.nextInt();
            myList.add(number);
        }

        System.out.println("Printing: ");
        
        for (int i=0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
    }
}