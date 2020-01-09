 class EncapsulationDemo{
     private String empame;
     public int empAge;
    
     public String getEmpName(){
      return empName;
     }
 public int getEmpAge(){
     return empAge;
     }
     public void setEmpAge(int newValue){
     empAge = newValue;
     }
 public void setEmpName(String newValue){
     empName = newValue;
     }
     }
     public class EncapsTest{
     public static void main(String args[]){
     EncapsulationDemo obj = new EncapsulationDemo();
     obj.setEmpName("Ajay");
     obj.setEmpAge(32);
    
     System.out.println("Employee Name: " + obj.getEmpName());
     System.out.println("Employee Age: " + obj.getEmpAge());
    
     obj.empName = "Smita";
     obj.empAge = 33;
    
     System.out.println("New Employee Name: " + obj.empName);
     System.out.println("New Employee Age: " + obj.empAge);
     }
     }
        