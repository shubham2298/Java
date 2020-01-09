class car
{
    int s1=10;
    int s2=20;

    void display()
    {
        System.out.println("car s1:"+s1);
        System.out.println("car s2:"+s2);

    }
}
class remoteControlledCar extends car
{

    int s3=30;
    int s4=40;

    void display1()
    {
        System.out.println("car s3:"+s3);
        System.out.println("car s4:"+s4);

    }
}
class toy extends remoteControlledCar
{
    public static void main(String args[])
    {
        toy t1=new toy();
        t1.display();
        t1.display1();

    }
    
}