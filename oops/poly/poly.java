class dog
{
    public void run()
    {
        System.out.println("DOG CAN RUN");
    }
}

class cat extends dog
{
    public void run()
    {
        System.out.println("CAT CAN RUN");
    }
}
class mouse extends cat
{
    public void run()
    {
        System.out.println("MOUSE CAN RUN");
    }

    
    public static void main(final String args[]) 
    {
        cat c1=new cat();
        c1.run();
        dog d1=new dog();
        d1.run();
        mouse m1=new mouse();
        m1.run();

    }
        
}