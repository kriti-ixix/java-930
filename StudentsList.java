import java.util.*;

class StudentsList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> studentId = new ArrayList<Integer>();
        System.out.println(studentId.size());

        studentId.add(1);
        studentId.add(2);
        studentId.add(3);

        System.out.println(studentId.size());

        studentId.remove(2);

        System.out.println(studentId.size());

        System.out.println(studentId.toString());
    }
}