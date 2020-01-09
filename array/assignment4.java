//Write a program to sort integer array
class assignment4
{
    public static void main(String args[])
    {
        int arr[]={55,33,12,5,0,12};
        int temp;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int m:arr)
        {
            System.out.println(m);
        }
    }
}
