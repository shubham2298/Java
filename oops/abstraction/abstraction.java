abstract class printer
{
    abstract void print();
    
}
class dotmatrix extends printer
{
    void print()
    {
        System.out.println("THIS IS DOT MATRIX");
    }
}

class DeskjetPrinter extends printer
{
    void print()
    {
    System.out.println("THIS IS DeskjetPrinter");    
    }

    public static void main(String args[])
    {
        printer p=new dotmatrix();
        p.print();
        printer p1=new DeskjetPrinter();
        p1.print();
    }
}