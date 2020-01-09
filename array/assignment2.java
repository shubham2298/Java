//Write a program to compare two String arrays which returns locations of matched items
class assignment2
{
    public static void main(String args[])
    {
        String s1[]={"chaudhari","shubham","shirishchandra","chaudhari","nikhil"};
        String s2[]={"rahul","shirishchandra","nikhil","chaudhari","nikhil"};
        int l1=s1.length;
        int l2=s2.length;
        
        
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(s1[i]==s2[j])
                {
                    System.out.println("loc"+i);
                }
            }
        }
    }
}
