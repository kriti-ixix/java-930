class Inheritance
{
    public static void main(String[] args)
    {

    }
}

class Student //Parent or Base class
{
    String name = ""; int rollno;

    Student(String n, int rn)
    {
        this.name = n;
        this.rollno = rn;
    }
}

class Exams extends Student //Child or Derived class
{
    String subject = ""; int marks; float percentage;
}