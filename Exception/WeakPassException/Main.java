package WeakPassException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user details");
        String[] details = sc.nextLine().split(",");

        User u = new User(details[0], details[1], details[2], details[3]);
        System.out.println(u);
        try {
            UserBO.validate(u);
            System.out.println(u);
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }

}
