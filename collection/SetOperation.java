import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SetOperation {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        CarOutlet a = new CarOutlet();
        char choice = 'y';
        while (choice == 'y') {
            System.out.println("############## CAR Inventory System ###############");

            System.out.println("Enter your name : ");
            System.out.println("1. Submit details of car : ");
            System.out.println("2. Show Details of car : ");
            System.out.println("3. Delete details of car : ");
            System.out.println("4. Search the car availability : ");
            System.out.println("5. Update the existing entry : ");
            System.out.println("6. Car booking : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    a.askForDetails("Store");
                    break;
                case 2:
                    a.displayDetails();
                    break;
                case 3:
                    System.out.println("Enter the name of model name to delete: ");
                    String model_name = br.readLine();
                    a.deleteEntry(model_name);
                    break;
                case 4:
                    System.out.println("Enter the name of model you want to Search: ");
                    String name_of_model = br.readLine();
                    a.searchDetail(name_of_model);
                    break;
                case 5:
                    System.out.println("Enter the name of model you want to Update details: ");
                    String name_model = br.readLine();
                    a.updateEntry(name_model);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("================Welcome to store================");
                    a.bookCar();

            }
            System.out.print("Want to add more details.");
            choice = sc.next().toLowerCase().charAt(0);
        }
    }

}