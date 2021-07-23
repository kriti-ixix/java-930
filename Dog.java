class Animal //Parent class
{
    String name = "Animal", colour = "black";

    void getInfo()
    {
        System.out.println("Animal is " + name + " of " + colour + " colour");
    }
}

class Dog extends Animal //Child class
{
    String name = "Tommy", colour = "brown";

    void getInfo()
    {
        super(); //Parent class constructor
        System.out.println(super.name); //Parent class variable
        super.getInfo(); //Parent class method
        System.out.println("Dog is " + name + " of " + colour + " colour");
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.getInfo();
    }
}