class student
{
    int roll;
    String name;
    String div;
    student(int roll,String name,String div)
    {
        this.roll=roll;
        this.name=name;
        this.div=div;
    }
    public static void main(String args[])
    {
        student s1=new student(10,"shubham", "E");
        System.out.println("ROLL NO "+s1.roll);
        System.out.println("Student name "+s1.name);
        System.out.println("Student Div "+s1.div);
    }
}