package FileWriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users");
        int n = Integer.parseInt(br.readLine());

        ArrayList<User> userlist = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of user :" + i);
            String data[] = br.readLine().trim().split(",");
            userlist.add(new User(data[0], data[1], data[2], data[3]));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("FileWriting/input.csv"));
        UserBO ob = new UserBO();
        ob.writeFile(userlist, bw);
        bw.close();
    }
}