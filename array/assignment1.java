//Write a program to reverse first half of integer array
class assignment1
{
    public static void main(String args[])
    {
        int a1[]={10,20,30,40,50,60};
        int l =a1.length;
        int m=(l/2);
       int temp;
        for(int i=0;i<m/2;i++)
        {
            temp=a1[i];
            a1[i]=a1[m-i-1];
            a1[m-i-1]=temp;
        }
        for(int k:a1)
        {
            System.out.println(k);
        }

    }
}
