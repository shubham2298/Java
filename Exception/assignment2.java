
class assignment2
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={10,20,30,40,50};
            
            try
            {
                int c=10/0;
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);    //TODO: handle exception
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("ALWAYS EXECUTED");

        }
    }
}