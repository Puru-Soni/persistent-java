package FileWriting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws IOException {
        for (User u : userList) {
            bw.write(u.getName() + "," + u.getMobileNumber() + "," + u.getUsername() + "," + u.getPassword());
            bw.newLine();
        }
    }
}
