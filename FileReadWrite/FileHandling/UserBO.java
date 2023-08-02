package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserBO {
    public List<User> readFromFile(BufferedReader br) throws IOException {
        List<User> userlist = new ArrayList<>();
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] val = line.split(",");
                userlist.add(new User(val[0], val[1], val[2], val[3]));
            }
        } catch (IOException e) {
            System.out.println("The list is empty");
        }
        return userlist;
    }

    public void display(List<User> list) {
        System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
        for (User u : list) {
            System.out.printf("%-15s %-20s %-15s %s\n", u.getName(), u.getEmail(), u.getUsername(), u.getPassword());
        }
    }
}
