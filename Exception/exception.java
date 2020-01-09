class exception
{

    void m()
    {
        System.out.println("THIS IS M");
       int d=10/0;
       // throw new ArithmeticException();
       // System.out.println(d);
      //  System.out.println("THIS IS M1");

    }
    void n()
    {
        System.out.println("THIS IN N");
        m();
        System.out.println("THIS IS n1");

    }
    void k() throws ArithmeticException
    {
        try {
            n();
        } catch (ArithmeticException e) {
            System.out.println(e);
            
        }
        

            
        
        
    }
    public static void main(String args[]) 
    {
        exception e=new exception();
        e.k() ;
    }
}