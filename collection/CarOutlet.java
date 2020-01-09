
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CarOutlet {
    Scanner sc=new Scanner(System.in);
    String Name,requirements;
    int age;String model;
    Map<String,Map<String,String>> oneCar=new HashMap<String,Map<String,String>>();
    void askForDetails(String requirement) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name sir/madam: ");
        Name = br.readLine();
        if(requirement.contentEquals("Store")) {
            System.out.println("Please tell us your car details :");
            System.out.print("Car model name :");
            model=br.readLine();
            System.out.print("Car age in years :");
            int ageOfCar=sc.nextInt();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            storeDetails(Name,model,ageOfCar,now);
        }
    }

    Map<String,Map<String,String>> storeDetails(String name,String model,int age,LocalDateTime now) {
        Map<String,String> details=new HashMap<>();
        if(oneCar.containsKey(model)) {
            System.out.println("Already available in store");
        }
        else {
            details.put("Owner",name.toLowerCase());details.put("Age",Integer.toString(age));details.put("Time",now.toString());
            String  m = model.toLowerCase();
            oneCar.put(m, details);
            System.out.println(model+":\n"+oneCar.get(m));
        }
        return oneCar;
    }
    void searchDetail(String model){
        if(oneCar.containsKey(model.toLowerCase())) {
            System.out.println(model+": "+oneCar.get(model.toLowerCase()));
        }
        else {
            System.out.println("The car ur looking for is not available,Please try again.");
        }
    }
    void displayDetails() {
        System.out.println(oneCar.entrySet());
    }
    void deleteEntry(String model) {
        System.out.println("Deleted entry is:");
        System.out.println(model.toLowerCase()+" "+oneCar.get(model.toLowerCase()));
        oneCar.remove(model.toLowerCase());
    }
    void updateEntry(String model) {
        System.out.println("Ok.You want to update details of this model ");
        if(sc.next().toLowerCase().charAt(0)=='y') {
            if(oneCar.containsKey(model.toLowerCase())) {
                System.out.println("What do you want to update from below: ");

                System.out.println("What details you want to update enter name listed below\n"+
                        "1. Age\n"+
                        "2. Owner");
                String chngeKey = sc.next();
                Map<String,String> s= oneCar.get(model);
                System.out.println(chngeKey+": "+s.get(chngeKey));
                System.out.println("Okay, please enter the updated value of "+model);
                String chngedValue = sc.next();

                s.put(chngeKey, chngedValue);
                oneCar.put(model.toLowerCase(),s);

                System.out.println("Update Successfully..");
            }
        }
        else {
            System.out.println("please find the model name below and update it. ");
            System.out.println(oneCar.keySet());
        }
    }
    Map<Integer,String> iter(Set<String> KeySet){
        Iterator<String> itr = KeySet.iterator();
        int l=0;
        Map<Integer,String> choices=new HashMap<>();
        while(itr.hasNext()) {
            l=l+1;
            System.out.println(l+". "+itr.next());
            choices.put(l, itr.next());
        }
        return choices;
    }

    public void bookCar() throws IOException {

        System.out.println();
        Map<String,Map<String,Map<String,String>>> bookedDetails = new HashMap<>();

        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please tell us your name sir/madam");
        String custName = br1.readLine();

        System.out.println("Okay, Welcome to our store sir/madam\n\n"+"Do you want to bye a car? ");
        char c = 'y';
        if(sc.next().toLowerCase().charAt(0) == c) {
            System.out.println("Sir/Madam we have these cars available now.\n\n"+"Please select model.");
            Map<Integer,String> s1 = iter(oneCar.keySet());
            for(Map.Entry<Integer, String> entry:s1.entrySet()) {
                System.out.println();
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            String carName= br1.readLine();
            Map<String,Map<String,String>> t = new HashMap<>();
            t.put(carName,oneCar.get(carName.toLowerCase()));
            bookedDetails.put(custName,t);
            System.out.println();
            System.out.println("Hello!!  "+carName+" is successfully booked by you.");
            oneCar.remove(carName.toLowerCase());
        }
    }
}