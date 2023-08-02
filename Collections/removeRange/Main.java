package removeRange;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of User details to be added");
        int n = sc.nextInt();
        sc.nextLine();

        UserBO u = UserBO.getList();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the user " + i + " detail in csv format");
            String[] userdata = sc.nextLine().split(",");
            u.add(new User(userdata[0], userdata[1], userdata[2], userdata[3]));
        }

        System.out.println("Name                Contact Number      Username            Email");
        for (User user : u) {
            user.display();
        }

        System.out.println("Enter the range to be removed from array list");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            u.removeUser(n1, n2);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Name                Contact Number      Username            Email");
        for (User user : u) {
            user.display();
        }
    }
}
