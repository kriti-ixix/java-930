class MyInterface
{
    public static void main(String[] args)
    {
        Square sq = new Square();
        sq.getArea();
        sq.getPerimeter();
    }
}

interface Mensuration
{
    void getArea();
    void getPerimeter();
}

class Square implements Mensuration
{
    public void getArea()
    {
        int area = 20 * 20;
        System.out.println("Area of square: " + area);
    }

    public void getPerimeter()
    {
        int perimeter = 4 * 20;
        System.out.println("Perimeter of square: " + perimeter);
    }
}

class Rectangle 
{

}