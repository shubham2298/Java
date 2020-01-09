class tap
{
    int s1;
    int s2;
    int s3;
    int s4;
    int  v1;
    int  v2;
    
    tap(int s1,int s2,int s3,int s4)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
   tap(int v1,int v2)
   {
        this.v1=v1;
        this.v2=v2;
   }
    public static void main(String args[])
    {
        tap t1=new tap(10,20,30,30);
     
       int p1=t1.s1;
          tap t2=new tap(p1,30);
      
        System.out.println("value of t1:"+t1.s1);
        System.out.println("value of t1:"+t1.s2);
        System.out.println("value of t1:"+t1.s3);
        System.out.println("value of t1:"+t1.s4);

        System.out.println("value of t2"+t2.v1);
        System.out.println("value of t2"+t2.v2);
    
       // System.out.println("value of s4:"+t2.v4);
    }
}