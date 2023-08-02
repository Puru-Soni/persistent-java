package MultiThread.CityCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int u = sc.nextInt();
        sc.nextLine();

        List<User> userList = new ArrayList<>();

        for (int i = 1; i <= u; i++) {
            System.out.println("Enter the details of user " + i);
            String[] data = sc.nextLine().split(",");
            User user = new User(data[0], data[1], data[2], data[3]);
            userList.add(user);
        }

        System.out.println("Enter the number of cities:");
        int c = sc.nextInt();
        sc.nextLine();

        StringBuilder res = new StringBuilder();

        for (int i = 1; i <= c; i++) {
            System.out.println("Enter the name of city " + i);

            String cityName = sc.nextLine();
            CityCount city = new CityCount(cityName, userList);

            city.start();
            try {
                city.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            res.append(cityName + "--" + city.getCount());
            if (i != c)
                res.append("\n");
        }
        System.out.println(res.toString());
    }
}
