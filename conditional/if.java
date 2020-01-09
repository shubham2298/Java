class if1
{
    public static void main(String args[])
    {
        int no=24;
        if(no%2==1)
        {
            System.out.println("Weired");
        }
        else if(no%2==0&&no>=2&&no<=5)
        {
            System.out.println("not Wired");
        }
        else if(no%2==0&&no>=6&&no<=20)
        {
            System.out.println("Wired");
        }
        else if(no%2==0&&no>20)
        {
            System.out.println("Not Wired");
        }
    }
}