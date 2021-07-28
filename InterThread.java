class InterThread implements Runnable 
{
    public void run() //When the thread is running
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
        }
    }

    void startThread()
    {
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args)
    {
        InterThread t1 = new InterThread();
        t1.startThread();
    }
}