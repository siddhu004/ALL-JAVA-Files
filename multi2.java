
class multi2
{
    public static void main(String arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous();
        
        Thread t1 = new Thread(mobj1);
        Thread t2 = new Thread(mobj1);


        t1.start();
        t2.start();
    }
}

class Marvellous implements Runnable
{
    public void run()
    {
        for(int i=1;i<1000;i++)
        {
            System.out.println(i);
        }
    }
} 
