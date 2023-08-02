package duplicateMobileNoException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact details");
        String[] str = br.readLine().trim().split(",");
        // fill the code
        try {
            ContactBO.validate(str[0], str[1]);
            Contact c = new Contact(str[0], str[1], str[2], str[3], str[4]);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
