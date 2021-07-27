class InheritThread extends Thread
{
    public void run()
    {
        try
        {
            for (int i=1; i<=10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        InheritThread t1 = new InheritThread();
        OtherThread t2 = new OtherThread();
        t1.start();
        t2.start();
    }
}

class OtherThread extends Thread
{
    public void run()
    {
        try
        {
            for (int i=10; i<=100; i+=10)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}