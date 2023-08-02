package CloneMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        List<Complaint> complaintList = new ArrayList<>();
        String addAnother = "no";
        int size;

        do {
            size = complaintList.size();
            Customer myCustomer;
        
            System.out.println("Enter the customer name");
            String name = sc.nextLine();
        
            if (name.isEmpty() || name == "") {
                System.out.println("Same customer");
                myCustomer = (Customer) complaintList.get(size - 1).customer.clone();
            } else {
                System.out.println("Enter the id");
                String id = sc.nextLine();
                System.out.println("Enter the country");
                String country = sc.nextLine();
                myCustomer = new Customer(name, id, country);
            }
            System.out.println("Enter the complaint");
            String complaint = sc.nextLine();
            complaintList.add(new Complaint(complaint, myCustomer));

            System.out.println("Add another complaint ??");
            addAnother = sc.nextLine();
        } while (addAnother.equals("yes"));

        System.err.println("Complaint Details");
        for (Complaint c : complaintList) {
            c.display();
        }
    }
}
