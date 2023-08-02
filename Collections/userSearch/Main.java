package userSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> userList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of users:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter details of user" + i);
            System.out.println("Username:");
            String name = sc.nextLine();
            System.out.println("Bank name:");
            String bank = sc.nextLine();

            users.add(new User(name, bank));
        }

        System.out.println("Enter username(Expire in one month) seperated by comma");
        String names[] = sc.nextLine().split(",");

        for (int i = 0; i < names.length; i++) {
            userList.add(new User(names[i], null));
        }

        users.retainAll(userList);
        System.out.println("Users going to expire within a month");
        Collections.sort(users);

        for (int i = 0; i < users.size(); i++) {
            System.out.println("User " + (i + 1));
            System.out.println("User Name = " + users.get(i).getUsername());
            System.out.println("Bank Name = " + users.get(i).getBankname());
        }
    }
}
