class laptop
{
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    laptop()
    {
        this.s1=15;
        this.s2=20;
    }
    /**
     * @param s1 the s1 to set
     */
    public void setS1(int s3) {
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
        laptop l1=new laptop();
        l1.setS1(30);
        l1.setS4(40);

        System.out.println("value of s1:"+l1.s1);
        System.out.println("value of s2:"+l1.s2);
        System.out.println("value of s3:"+l1.s3);
        System.out.println("value of s4:"+l1.s4);
    }
}