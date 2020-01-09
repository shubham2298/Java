 class Person 
{
     String name;
     Person()
     {
         System.out.println("default");
     }
     Person (String name)
    {
        this.name = name;
    }
}
class Employee extends Person
{
    
     int empid;
     String deptname;
     Employee(String name,int empid,String deptname)
    {
        ///super();
        super(name);
        this.empid=empid;
        this.deptname=deptname;
    }

    void display()
    {
        System.out.println("name is:"+name);
        System.out.println("EMPID is:"+empid);
        System.out.println("Dept name is:"+deptname);
    }
    public static void main(String args[])
    {
        Employee e1=new Employee("Shubham",100,"COMP");
        e1.display();
    }       
    
}