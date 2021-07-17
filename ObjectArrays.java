class ObjectArrays
{
    public static void main(String[] args)
    {
        Students[] objArray = new Students[5];

        for (int i=0; i<5; i++)
        {
            Students student = new Students();
            student.name = "ABC";
            student.rollno = 10;
            student.marks = 50;
            objArray[i] = student;
        }

        for (Students student : objArray)
        {
            System.out.print(student.name + " " + String.valueOf(student.rollno) + " " + String.valueOf(student.marks));
            System.out.println("");
        }

    }
}

class Students
{
    String name=""; int rollno, marks;
}