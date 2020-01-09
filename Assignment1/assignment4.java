class printer
{
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    printer(int s1,int s2)
    {
        this.s1=s1;
        this.s2=s2;
        }
    /**
     * @param s1 the s1 to set
     */
    public void setS3(int s3) {
        this.s3 = s3;
    }
    /**
     * @param s4 the s4 to set
     */
    public void setS4(int s4) {
        this.s4 = s4;
    }
    public static void main(String args[])
    {
        printer p1=new printer(10,20);
        p1.setS3(30);
        p1.setS4(40);

        System.out.println("value of s1:"+p1.s1);
        System.out.println("value of s2:"+p1.s2);
        System.out.println("value of s3:"+p1.s3);
        System.out.println("value of s4:"+p1.s4);
    }
}